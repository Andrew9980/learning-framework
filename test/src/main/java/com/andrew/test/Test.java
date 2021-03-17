package com.andrew.test;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = Test.<String>list();
        Lists.newArrayList();
    }

    public static <T> List<T> list() {
        return new ArrayList<>();
    }
}
