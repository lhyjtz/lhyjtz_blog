package com.lcyjtz.controller;

import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import com.lcyjtz.api.WEBService;
import com.lcyjtz.entity.ArticleType;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @autHor LHYJTZ
 * @data 2021年04月13日 10:04
 */
@RestController
@RequestMapping("/tag")
public class TagController {
    private WEBService webService;

    @Autowired
    public void setWebService(WEBService webService) {
        this.webService = webService;
    }

    @ApiOperation("获取标签列表")
    @GetMapping("/getTagList")
    public Result getTagList() {
        List<ArticleType> list = webService.TypeList();
        if (list.size() > 0) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("data", list);
        }
        return Result.error().codeAndMessage(ResultInfo.NOT_FOUND);
    }
}
