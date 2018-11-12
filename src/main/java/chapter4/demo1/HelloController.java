/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter4.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date 2018/11/9 上午9:31
 * Author lijinlong02@baidu.com
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
