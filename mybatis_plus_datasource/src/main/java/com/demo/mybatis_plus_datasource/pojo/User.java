package com.demo.mybatis_plus_datasource.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author wanyu
 * @createTime 2022-03-31 9:52
 */
@Data
@TableName("t_user")
public class User {

    @TableId
    private Long id;

    private String userName;

    private Integer age;

    private Integer sex;

    private String email;

    private Integer isDeleted;

}
