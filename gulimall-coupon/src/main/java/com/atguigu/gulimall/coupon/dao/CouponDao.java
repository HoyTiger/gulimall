package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hyh
 * @email 407198973@qq.com
 * @date 2023-05-05 22:08:24
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
