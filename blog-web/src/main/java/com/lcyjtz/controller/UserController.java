package com.lcyjtz.controller;

import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import com.lcyjtz.api.WEBService;
import com.lcyjtz.dto.UserDTO;
import com.lcyjtz.entity.Visitor;
import com.lcyjtz.vo.UserQueryVO;
import com.mysql.cj.xdevapi.JsonArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        List<UserDTO> userDTOList = webService.getUserByCondition(userQueryVO);
        int count = webService.count();
        if (userDTOList != null) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("userList", userDTOList).data("total", count);
        }
        return Result.error().codeAndMessage(ResultInfo.GLOBAL_ERROR);
    }

    @DeleteMapping("/deleteByUserId")
    public Result deleteUser(Integer id) {
        System.out.println(id);
        if (webService.DeleteUser(id) > 0) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESSFULLY_DELETE);
        }
        return Result.error().codeAndMessage(ResultInfo.DELETE_FAILED);
    }

    @PostMapping("/addUser")
    public Result addUser(Visitor visitor) throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
//        Date date = new Date();
//        visitor.setCreatetime(sdf.format(date));
//        System.out.println(visitor);
        if (webService.insert(visitor) > 0) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESS);
        }
        return Result.error().codeAndMessage(ResultInfo.GLOBAL_ERROR);
    }
}
