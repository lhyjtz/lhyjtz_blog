package com.lcyjtz.authority;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

@Component
public class MyFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    private boolean supports = true;

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        final HttpServletRequest request = ((FilterInvocation) object).getRequest();
        String uri = request.getRequestURI();
        String method = request.getMethod();
        AntPathMatcher matcher = new AntPathMatcher();
        //匹配路径
        boolean b1 = matcher.match("/**", uri);
        boolean b2 = method.toUpperCase().equals("数据库查找的当前路径以及方法");
      //  if (b1 && b2) {
            return SecurityConfig.createList("admin","developer");
     //   }
       // return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return supports;
    }
}
