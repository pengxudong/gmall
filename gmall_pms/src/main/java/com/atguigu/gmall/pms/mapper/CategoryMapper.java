package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xudong_peng
 * @email xudong_peng@163.com
 * @date 2020-10-27 19:56:54
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
