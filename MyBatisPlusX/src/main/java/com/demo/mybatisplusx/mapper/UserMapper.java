package com.demo.mybatisplusx.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.demo.mybatisplusx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author wanyu
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-03-31 11:08:38
* @Entity com.demo.mybatisplusx.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {
    //crud
    int insertSelective(User user);

    int deleteByIdAndUserName(@Param("id") Long id, @Param("userName") String userName);

    int updateAgeAndSexById(@Param("age") Integer age, @Param("sex") Integer sex, @Param("id") Long id);

    List<User> selectAgeAndSexByAgeBetween(@Param("beginAge") Integer beginAge, @Param("endAge") Integer endAge);

    List<User> selectAllByIdOrderByAgeDesc(@Param("id") Long id);

}




