package com.qxk.config3;

import com.alibaba.druid.pool.DruidDataSource;
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
@Configuration
public class DruidDataSourceConfiguration {
    //有参构造进行接收参数
    private DataSourceProperties dataSourceProperties;
    //当容器没有无参的构造方法时候 会调用有参数构造 并自动按照类型从容器中拿到组件
    public DruidDataSourceConfiguration(DataSourceProperties dataSourceProperties) {
        this.dataSourceProperties = dataSourceProperties;
    }

    @Bean
    public DruidDataSource druidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(dataSourceProperties.getDriver());
        druidDataSource.setUrl(druidDataSource.getUrl());
        druidDataSource.setUsername(druidDataSource.getUsername());
        druidDataSource.setPassword(druidDataSource.getPassword());
        return druidDataSource;
    }
}
