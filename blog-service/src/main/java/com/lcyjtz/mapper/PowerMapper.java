package com.lcyjtz.mapper;

import com.lcyjtz.dto.RoleListDTO;
import com.lcyjtz.entity.Power;
import com.lcyjtz.entity.PowerExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PowerMapper {
    int countByExample(PowerExample example);

    int deleteByExample(PowerExample example);

    int deleteByPrimaryKey(Integer powerid);

    int insert(Power record);

    int insertSelective(Power record);

    int SelectRoleID(@Param("powerType")String powerType);

    List<Power> selectByExample(PowerExample example);

    List<RoleListDTO> getRoleList();

    Power selectByPrimaryKey(Integer powerid);

    int updateByExampleSelective(@Param("record") Power record, @Param("example") PowerExample example);

    int updateByExample(@Param("record") Power record, @Param("example") PowerExample example);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);
}