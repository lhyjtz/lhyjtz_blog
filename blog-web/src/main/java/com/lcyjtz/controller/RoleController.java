package com.lcyjtz.controller;

import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import com.lcyjtz.Service.WEBServiceImpl;
import com.lcyjtz.api.WEBService;
import com.lcyjtz.dto.RoleListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    private WEBService webService;

    @Autowired
    public void setWebService(WEBService webService) {
        this.webService = webService;
    }

    @GetMapping("/getRoleList")
    public Result getRoleList() {
        List<RoleListDTO> roleListDTOList = webService.getRoleList();
        if (roleListDTOList.size() > 0) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("roleList", roleListDTOList);
        }
        return Result.error();
    }
}
