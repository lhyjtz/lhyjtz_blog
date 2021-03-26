package com.lcyjtz.controller;

import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import com.lcyjtz.api.WEBService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试模块")
public class TestController {

    private final WEBService webService;

    @Autowired
    private TestController(WEBService webService) {
        this.webService = webService;
    }

    @GetMapping("/test")
    @ApiOperation("2测试接口")
    public Result test() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        AbstractAuthenticationToken test = (AbstractAuthenticationToken) authentication;
        Object details = test.getDetails();
        System.out.println(details);
        UsernamePasswordAuthenticationToken test2 = (UsernamePasswordAuthenticationToken) authentication;
        Object principal = test2.getPrincipal();
        System.out.println(principal);
        Object credentials = test2.getCredentials();
        System.out.println(credentials);
        return Result.success().codeAndMessage(ResultInfo.SUCCESS);
        // Visitor user = testService.getUserByID(1);
        // return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("data", user);
//        if (!StringUtils.isEmpty(test)) {
//            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("data3", test);
//        }
//        return Result.error().codeAndMessage(ResultInfo.NOT_FOUND);
    }
}
