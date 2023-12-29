package com.qxk.config3;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author 86080
 * @version 1.0
 * @date 2023/06/19 15:17
 */
@Component
@ConfigurationProperties(prefix = "druid.datasource")
@Data
public class DataSourceProperties {
    String driver;
    String url;
    String username;
    String password;
}
