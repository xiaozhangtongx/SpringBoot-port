package com.demo.springtest.mapper;

import com.demo.springtest.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @TODO 用户接口
 * @date 2021/9/23 星期四 21:53
 */

@Repository
@Mapper
public interface UserMapper {
    public User getUserByMessage(String username, String password);

    public List<User> getAllUser(String username, int pageStart, int pageSize);

    public int getUserCounts(String username);

}
