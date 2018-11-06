/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter2.demo4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Profile配置
 *
 * Date 2018/11/6 上午9:51
 * Author muse
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev") // Profile值为"dev"时实例化devDemoBean
    public DemoBean devDemoBean() {
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod") // Profile值为"prod"时实例化prodDemoBean
    public DemoBean prodDemoBean() {
        return new DemoBean("from production profile");
    }
}
