///*
// * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
// */
//package chapter4.demo3;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
///**
// * 配置代码
// *
// * Date 2018/11/19 下午10:33
// * Author muse
// */
//@Configuration
//@EnableWebMvc // 开启Spring MVC支持，若无此句，重写WebMvcConfigurerAdapter方法无效
//@ComponentScan("chapter4.demo3")
//public class MyMvcConfig extends WebMvcConfigurerAdapter { // 继承WebMvcConfigurerAdapter类，重写其方法可对Spring MVC进行配置
//
//    @Bean
//    public InternalResourceViewResolver viewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/WEB-INF/classes/views/");
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setViewClass(JstlView.class);
//        return viewResolver;
//    }
//
//    /**
//     * addResourceHandler：指的是对外暴露的访问路径
//     * addResourceLocations：指的是文件放置的目录
//     *
//     * @param registry
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
//    }
//
//    /**
//     * 配置拦截器的Bean
//     */
//    @Bean
//    public DemoInterceptor demoInterceptor() {
//        return new DemoInterceptor();
//    }
//
//    /**
//     * 重写addInterceptors方法，注册拦截器
//     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        super.addInterceptors(registry);
//    }
//}
