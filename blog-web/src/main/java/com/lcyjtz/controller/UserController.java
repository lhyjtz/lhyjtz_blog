package com.lcyjtz.controller;

import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import com.lcyjtz.api.WEBService;
import com.lcyjtz.dto.UserDTO;
import com.lcyjtz.dto.UserListDTO;
import com.lcyjtz.dto.UserUpdateDTO;
import com.lcyjtz.entity.Visitor;
import com.lcyjtz.vo.UserQueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private WEBService webService;

    @Autowired(required = false)
    public void setMapper(WEBService webService) {
        this.webService = webService;
    }

    @GetMapping("/getUserList")
    public Result getUserList(UserQueryVO userQueryVO) {
        List<UserDTO> userDTOList = webService.getUserByCondition(userQueryVO);
        int count = webService.count();
        if (userDTOList != null) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("userList", userDTOList).data("total", count);
        }
        return Result.error().codeAndMessage(ResultInfo.GLOBAL_ERROR);
    }

    @DeleteMapping("/deleteByUserId")
    public Result deleteUser(Integer id) {
        if (webService.DeleteUser(id) > 0) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESSFULLY_DELETE);
        }
        return Result.error().codeAndMessage(ResultInfo.DELETE_FAILED);
    }

    @PostMapping("/addUser")
    public Result addUser(Visitor visitor) {
        /**
         * BUG前端返回时间为null
         **/
        if (webService.insert(visitor) > 0) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESS);
        }
        return Result.error().codeAndMessage(ResultInfo.ADD_ERROR);
    }

    /* @PutMapping("/updateUserById")
     public Result updateUserById(@RequestBody UserUpdateDTO userUpdateDTO) {
         if (webService.UpdateByUseID(userUpdateDTO) > 0) {
             return Result.success().codeAndMessage(ResultInfo.SUCCESS);
         }
         return Result.error().codeAndMessage(ResultInfo.UPDATE_ERROR);
     }
 */
    @PutMapping("/updateSilenceById")
    public Result updateSilenceById(@RequestParam(value = "id", required = true) Integer id,
                                    @RequestParam(value = "flag", required = true) boolean flag) {
        if (webService.UpdateStateByUseID(id, flag)) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESS);
        }
        return Result.error().codeAndMessage(ResultInfo.UPDATE_ERROR);
    }

    @GetMapping("getUserListSignal")
    public Result getUserListSignal(@RequestParam(value = "current", defaultValue = "1", required = true) Integer current,
                                    @RequestParam(value = "size", defaultValue = "5", required = true) Integer size,
                                    @RequestParam(value = "visitorname", required = false) String visitorname) {
        List<UserListDTO> userListDTOS = webService.ListUserRole(current, size, visitorname);
        return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("data", userListDTOS);
    }
}
