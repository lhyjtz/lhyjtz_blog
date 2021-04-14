package com.lcyjtz.api;

import com.lcyjtz.dto.*;
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

    //修改用户
    // int UpdateByUseID(UserUpdateDTO userUpdateDTO);

    //修改用户状态
    boolean UpdateStateByUseID(Integer id, boolean flag);

    //添加用户
    int insert(Visitor visitor);

    //文章列表
    List<UserListDTO> ListUserRole(Integer current, Integer size, String visitorname);

    //添加文章
    int insertArticle(ArticleAddVO articleAddVO);

    //文章列表
    List<ArticleListDTO> listArticlePage(Integer current, Integer size, String articleTitle);

}
