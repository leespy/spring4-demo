/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter3.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行类
 * <p>
 * Date 2018/11/8 上午11:12
 * Author lijinlong02@baidu.com
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }

        context.close();
    }
}