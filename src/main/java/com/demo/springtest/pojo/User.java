package com.demo.springtest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 用户实体类
 * @date 2021/9/23 星期四 21:40
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String role;
    private Boolean state;

    public User(String username, String password, String email, String role, Boolean state) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.state = state;
    }
}
