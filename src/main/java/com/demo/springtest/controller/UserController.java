package com.demo.springtest.controller;

import com.demo.springtest.mapper.UserMapper;
import com.demo.springtest.pojo.QueryInfo;
import com.demo.springtest.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/userlist")
    public HashMap<String, Object> getUserList(@RequestBody QueryInfo queryInfo) {
        int userCounts = userMapper.getUserCounts("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<User> allUser = userMapper.getAllUser("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
//        userMapper.getAllUser()
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("number",userCounts);
        hashMap.put("data",allUser);
        return hashMap;
    }
}
