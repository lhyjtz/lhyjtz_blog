package com.lcyjtz.handler.auth;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import com.lcyjtz.auth.MyUserDetails;
import com.lcyjtz.entity.Visitor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentication) throws IOException, ServletException {
//        System.out.println("cs");
//
//    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        ObjectMapper objectMapper = new ObjectMapper();
        Object principal = authentication.getPrincipal();
        if (principal instanceof UserDetails) {
            MyUserDetails userDetails = (MyUserDetails) principal;
            Visitor visitor = userDetails.getVisitor();
            List<String> roles = new ArrayList<>();
            for (GrantedAuthority role : userDetails.getAuthorities()) {
                roles.add(role.getAuthority());
            }
            httpServletResponse.setContentType("application/json;charset=UTF-8");
            httpServletResponse.getWriter().write(
                    objectMapper.writeValueAsString(Result.success()
                            .codeAndMessage(ResultInfo.LOGIN_SUCCESS)
                            .data("user", visitor).data("roles", roles)));
            System.out.println(objectMapper.writeValueAsString(Result.success()
                    .codeAndMessage(ResultInfo.LOGIN_SUCCESS)
                    .data("user", visitor).data("roles", roles)));
        }
//        System.out.println("成功");
//        response.getWriter().write(
//                JSON.toJSONString(Result.ok())
//                        .code(Result.VERIFY_SUCCESS.getCode())
//                        .message(ResultInfo.VERIFY_SUCCESS.getMessage()).data("user", user)
//     );
    }
}
