package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author xudong_peng
 * @email xudong_peng@163.com
 * @date 2020-10-27 20:30:01
 */
@Mapper
public interface SeckillSessionMapper extends BaseMapper<SeckillSessionEntity> {
	
}
