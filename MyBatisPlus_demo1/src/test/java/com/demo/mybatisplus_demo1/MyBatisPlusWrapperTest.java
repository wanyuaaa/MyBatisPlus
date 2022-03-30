package com.demo.mybatisplus_demo1;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.mybatisplus_demo1.mapper.UserMapper;
import com.demo.mybatisplus_demo1.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author wanyu
 * @createTime 2022-03-30 17:39
 */
@SpringBootTest
public class MyBatisPlusWrapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01() {
        //查询用户名包含a，年龄在20到30之间，并且邮箱不为null的用户信息
        //SELECT id,username AS name,age,email,is_deleted FROM t_user WHERE
        //is_deleted=0 AND (username LIKE ? AND age BETWEEN ? AND ? AND email IS NOT NULL)
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("user_name", "a")
                .between("age", 20, 30)
                .isNotNull("email");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

    @Test
    public void test02() {
        //按年龄降序查询用户，如果年龄相同则按id升序排列
        //SELECT id,username AS name,age,email,is_deleted FROM t_user WHERE
        //is_deleted=0 ORDER BY age DESC,id ASC
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .orderByDesc("age")
                .orderByAsc("id");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    public void test03() {
        //删除email为空的用户
        //DELETE FROM t_user WHERE (email IS NULL)
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("email");
        //条件构造器也可以构建删除语句的条件
        int result = userMapper.delete(queryWrapper);
        System.out.println("受影响的行数：" + result);
    }

}
