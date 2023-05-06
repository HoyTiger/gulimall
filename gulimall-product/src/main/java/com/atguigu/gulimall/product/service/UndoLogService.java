package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email 407198973@qq.com
 * @date 2023-05-05 19:58:08
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

