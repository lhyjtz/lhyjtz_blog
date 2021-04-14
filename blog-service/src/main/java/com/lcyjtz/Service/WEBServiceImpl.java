package com.lcyjtz.Service;

import com.lcyjtz.api.WEBService;
import com.lcyjtz.dto.*;
import com.lcyjtz.entity.*;
import com.lcyjtz.mapper.*;
import com.lcyjtz.vo.ArticleAddVO;
import com.lcyjtz.vo.UserQueryVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class WEBServiceImpl implements WEBService {

    private VisitorMapper visitorMapper;
    private MenuMapper menuMapper;
    private PowerMapper powerMapper;
    private ArticleCategcryMapper articleCategcryMapper;
    private ArticleTypeMapper articleTypeMapper;
    private ArticleMapper articleMapper;

    @Autowired(required = false)
    public void setMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

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
    public List<UserListDTO> ListUserRole(Integer current, Integer size, String visitorname) {
        current = (current - 1) * size;
        List<UserListDTO> userListDTOS = visitorMapper.UserListPage(current, size, visitorname);
        System.out.println(userListDTOS);
        if (userListDTOS.size() <= 0) {
            return null;
        }
        return userListDTOS;
    }

    @Override
    public List<ArticleCategcry> list() {
        return articleCategcryMapper.selectByExample(null);
    }

    @Override
    public List<ArticleType> TypeList() {
        return articleTypeMapper.selectByExample(null);
    }

    /*
      @Override
      public int UpdateByUseID(UserUpdateDTO userUpdateDTO) {
          Visitor visitor = new Visitor(userUpdateDTO);
          String powerType = userUpdateDTO.getUserAuth();
          Integer RoleID = powerMapper.SelectRoleID(powerType);
          Date time = null;
          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
          try {
              time = dateFormat.parse(dateFormat.format(new Date()));
          } catch (ParseException e) {
              e.printStackTrace();
          }
          visitor.setVisitorroleid(RoleID);
          visitor.setUpdatetime(time);
          return visitorMapper.updateByPrimaryKeySelective(visitor);
      }
     */
    @Override
    public boolean UpdateStateByUseID(Integer id, boolean flag) {
        int i = 0;
        if (flag) {
            i = 1;
        }
        if (visitorMapper.UpdateStateByUseID(id, i) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public int insertArticle(ArticleAddVO articleAddVO) {
        Date data = new Date();
        Integer id = articleAddVO.getArticleid();
        Article article = new Article(articleAddVO);
        article.setArticledata(data.toString());
        boolean save;
        if (null == id) {
            save = articleMapper.insert(article) >= 1;
        } else {
            save = articleMapper.updateByPrimaryKey(article) >= 1;
        }
        if (!save) {
            return -1;
        }
        List<Integer> tagIdList = articleAddVO.getTagIdList();
        Integer articleID = article.getArticleid();
        int i = this.articleMapper.saveOrUpdateConArticleTag(articleID, tagIdList);
        if (i < 0) {
            return -1;
        }
        return i;
    }

    @Override
    public List<ArticleListDTO> listArticlePage(Integer current, Integer size, String articleTitle) {
        current = (current - 1) * size;
        List<ArticleListDTO> articleListDTOS = articleMapper.ArticleListPage(current, size, articleTitle);
        System.out.println(articleListDTOS);
        if (articleListDTOS.size() <= 0) {
            return null;
        }
        return articleListDTOS;
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
