package com.yanjie;

import com.yanjie.mapper.RoleMapper;
import com.yanjie.pojo.Role;
import com.yanjie.service.RoleService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
class StarValleyApplicationTests {
    @Autowired
    public RoleMapper roleMapper;
    @Autowired
    private RoleService roleService;

    @Test
    void deleteById() {
        List<Role> roles = roleMapper.selectAllRoleTest();
        System.out.println(roles);
        return;
    }
    @Test

    void page(){
        //System.out.println(roleMapper.pageRoleList(0,3));
        //System.out.println(roleMapper.roleCount());
        System.out.println(roleService.page(1,3).getRole());

    }

}
