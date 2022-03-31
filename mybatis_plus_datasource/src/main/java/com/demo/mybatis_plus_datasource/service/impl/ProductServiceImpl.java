package com.demo.mybatis_plus_datasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.mybatis_plus_datasource.mapper.ProductMapper;
import com.demo.mybatis_plus_datasource.pojo.Product;
import com.demo.mybatis_plus_datasource.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author wanyu
 * @createTime 2022-03-31 10:05
 */
@Service
@DS("slave_1")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
