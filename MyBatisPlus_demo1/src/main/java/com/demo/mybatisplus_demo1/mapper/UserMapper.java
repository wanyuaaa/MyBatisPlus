package com.demo.mybatisplus_demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.mybatisplus_demo1.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author wanyu
 * @createTime 2022-03-30 10:52
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
