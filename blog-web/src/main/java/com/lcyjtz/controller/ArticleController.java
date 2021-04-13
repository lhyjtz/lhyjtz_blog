package com.lcyjtz.controller;

import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import com.lcyjtz.api.WEBService;
import com.lcyjtz.vo.ArticleAddVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autHor LHYJTZ
 * @data 2021年04月13日 10:58
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    private WEBService webService;

    @Autowired
    public void setWebService(WEBService webService) {
        this.webService = webService;
    }

    @ApiOperation("/新增文章或者修改")
    @PostMapping("/saveOrUpdateArticle")
    public Result saveOrUpdateArticle(@RequestBody ArticleAddVO articleAddVO) {
        int i = webService.insertArticle(articleAddVO);
        if (i > 0) {
            System.out.println("cs1");
            return Result.success().codeAndMessage(ResultInfo.SUCCESS);
        } else {
            System.out.println("cs3");
            return Result.success().codeAndMessage(ResultInfo.GLOBAL_ERROR);
        }
    }
}
