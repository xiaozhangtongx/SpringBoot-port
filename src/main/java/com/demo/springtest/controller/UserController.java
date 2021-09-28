package com.demo.springtest.controller;

import com.demo.springtest.mapper.UserMapper;
import com.demo.springtest.pojo.QueryInfo;
import com.demo.springtest.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @TODO 用户管理
 * @date 2021/9/27 星期一 19:58
 */

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    /**
     * 展示所有的用户列表
     *
     * @param queryInfo
     * @return 用户列表
     */
    @RequestMapping("/userlist")
    public HashMap<String, Object> getUserList(@RequestBody QueryInfo queryInfo) {
        int userCounts = userMapper.getUserCounts("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<User> allUser = userMapper.getAllUser("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
//        userMapper.getAllUser()
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("number", userCounts);
        hashMap.put("data", allUser);
        System.out.println(hashMap);
        return hashMap;
    }

    /**
     * 修改用户的状态
     *
     * @param id
     * @param state
     * @return 修改后的结果
     */
    @RequestMapping("/userstate")
    public String updateUserState(@RequestParam("id") Integer id,
                                  @RequestParam("state") Boolean state) {
        int i = userMapper.updateState(id, state);
        System.out.println("用户编号:" + id);
        System.out.println("用户状态:" + state);
        return i > 0 ? "success" : "error";
    }


    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @RequestMapping("/adduser")
    public String addUser(@RequestBody User user) {
        System.out.println(user);
        user.setRole("普通用户");
        user.setState(false);
        int i = userMapper.addUser(user);
        return i > 0 ? "success" : "error";
    }

    @RequestMapping("/getupdate")
    public User getUpdateUser(int id){
        System.out.println("编号:"+id);
        User updateUser = userMapper.getUpdateUser(id);
        return updateUser;
    }

    @RequestMapping("/edituser")
    public String editUser(@RequestBody User user){
        System.out.println(user);
        int i = userMapper.editUser(user);
        return i >0?"success":"error";
    }

    @RequestMapping("/deleteuser")
    public String deleteUser(int id){
        System.out.println(id);
        int i = userMapper.deleteUser(id);
        return i >0?"success":"error";
    }
}
