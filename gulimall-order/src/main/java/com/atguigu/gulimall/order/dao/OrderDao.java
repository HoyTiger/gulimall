package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hyh
 * @email 407198973@qq.com
 * @date 2023-05-06 12:15:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
