package com.lcyjtz.mapper;

import com.lcyjtz.entity.ArticleCategcry;
import com.lcyjtz.entity.ArticleCategcryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleCategcryMapper {
    int countByExample(ArticleCategcryExample example);

    int deleteByExample(ArticleCategcryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArticleCategcry record);

    int insertSelective(ArticleCategcry record);

    List<ArticleCategcry> selectByExample(ArticleCategcryExample example);

    ArticleCategcry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArticleCategcry record, @Param("example") ArticleCategcryExample example);

    int updateByExample(@Param("record") ArticleCategcry record, @Param("example") ArticleCategcryExample example);

    int updateByPrimaryKeySelective(ArticleCategcry record);

    int updateByPrimaryKey(ArticleCategcry record);
}