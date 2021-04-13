package com.lcyjtz.controller;

import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import com.lcyjtz.api.WEBService;
import com.lcyjtz.dto.ArticleListDTO;
import com.lcyjtz.vo.ArticleAddVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @ApiOperation("/分页文章查询")
    @GetMapping("/listArticle")
    public Result listArticle(@RequestParam(value = "current", defaultValue = "1", required = true) Integer current,
                              @RequestParam(value = "size", defaultValue = "5", required = true) Integer size,
                              @RequestParam(value = "articleTitle", required = false) String articleTitle) {
        List<ArticleListDTO> articleListDTOS = webService.listArticlePage(current, size, articleTitle);
        return Result.success().data("data", articleListDTOS);
    }

    @ApiOperation("/文章删除")
    @DeleteMapping("/deleteArticleById")
    public Result deleteArticleById(Integer id) {
        return null;
    }
}
