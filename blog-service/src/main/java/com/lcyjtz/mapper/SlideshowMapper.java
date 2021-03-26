package com.lcyjtz.mapper;

import com.lcyjtz.entity.Slideshow;
import com.lcyjtz.entity.SlideshowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlideshowMapper {
    int countByExample(SlideshowExample example);

    int deleteByExample(SlideshowExample example);

    int insert(Slideshow record);

    int insertSelective(Slideshow record);

    List<Slideshow> selectByExample(SlideshowExample example);

    int updateByExampleSelective(@Param("record") Slideshow record, @Param("example") SlideshowExample example);

    int updateByExample(@Param("record") Slideshow record, @Param("example") SlideshowExample example);
}