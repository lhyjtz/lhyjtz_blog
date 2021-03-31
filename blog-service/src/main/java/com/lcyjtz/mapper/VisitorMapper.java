package com.lcyjtz.mapper;

import com.lcyjtz.dto.RoleListDTO;
import com.lcyjtz.dto.UserDTO;
import com.lcyjtz.entity.Visitor;
import com.lcyjtz.entity.VisitorExample;

import java.util.List;

import com.lcyjtz.vo.UserQueryVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VisitorMapper {
    int countByExample(VisitorExample example);

    int deleteByExample(VisitorExample example);

    int deleteByPrimaryKey(Integer visitorid);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    Integer getcount();

    List<String> GetUserRolesByUserID(Integer visitorid);

    Visitor selectByUserName(String visitorname);

    List<UserDTO> getUserByCondition(@Param("userQueryVO") UserQueryVO userQueryVO);

    List<Visitor> selectByExample(VisitorExample example);

    Visitor selectByPrimaryKey(Integer visitorid);

    int updateByExampleSelective(@Param("record") Visitor record, @Param("example") VisitorExample example);

    int updateByExample(@Param("record") Visitor record, @Param("example") VisitorExample example);

    int updateByPrimaryKeySelective(Visitor record);

    int updateByPrimaryKey(Visitor record);
}