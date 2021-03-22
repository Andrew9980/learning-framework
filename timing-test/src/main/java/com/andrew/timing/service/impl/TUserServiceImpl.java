package com.andrew.timing.service.impl;

import com.andrew.timing.entity.TUser;
import com.andrew.timing.mapper.TUserMapper;
import com.andrew.timing.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表  服务实现类
 * </p>
 *
 * @author andrew
 * @since 2021-03-21
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
