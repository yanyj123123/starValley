package com.yanjie.mapper;

import com.yanjie.pojo.Result;
import com.yanjie.pojo.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface RoleMapper {
    List<Role> selectAllRoleTest();
    //展示所有人物
    @Select("select *from role")
    List<Role> selectAllRole();
    //根据id删除
    @Delete("delete from role where id=#{id}")
    void deleteById(Integer id);
    //增加人物
    @Insert("insert into role (name,gender,isMarried,job,hobby,description,birthday,img) values (#{name},#{gender},#{isMarried},#{job},#{hobby},#{description},#{birthday},#{img})")
    //@Insert("insert into role (name,gender,isMarried,job,hobby,decription,birthday,img) values (#{role.name},#{role.gender},#{role.isMarried},#{role.job},#{role.hobby},#{role.description},#{role.birthday},#{role.img})")
    void addRole(Role role);
    //根据姓名查询
    @Select("select *from role where name=#{name}")
    List<Role> selectByName(String name);
    @Update("update role set name=#{name},gender=#{gender},isMarried=#{isMarried},job=#{job},hobby=#{hobby},description=#{description},birthday=#{birthday},img=#{img} where id=#{id}")
    boolean updateRole(Role role);

    //返回总记录数
    int roleCount();

    //返回每页记录列表,page为页码，pageSize为每页记录数
    List<Role> pageRoleList(Integer page,Integer pageSize);


}
