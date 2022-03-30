package com.demo.mybatisplus_demo1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.mybatisplus_demo1.mapper.UserMapper;
import com.demo.mybatisplus_demo1.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author wanyu
 * @createTime 2022-03-30 12:52
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
}
