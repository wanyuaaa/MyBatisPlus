package com.demo.mybatisplusx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.mybatisplusx.pojo.User;
import com.demo.mybatisplusx.service.UserService;
import com.demo.mybatisplusx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author wanyu
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2022-03-31 11:08:38
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




