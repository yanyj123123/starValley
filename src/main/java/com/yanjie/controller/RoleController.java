package com.yanjie.controller;

import com.yanjie.mapper.RoleMapper;
import com.yanjie.pojo.PageBean;
import com.yanjie.pojo.Result;
import com.yanjie.pojo.Role;
import com.yanjie.service.RoleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class RoleController {
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    RoleService roleService;
    /*
    @RequestMapping("/role")
    public List<Role> test(){
        List<Role> roleList = roleMapper.selectAllRole();
        return roleList;
    }
    */
    @RequestMapping("/role/addRole")
     public String addRoleConT(@RequestBody Role role){
        roleMapper.addRole(role);
        return "ok";
     }
     @PostMapping("/role/searchByName")
    public List<Role> searchByName(String name){
         List<Role> roles = roleMapper.selectByName(name);
         return roles;
     }
     @PostMapping("/role/deleteById")
     public void deleteRoleById(Integer id){
        roleMapper.deleteById(id);
        return;
     }
     @RequestMapping("/role/updateRole")
     public void updateRole(@RequestBody Role role){
         //System.out.println(role);
         boolean b = roleMapper.updateRole(role);

         System.out.println(b);
     }
     @PostMapping ("/role")
     public PageBean page(Integer page,Integer pageSize){
         System.out.println(pageSize);
         PageBean pageBean = roleService.page(page, pageSize);
         return pageBean;

     }
}
