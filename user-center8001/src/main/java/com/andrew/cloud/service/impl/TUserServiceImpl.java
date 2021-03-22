package com.andrew.cloud.service.impl;

import com.andrew.cloud.entity.TUser;
import com.andrew.cloud.mapper.TUserMapper;
import com.andrew.cloud.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author andrew
 * @since 2021-03-20
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
