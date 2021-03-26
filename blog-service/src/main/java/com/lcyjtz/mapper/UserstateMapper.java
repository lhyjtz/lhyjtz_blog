package com.lcyjtz.mapper;

import com.lcyjtz.entity.Userstate;
import com.lcyjtz.entity.UserstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserstateMapper {
    int countByExample(UserstateExample example);

    int deleteByExample(UserstateExample example);

    int insert(Userstate record);

    int insertSelective(Userstate record);

    List<Userstate> selectByExample(UserstateExample example);

    int updateByExampleSelective(@Param("record") Userstate record, @Param("example") UserstateExample example);

    int updateByExample(@Param("record") Userstate record, @Param("example") UserstateExample example);
}