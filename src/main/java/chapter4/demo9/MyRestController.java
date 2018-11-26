/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter4.demo9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date 2018/11/26 下午10:07
 * Author lijinlong02@baidu.com
 */
@RestController
public class MyRestController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/testRest", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String testRest() {
        return demoService.saySomething();
    }
}
