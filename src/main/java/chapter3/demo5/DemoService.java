/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter3.demo5;

import org.springframework.stereotype.Service;

/**
 * 演示服务Bean
 *
 * Date 2018/11/8 下午9:32
 * Author lijinlong02@baidu.com
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置照样获得的bean");
    }
}
