package com.demo.springtest.mapper;

import com.demo.springtest.pojo.MainMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @TODO 导航栏列表接口
 * @date 2021/9/24 星期五 23:23
 */

@Repository
@Mapper
public interface MenuMapper {
    public List<MainMenu> getMenu();

}
