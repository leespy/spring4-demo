/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter3.demo4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行类
 *
 * Date 2018/11/8 下午1:47
 * Author muse
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);

        System.out.println(
                context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + listService.showListConmand());

        context.close();
    }
}
