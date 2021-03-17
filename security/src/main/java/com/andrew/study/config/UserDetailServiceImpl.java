package com.andrew.study.config;

import com.andrew.study.entity.Permission;
import com.andrew.study.entity.User;
import com.andrew.study.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 定义用户信息服务
 */
@Configuration
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User one = userService.getOne(new QueryWrapper<User>().eq("name", "andrew"));
        if (Objects.isNull(one)) {
            return null;
        }
        List<Permission> permissions = userService.findUserPermissions(one.getId());
        UserDetails details = org.springframework.security.core.userdetails.User.builder()
                .username(one.getName())
                .password(one.getPassword())
                .authorities(permissions.stream().map(Permission::getCode).toArray(String[]::new))
                .build();
        return details;
    }
}
