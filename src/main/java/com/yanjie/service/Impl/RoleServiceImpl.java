package com.yanjie.service.Impl;

import com.yanjie.mapper.RoleMapper;
import com.yanjie.pojo.PageBean;
import com.yanjie.pojo.Role;
import com.yanjie.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    public PageBean page(Integer page,Integer pageSize) {
        List<Role> pageRoleList = roleMapper.pageRoleList((page - 1) * pageSize, pageSize);
        int roleCount = roleMapper.roleCount();
        //System.out.println(pageRoleList);
        PageBean pageBean=new PageBean();
        pageBean.setTotal(roleCount);
        pageBean.setRole(pageRoleList);
        return pageBean;
    }

    @Override
    public int test() {
        return roleMapper.roleCount();
    }
}
