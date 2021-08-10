package com.andrew.test.proxy;

import com.andrew.test.User;

public interface IUserDao {
    User findUserById(Integer id);
}
