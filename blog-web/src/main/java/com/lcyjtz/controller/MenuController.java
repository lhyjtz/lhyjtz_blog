package com.lcyjtz.controller;

import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import com.lcyjtz.api.WEBService;
import com.lcyjtz.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    private WEBService webService;

    @Autowired(required = false)
    public void setMapper(WEBService webService) {
        this.webService = webService;
    }

    @GetMapping("/getMenuList")
    public Result getMenuListByUserRole(@RequestParam("userRole") String roleName) {
        List<Menu> menuDTOList = webService.getAllMenuListByUserRole(roleName);
        if (menuDTOList.size() > 0) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("menuList", menuDTOList);
        } else {
            return Result.error().codeAndMessage(ResultInfo.GLOBAL_ERROR);
        }

    }
}
