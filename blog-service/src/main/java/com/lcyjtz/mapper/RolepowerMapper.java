package com.lcyjtz.mapper;

import com.lcyjtz.entity.Rolepower;
import com.lcyjtz.entity.RolepowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolepowerMapper {
    int countByExample(RolepowerExample example);

    int deleteByExample(RolepowerExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(Rolepower record);

    int insertSelective(Rolepower record);

    List<Rolepower> selectByExample(RolepowerExample example);

    Rolepower selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") Rolepower record, @Param("example") RolepowerExample example);

    int updateByExample(@Param("record") Rolepower record, @Param("example") RolepowerExample example);

    int updateByPrimaryKeySelective(Rolepower record);

    int updateByPrimaryKey(Rolepower record);
}