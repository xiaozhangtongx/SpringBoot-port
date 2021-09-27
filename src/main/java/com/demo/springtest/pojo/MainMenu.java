package com.demo.springtest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @TODO 主导航
 * @date 2021/9/24 星期五 23:19
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MainMenu {
    private Integer id;
    private String title;
    private String path;
    private List<SubMenu> subMenus;

    public MainMenu(String title, String path, List<SubMenu> subMenus) {
        this.title = title;
        this.path = path;
        this.subMenus = subMenus;
    }
}
