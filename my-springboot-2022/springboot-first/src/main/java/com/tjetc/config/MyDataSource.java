package com.tjetc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@ConfigurationProperties(prefix = "jdbc")
@PropertySource("classpath:db.properties")//读取指定的配置文件
@Data
public class MyDataSource {
    private String driver;
    private String url;
    private String username;
    private String password;
}
