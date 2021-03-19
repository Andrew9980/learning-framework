package com.andrew.study.service.impl;

import com.andrew.study.entity.Permission;
import com.andrew.study.entity.RolePermission;
import com.andrew.study.entity.User;
import com.andrew.study.entity.UserRole;
import com.andrew.study.mapper.PermissionMapper;
import com.andrew.study.mapper.RolePermissionMapper;
import com.andrew.study.mapper.UserMapper;
import com.andrew.study.mapper.UserRoleMapper;
import com.andrew.study.service.IPermissionService;
import com.andrew.study.service.IRolePermissionService;
import com.andrew.study.service.IUserRoleService;
import com.andrew.study.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author andrew
 * @since 2021-03-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private IPermissionService permissionService;

    @Autowired
    private IUserRoleService userRoleService;

    @Autowired
    private IRolePermissionService rolePermissionService;

    @Override
    public List<Permission> findUserPermissions(Integer userId) {

        List<UserRole> userRoles = userRoleService.lambdaQuery().select(UserRole::getRoleId).eq(UserRole::getUserId, userId).list();
        List<Integer> roleIds = userRoles.stream().map(UserRole::getRoleId).collect(Collectors.toList());
        List<RolePermission> permissions = rolePermissionService.lambdaQuery().select(RolePermission::getPermissionId).in(RolePermission::getRoleId, roleIds).list();
        List<Integer> permissionIds = permissions.stream().map(RolePermission::getPermissionId).collect(Collectors.toList());
        List<Permission> list = permissionService.lambdaQuery().in(Permission::getId, permissionIds).list();




        return list;
    }

    @Override
    public boolean updateByName(String name) {
        User user = new User();
        user.setName(name);
        user.setAuth("p2");
        return update(user, new QueryWrapper<User>().eq("name", name));
    }
}
