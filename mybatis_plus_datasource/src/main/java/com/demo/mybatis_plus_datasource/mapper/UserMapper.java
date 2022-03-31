package com.demo.mybatis_plus_datasource.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.mybatis_plus_datasource.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author wanyu
 * @createTime 2022-03-31 9:51
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
