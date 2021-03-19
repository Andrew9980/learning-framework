package com.andrew.study.service;

import com.andrew.study.entity.Permission;
import com.andrew.study.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author andrew
 * @since 2021-03-16
 */
public interface IUserService extends IService<User> {

    List<Permission> findUserPermissions(Integer userId);

    boolean updateByName(String name);


}
