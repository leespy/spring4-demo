/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter3.demo3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 执行类
 *
 * Date 2018/11/8 下午1:28
 * Author lijinlong02@baidu.com
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);

        // context.close();
    }
}
