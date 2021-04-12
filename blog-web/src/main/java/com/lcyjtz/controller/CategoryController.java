package com.lcyjtz.controller;

import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import com.lcyjtz.api.WEBService;
import com.lcyjtz.entity.Article;
import com.lcyjtz.entity.ArticleCategcry;
import com.lcyjtz.entity.ArticleType;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

/**
 * @autHor LHYJTZ
 * @data 2021年04月12日 17:47
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    private WEBService webService;

    @Autowired
    public void setWebService(WEBService webService) {
        this.webService = webService;
    }


    @ApiOperation("获取标签列表")
    @GetMapping("/getCategoryList")
    public Result getCategory() {
        List<ArticleCategcry> list = webService.list();
        if (list.size() > 0) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("data", list);
        }
        return Result.error().codeAndMessage(ResultInfo.GLOBAL_ERROR);
    }

    @ApiOperation("获取分类列表")
    @GetMapping("/getTagList")
    public Result getTagList() {
        List<ArticleType> list = webService.TypeList();
        if (list.size() > 0) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("data", list);
        }
        return Result.error().codeAndMessage(ResultInfo.GLOBAL_ERROR);
    }
}
