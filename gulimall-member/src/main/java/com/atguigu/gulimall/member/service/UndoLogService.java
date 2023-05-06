package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author hyh
 * @email 407198973@qq.com
 * @date 2023-05-06 12:28:57
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

