package com.lcyjtz.api;

import com.lcyjtz.dto.RoleListDTO;
import com.lcyjtz.dto.UserDTO;
import com.lcyjtz.entity.Menu;
import com.lcyjtz.entity.Visitor;
import com.lcyjtz.vo.UserQueryVO;

import java.util.List;

public interface WEBService {
    Visitor getUserByID(Integer id);

    List<Visitor> getAllUser();

    Visitor getUserName(String username);

    List<String> GetUserRolesByUserID(Integer VisitorID);

    List<Menu> getAllMenuListByUserRole(String roleName);

    List<UserDTO> getUserByCondition(UserQueryVO userQueryVO);

    List<RoleListDTO> getRoleList();

    Integer count();

    //删除用户
    int DeleteUser(Integer id);
}
