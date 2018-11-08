/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter3.demo5;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 新建一个组合注解，组合@Configuration 和 @ComponentScan
 *
 * Date 2018/11/8 下午9:28
 * Author muse
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration // 组合@Configuration元注解
@ComponentScan // 组合@ComponentScan元注解
public @interface WiselyConfiguration {

    String[] value() default {}; // 覆盖value参数
}
