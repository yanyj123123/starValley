package com.yanjie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//分页查询
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    private int total;//总记录数
    private List<Role> role;//每页数据列表
}
