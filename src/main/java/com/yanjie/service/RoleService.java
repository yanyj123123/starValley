package com.yanjie.service;

import com.yanjie.pojo.PageBean;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
public interface RoleService {
    public PageBean page(Integer page,Integer pageSize);
    public int test();
}
