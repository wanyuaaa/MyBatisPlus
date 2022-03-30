package com.demo.mybatisplus_demo1.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * @author wanyu
 * @createTime 2022-03-30 10:38
 */
@Data
//@TableName("t_user")//设置表名
public class User {

    //属性对应的字段作为主键,自增，默认雪花ASSIGN_ID/无视递增
    @TableId(value = "id"/*,type = IdType.AUTO*/)
    private Long uid;

    @TableField("user_name")
    private String name;

    private Integer age;

    private String email;

    //逻辑删除
    @TableLogic
    private Integer isDeleted;

}
