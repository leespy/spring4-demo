/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter1.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Date 2018/10/23 上午9:05
 * Author lijinlong02@baidu.com
 */
public class Main {
    public static void main(String[] args) {
        // 使用AnnotationConfigApplicationContext来基于注解的Bean的初始化和注入
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("muse"));
        context.close();
    }
}
