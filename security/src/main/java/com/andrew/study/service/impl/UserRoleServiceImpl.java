package com.andrew.study.service.impl;

import com.andrew.study.entity.UserRole;
import com.andrew.study.mapper.UserRoleMapper;
import com.andrew.study.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author andrew
 * @since 2021-03-17
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
