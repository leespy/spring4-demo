/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter3.demo4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * <p>
 * Date 2018/11/8 下午1:44
 * Author lijinlong02@baidu.com
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class) // 符合Windows条件则实例化WindowsListService
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class) // 符合Linux条件则实例化LinuxListService
    public ListService linuxListService() {
        return new LinuxListService();
    }

}
