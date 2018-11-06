/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter2.demo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布类
 * <p>
 * Date 2018/11/6 上午10:51
 * Author muse
 */
@Component
public class DemoPublisher {

    @Autowired
    private ApplicationContext applicationContext; // 注入ApplicaltionContext用来发布事件

    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg)); // 使用publishEvent方法来发布事件
    }
}
