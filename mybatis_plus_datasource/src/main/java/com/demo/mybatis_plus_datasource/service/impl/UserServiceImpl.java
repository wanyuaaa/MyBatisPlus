package com.demo.mybatis_plus_datasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.mybatis_plus_datasource.mapper.UserMapper;
import com.demo.mybatis_plus_datasource.pojo.User;
import com.demo.mybatis_plus_datasource.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wanyu
 * @createTime 2022-03-31 10:02
 */
@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
