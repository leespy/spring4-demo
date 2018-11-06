/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter2.demo5;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听类
 * <p>
 * Date 2018/11/6 上午10:46
 * Author muse
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> { // 实现ApplicationListener接口，并指定监听的事件类型——DemoEvent
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) { // 使用onApplicationEvent方法对消息进行接受处理

        String msg = demoEvent.getMsg();

        System.out.println("我（bean-demoListener）接收到了bean-demoPublisher发布的消息：" + msg);
    }
}
