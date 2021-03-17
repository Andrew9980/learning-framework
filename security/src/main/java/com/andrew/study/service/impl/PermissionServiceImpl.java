package com.andrew.study.service.impl;

import com.andrew.study.entity.Permission;
import com.andrew.study.mapper.PermissionMapper;
import com.andrew.study.service.IPermissionService;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
