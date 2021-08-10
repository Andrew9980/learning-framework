package com.andrew.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        User user1 = User.builder().age(14).name("abc").build();
        User user2 = User.builder().age(15).name("bcd").build();
        User user3 = User.builder().age(16).name("efg").build();
        User user4 = User.builder().age(17).name("hij").build();

        List<User> userList = List.of(user1, user2, user3, user4);

    }
}