package com.demo.fastautogenerator;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author wanyu
 * @createTime 2022-03-31 1:03
 */
public class FastAutoGeneratorTest {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:13306/mybatis_plus?characterEncoding=utf-8&userSSL=false", "root", "root")
                .globalConfig(builder -> {
                    builder.author("wanYu") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("H://mybatis_plus"); // 指定输出目录
                })
                .packageConfig(builder -> {//com.demo.fastautogenerator
                    builder.parent("com.demo") // 设置父包名
                            .moduleName("fastautogenerator") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "H://mybatis_plus"));// 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_user") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
