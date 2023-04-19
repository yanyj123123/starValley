package com.yanjie.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data

public class Role {
    private Integer id;
    private String name;
    private Integer gender;
    private Integer isMarried;
    private String job;
    private String hobby;
    private String description;
    private String birthday;
    private String img;
}
