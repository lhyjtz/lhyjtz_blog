package com.lcyjtz.Service;

import com.lcyjtz.api.WEBService;

import com.lcyjtz.dto.RoleListDTO;
import com.lcyjtz.dto.UserDTO;
import com.lcyjtz.entity.*;
import com.lcyjtz.mapper.*;
import com.lcyjtz.vo.UserQueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WEBServiceImpl implements WEBService {

    private VisitorMapper visitorMapper;
    private MenuMapper menuMapper;
    private PowerMapper powerMapper;
    private ArticleCategcryMapper articleCategcryMapper;
    private ArticleTypeMapper articleTypeMapper;

    @Autowired(required = false)
    public void setMapper(ArticleTypeMapper articleTypeMapper) {
        this.articleTypeMapper = articleTypeMapper;
    }

    @Autowired(required = false)
    public void setMapper(VisitorMapper visitorMapper) {
        this.visitorMapper = visitorMapper;
    }

    @Autowired(required = false)
    public void setMenuMapper(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    @Autowired(required = false)
    public void setPowerMapper(PowerMapper powerMapper) {
        this.powerMapper = powerMapper;
    }

    @Autowired(required = false)
    public void setArticleCategcryMapper(ArticleCategcryMapper articleCategcryMapper) {
        this.articleCategcryMapper = articleCategcryMapper;
    }

    @Override
    public Visitor getUserByID(Integer visitorID) {
        return visitorMapper.selectByPrimaryKey(visitorID);
    }

    @Override
    public List<Visitor> getAllUser() {
        return visitorMapper.selectByExample(null);
    }

    @Override
    public Visitor getUserName(String username) {
        return visitorMapper.selectByUserName(username);
    }

    @Override
    public List<String> GetUserRolesByUserID(Integer VisitorID) {
        return visitorMapper.GetUserRolesByUserID(VisitorID);
    }

    @Override
    public List<UserDTO> getUserByCondition(UserQueryVO userQueryVO) {
        userQueryVO.setCurrent((userQueryVO.getCurrent() - 1) * userQueryVO.getSize());
        return visitorMapper.getUserByCondition(userQueryVO);
    }

    @Override
    public List<RoleListDTO> getRoleList() {
        List<RoleListDTO> roleListDTOList = powerMapper.getRoleList();
        return roleListDTOList;
    }

    @Override
    public Integer count() {
        return visitorMapper.getcount();
    }

    @Override
    public int DeleteUser(Integer id) {
        return visitorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Visitor visitor) {
        return visitorMapper.insert(visitor);
    }

    @Override
    public List<ArticleCategcry> list() {
        return articleCategcryMapper.selectByExample(null);
    }

    @Override
    public List<ArticleType> TypeList() {
        return articleTypeMapper.selectByExample(null);
    }

    @Override
    public List<Menu> getAllMenuListByUserRole(String roleName) {
        List<Menu> menuList = menuMapper.getAllMenuList(roleName);
        List<Menu> menuListDTO = new ArrayList<>();
        int len = menuList.size();
        int[] used = new int[menuList.size()];
        Arrays.fill(used, 0);
        for (int i = 0; i < len; i++) {
            if (menuList.get(i).getParentId() == null || menuList.get(i).getParentId() == 0) {
                used[i] = 1;
                findChildren(menuList.get(i), menuList, used);
                menuListDTO.add(menuList.get(i));
            }
        }
        return menuListDTO;
    }


    private void findChildren(Menu menu, List<Menu> menuList, int[] used) {
        for (int i = 0; i < menuList.size(); i++) {
            if (used[i] == 1) {
                continue;
            }
            if (menuList.get(i).getParentId() == menu.getId()) {
                used[i] = 1;
                menu.getChildren().add(menuList.get(i));
            }
        }
        if (menu.getChildren().size() == 0) {
            return;
        }
        for (Menu menu1 : menu.getChildren()) {
            findChildren(menu1, menuList, used);
        }
    }
}
