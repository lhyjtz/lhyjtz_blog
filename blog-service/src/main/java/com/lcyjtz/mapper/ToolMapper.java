package com.lcyjtz.mapper;

import com.lcyjtz.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ToolMapper {
    List<Menu> getAllMenuList(String roleName);
}
