package com.qxk.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author 86080
 * @version 1.0
 * @date 2023/06/19 16:48
 */
@Configuration
@EnableConfigurationProperties(CustomPorpeties.class)
public class CustomConfiguration {
    CustomPorpeties customPorpeties;

    public CustomConfiguration(CustomPorpeties customPorpeties) {
        this.customPorpeties = customPorpeties;
    }
}
