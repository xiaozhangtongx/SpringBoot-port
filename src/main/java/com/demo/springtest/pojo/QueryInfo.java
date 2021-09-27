package com.demo.springtest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 包装实体信息
 * @date 2021/9/27 星期一 20:03
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryInfo {
    private String query;   // 查询的信息 username
    private int pageNum = 1;  // 当前页
    private int pageSize = 1;  // 页面数
}
