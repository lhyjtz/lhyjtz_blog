package com.lcyjtz.controller;

import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import com.lcyjtz.api.WEBService;
import com.lcyjtz.dto.UserDTO;
import com.lcyjtz.vo.UserQueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private WEBService webService;

    @Autowired(required = false)
    public void setMapper(WEBService webService) {
        this.webService = webService;
    }

    @GetMapping("/getUserList")
    public Result getUserList(UserQueryVO userQueryVO) {
        System.out.println(userQueryVO);
        List<UserDTO> userDTOList = webService.getUserByCondition(userQueryVO);
        int count= webService.count();
        System.out.println(count);
        if (userDTOList != null) {
            int total = userDTOList.size();
            return Result.success().data("userList", userDTOList).data("total",count);
        }
        return Result.error().codeAndMessage(ResultInfo.GLOBAL_ERROR);
    }
}
