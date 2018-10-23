/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter1.demo3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 * <p>
 * Date 2018/10/23 下午11:24
 * Author lijinlong02@baidu.com
 */
@Configuration
@ComponentScan("chapter1.demo3")
@EnableAspectJAutoProxy // 注解开启Spring对AspectJ代理的支持
public class AopConfig {
}
