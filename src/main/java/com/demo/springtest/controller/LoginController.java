package com.demo.springtest.controller;

import com.demo.springtest.mapper.UserMapper;
import com.demo.springtest.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.UUID;

/**
 * @author zhang
 * @version 1.0
 * @TODO 登录控制
 * @date 2021/9/22 星期三 14:29
 */

@RestController
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/login")
    public Object login(@RequestBody User user) {
        System.out.println(user);
        User userByMessage = userMapper.getUserByMessage(user.getUsername(), user.getPassword());
        System.out.println(userByMessage);
        String flag = "error";
        if (userByMessage.getId() != null) {
            flag = "ok";
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("flag", flag);
        hashMap.put("data", userByMessage);
        return hashMap;
    }
}
