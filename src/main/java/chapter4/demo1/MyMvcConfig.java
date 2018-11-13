/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter4.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Spring MVC配置类
 * <p>
 * Date 2018/11/9 上午9:17
 * Author muse
 */
@Configuration
@EnableWebMvc // 开启一些默认配置，如ViewResolver或者MessageConverter等。
@ComponentScan("chapter4.demo1")
public class MyMvcConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        /**
         * ViewResolver是Spring MVC视图渲染的核心机制。返回接口View。而View的职责就是使用model、request、response对象，并将渲染的视图
         * （不一定是html，可能是json、xml、pdf）返回给浏览器。
         */
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/"); // 运行时代码会将我们的页面自动编译到该路径下
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }
}
