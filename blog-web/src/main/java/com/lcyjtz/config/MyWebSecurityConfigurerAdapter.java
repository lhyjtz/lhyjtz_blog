package com.lcyjtz.config;

import com.lcyjtz.auth.MyUserDetailsService;
import com.lcyjtz.auth.MyUsernamePasswordAuthenticationFilter;
import com.lcyjtz.authority.MyAccessDecisionManager;
import com.lcyjtz.authority.MyFilterInvocationSecurityMetadataSource;
import com.lcyjtz.handler.auth.MyAccessDeniedHandler;
import com.lcyjtz.handler.auth.MyAuthenticationEntryPoint;
import com.lcyjtz.handler.auth.MyAuthenticationFailureHandler;
import com.lcyjtz.handler.auth.MyAuthenticationSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
public class MyWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

    private MyUserDetailsService myUserDetailsService;
    private MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;
    private MyAuthenticationFailureHandler myAuthenticationFailureHandler;
    private MyAccessDecisionManager myAccessDecisionManager;
    private MyFilterInvocationSecurityMetadataSource myFilterInvocationSecurityMetadataSource;
    private MyAccessDeniedHandler myAccessDeniedHandler;
    private MyAuthenticationEntryPoint myAuthenticationEntryPoint;

    @Autowired
    public void setMyUserDetailsService(MyAuthenticationEntryPoint myAuthenticationEntryPoint, MyAccessDeniedHandler myAccessDeniedHandler, MyFilterInvocationSecurityMetadataSource myFilterInvocationSecurityMetadataSource, MyAccessDecisionManager myAccessDecisionManager, MyUserDetailsService myUserDetailsService, MyAuthenticationSuccessHandler myAuthenticationSuccessHandler, MyAuthenticationFailureHandler myAuthenticationFailureHandler) {
        this.myUserDetailsService = myUserDetailsService;
        this.myAuthenticationSuccessHandler = myAuthenticationSuccessHandler;
        this.myAuthenticationFailureHandler = myAuthenticationFailureHandler;
        this.myAccessDecisionManager = myAccessDecisionManager;
        this.myFilterInvocationSecurityMetadataSource = myFilterInvocationSecurityMetadataSource;
        this.myAccessDeniedHandler = myAccessDeniedHandler;
        this.myAuthenticationEntryPoint = myAuthenticationEntryPoint;

    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginProcessingUrl("/login");
        http.csrf().disable().exceptionHandling();
        http.addFilterAt(myUsernamePasswordAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
        http.authorizeRequests().withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
            @Override
            public <O extends FilterSecurityInterceptor> O postProcess(O object) {
                object.setAccessDecisionManager(myAccessDecisionManager);
                object.setSecurityMetadataSource(myFilterInvocationSecurityMetadataSource);
                return object;
            }
        });
        http.authorizeRequests().anyRequest().authenticated();
        http.exceptionHandling().accessDeniedHandler(myAccessDeniedHandler).authenticationEntryPoint(myAuthenticationEntryPoint);
    }

    @Bean
    public MyUsernamePasswordAuthenticationFilter myUsernamePasswordAuthenticationFilter() throws Exception {
        MyUsernamePasswordAuthenticationFilter myUsernamePasswordAuthenticationFilter = new MyUsernamePasswordAuthenticationFilter();
        myUsernamePasswordAuthenticationFilter.setAuthenticationManager(authenticationManagerBean());
        myUsernamePasswordAuthenticationFilter.setAuthenticationSuccessHandler(myAuthenticationSuccessHandler);
        myUsernamePasswordAuthenticationFilter.setAuthenticationFailureHandler(myAuthenticationFailureHandler);
        return myUsernamePasswordAuthenticationFilter;
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService);
    }
}
