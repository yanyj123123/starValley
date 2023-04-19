package com.yanjie.controller;

import com.yanjie.mapper.RoleMapper;
import com.yanjie.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class searchController {
    @Autowired
    RoleMapper roleMapper;
    //@RequestMapping(value = "/search",method = RequestMethod.GET)
    @GetMapping("/api/search")
    public List<Role> search(@RequestBody String name){
        return roleMapper.selectAllRole();
    }
}
