/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter2.demo5;

import org.springframework.context.ApplicationEvent;

/**
 * 事件类
 * <p>
 * Date 2018/11/6 上午10:44
 * Author muse
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}