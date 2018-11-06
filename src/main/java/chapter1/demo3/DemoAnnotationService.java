/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter1.demo3;

import org.springframework.stereotype.Service;

/**
 * 被拦截的类
 * <p>
 * Date 2018/10/23 下午6:59
 * Author muse
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("DemoAnnotationService.add()");
    }
}
