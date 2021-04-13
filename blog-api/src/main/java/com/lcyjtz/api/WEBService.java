package com.lcyjtz.api;

import com.lcyjtz.dto.RoleListDTO;
import com.lcyjtz.dto.UserDTO;
import com.lcyjtz.entity.ArticleCategcry;
import com.lcyjtz.entity.ArticleType;
import com.lcyjtz.entity.Menu;
import com.lcyjtz.entity.Visitor;
import com.lcyjtz.vo.ArticleAddVO;
import com.lcyjtz.vo.UserQueryVO;

import java.util.List;

public interface WEBService {
    Visitor getUserByID(Integer id);

    List<Visitor> getAllUser();

    Visitor getUserName(String username);

    //获取分类列表
    List<ArticleCategcry> list();

    //获取标签列表
    List<ArticleType> TypeList();

    List<String> GetUserRolesByUserID(Integer VisitorID);

    List<Menu> getAllMenuListByUserRole(String roleName);

    List<UserDTO> getUserByCondition(UserQueryVO userQueryVO);

    List<RoleListDTO> getRoleList();

    Integer count();

    //删除用户
    int DeleteUser(Integer id);

    //添加用户
    int insert(Visitor visitor);

    //添加文章
    int insertArticle(ArticleAddVO articleAddVO);

}
