package com.qxk.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author 86080
 * @version 1.0
 * @date 2023/06/19 11:07
 */
//@ConfigurationProperties(prefix = "druid.datasource")
//@Configuration
//@Data
@Component
public class DruidDataSourceConfiguration {

    String driver;
    String url;
    String username;
    String password;
    @Bean
    public DruidDataSource druidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }
}
