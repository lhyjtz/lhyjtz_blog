package com.lcyjtz.mapper;

import com.lcyjtz.entity.Blogroll;
import com.lcyjtz.entity.BlogrollExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogrollMapper {
    int countByExample(BlogrollExample example);

    int deleteByExample(BlogrollExample example);

    int insert(Blogroll record);

    int insertSelective(Blogroll record);

    List<Blogroll> selectByExample(BlogrollExample example);

    int updateByExampleSelective(@Param("record") Blogroll record, @Param("example") BlogrollExample example);

    int updateByExample(@Param("record") Blogroll record, @Param("example") BlogrollExample example);
}