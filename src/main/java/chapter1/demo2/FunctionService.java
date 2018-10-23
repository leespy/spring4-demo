/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter1.demo2;

/**
 * Date 2018/10/23 上午8:59
 * Author lijinlong02@baidu.com
 */
//没有使用@Service声明Bean
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
