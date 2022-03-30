package com.demo.mybatisplus_demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.mybatisplus_demo1.pojo.Product;
import org.springframework.stereotype.Repository;

/**
 * @author wanyu
 * @createTime 2022-03-30 22:03
 */
@Repository
public interface ProductMapper extends BaseMapper<Product> {
}
