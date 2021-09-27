package com.demo.springtest.controller;

import com.demo.springtest.mapper.MenuMapper;
import com.demo.springtest.pojo.MainMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @TODO 窗口控制类
 * @date 2021/9/26 星期日 15:45
 */

@RestController
public class MenuController {


    @Autowired
    MenuMapper menuMapper;

    @RequestMapping("/menu")
    public HashMap getAllMenus() {
        HashMap<String, Object> data = new HashMap<>();
        // 404表示错误，200表示成功
        List<MainMenu> menuList = menuMapper.getMenu();
        if (menuList != null) {
            data.put("status", 200);
            data.put("data", menuList);
        } else {
            data.put("status", 404);
        }
//        System.out.println(menuList);
//        System.out.println(data);
        return data;
    }
}
