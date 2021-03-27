package com.andrew.test;

import cn.hutool.core.map.MapBuilder;
import cn.hutool.core.map.MapUtil;
import org.apache.commons.beanutils.BeanMap;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {


        BeanMap beanMap = new BeanMap(MapUtil.builder().put("name", "Andrew").build());
        Object name = beanMap.get("name");
        System.out.println(name);

    }

}
