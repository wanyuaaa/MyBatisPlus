package com.demo.mybatisplus_demo1.pojo;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @author wanyu
 * @createTime 2022-03-30 22:02
 */
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    @Version//标识乐观锁
    private Integer version;
}

