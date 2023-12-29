package com.qxk.config;

import com.qxk.bean.User;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author 86080
 * @version 1.0
 * @date 2023/06/19 16:49
 */
@Data
@ConfigurationProperties(prefix = "custom")
public class CustomPorpeties {
    String string;
    int age;
    Boolean flag;
    String [] arr1;
    String [] arr2;
    List list1;
    List list2;
    Map map1;
    Map map2;
    User user1;
    User user2;



}
