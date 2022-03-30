package com.demo.mybatisplus_demo1;

import com.demo.mybatisplus_demo1.mapper.UserMapper;
import com.demo.mybatisplus_demo1.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wanyu
 * @createTime 2022-03-30 10:59
 */
@SpringBootTest
public class MyBatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
//        //id 雪花算法
//        User user = new User(null, "张三", 23, "zhangsan@atguigu.com");
//        //INSERT INTO user ( id, name, age, email ) VALUES ( ?, ?, ?, ? )
//        int result = userMapper.insert(user);
//        System.out.println("受影响行数：" + result);
//        //1475754982694199298
//        System.out.println("id自动获取：" + user.getUid());
    }

    @Test
    public void testDeleteById() {
        //通过id删除用户信息
        //DELETE FROM user WHERE id=?
        int result = userMapper.deleteById(1509007618710347777L);
        System.out.println("受影响行数：" + result);

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", "23");

        int i = userMapper.deleteByMap(map);
        System.out.println("result:" + i);
    }

    @Test
    public void testUpdateById() {
//        User user = new User(4L, "admin", 22, null);
//        //UPDATE user SET name=?, age=? WHERE id=?
//        int result = userMapper.updateById(user);
//        System.out.println("受影响行数：" + result);
    }

    /**
     * 查询
     */
    @Test
    public void testSelectById() {
        //根据id查询用户信息
        //SELECT id,name,age,email FROM user WHERE id=?
        User user = userMapper.selectById(4L);
        System.out.println(user);
    }

    @Test
    public void testSelectBatchIds(){
        //根据多个id查询多个用户信息
        //SELECT id,name,age,email FROM user WHERE id IN ( ? , ? )
        List<Long> idList = Arrays.asList(4L, 5L);
        List<User> list = userMapper.selectBatchIds(idList);
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectByMap(){
        //通过map条件查询用户信息
        //SELECT id,name,age,email FROM user WHERE name = ? AND age = ?
        Map<String, Object> map = new HashMap<>();
        map.put("age", 22);
        map.put("name", "admin");
        List<User> list = userMapper.selectByMap(map);
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectList() {
        //selectList()根据MP内置的条件构造器查询一个list集合，null表示没有条件，即查询所有
        userMapper.selectList(null).forEach(System.out::println);
    }

}

