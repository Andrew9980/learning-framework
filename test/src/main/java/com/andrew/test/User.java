package com.andrew.test;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
@ToString(callSuper = true)
public class User extends BaseObj {

    public User() {
    }

    @Builder.Default
    private String name = "xusiqing";

    private Integer age;

}
