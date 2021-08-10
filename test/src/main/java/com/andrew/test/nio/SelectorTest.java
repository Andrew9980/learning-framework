package com.andrew.test.nio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author siqing.xu
 * @version 1.0
 * @desc
 * @date 2021/8/2 22:11
 * @since 1.0
 */
public class SelectorTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list.subList(1, list.size()));
        System.out.println(list);
    }

}
