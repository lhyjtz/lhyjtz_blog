package com.lcyjtz.auth;


import com.lcyjtz.api.WEBService;
import com.lcyjtz.entity.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private WEBService testService;

    @Autowired(required = false)
    public void setMapper(WEBService testService) {
        this.testService = testService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //查找到对应用户
        Visitor visitor = testService.getUserName(username);
        if (visitor == null) {
            throw new UsernameNotFoundException("没有用户");
        }
        //获取用户角色
        MyUserDetails userDetails = new MyUserDetails();
        userDetails.setVisitor(visitor);
        userDetails.setUsername(username);
        userDetails.setPassword("{noop}" + visitor.getVisitorpwd());
        //获取用户角色
        List<String> roles = testService.GetUserRolesByUserID(visitor.getVisitorroleid());
        if (roles.size() >= 0) {
            Set<GrantedAuthority> authorities = new HashSet<>();
            SimpleGrantedAuthority authority;
            for (String role : roles) {
                authority = new SimpleGrantedAuthority(role);
                authorities.add(authority);
            }
            userDetails.setAuthorities(authorities);
        }
        return userDetails;
    }
}
