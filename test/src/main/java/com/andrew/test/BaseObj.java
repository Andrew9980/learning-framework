package com.andrew.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.util.Date;

/**
 * @author siqing.xu
 * @version 1.0
 * @desc
 * @date 2021/8/2 11:02
 * @since 1.0
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseObj {

    private Integer id;

    private Date createTime;

    private Date updateTime;

}
