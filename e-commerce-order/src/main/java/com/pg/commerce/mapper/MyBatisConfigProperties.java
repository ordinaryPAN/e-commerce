package com.pg.commerce.mapper;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(value = "tk.mybatis.mapper.annotation",
        properties = {
                "mappers=tk.mybatis.mapper.common.Mapper",
                "notEmpty=true"
        }
)
public class MyBatisConfigProperties {
}
