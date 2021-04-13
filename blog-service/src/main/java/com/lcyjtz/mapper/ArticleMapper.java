package com.lcyjtz.mapper;

import com.lcyjtz.dto.ArticleListDTO;
import com.lcyjtz.entity.Article;
import com.lcyjtz.entity.ArticleExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ArticleMapper {
    int countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(Integer articleid);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    List<Article> selectByExample(ArticleExample example);

    Article selectByPrimaryKey(Integer articleid);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    int saveOrUpdateConArticleTag(@Param("articleID")Integer articleID,@Param("tagIdList") List<Integer> tagIdList);

    List<ArticleListDTO> ArticleListPage(@Param("current")Integer current, @Param("size")Integer size, @Param("articleTitle")String articleTitle);
}