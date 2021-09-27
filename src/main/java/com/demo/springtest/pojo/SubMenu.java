package com.demo.springtest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 分支导航
 * @date 2021/9/24 星期五 23:15
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubMenu {
    private Integer id;
    private String title;
    private String path;

    public SubMenu(String title, String path) {
        this.title = title;
        this.path = path;
    }
}
