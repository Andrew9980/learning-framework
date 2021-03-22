package com.andrew.cloud.service.impl;

import com.andrew.cloud.entity.TOrder;
import com.andrew.cloud.mapper.TOrderMapper;
import com.andrew.cloud.service.ITOrderService;
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
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements ITOrderService {

}
