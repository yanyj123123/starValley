package com.yanjie;

import com.yanjie.mapper.RoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StarValleyApplicationTests {
    @Autowired
    private RoleMapper roleMapper;
    @Test
    void deleteById(Integer id) {
        roleMapper.deleteById(id);
    }

}
