/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter4.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController演示 Date 2018/11/16 上午9:46
 * Author muse
 */
@RestController // 组合了@Controller和@ResponseBody
@RequestMapping("/rest")
public class DemoRestController {

    /**
     * 返回数据的媒体类型为json
     */
    @RequestMapping(value = "/getjson", produces = {"application/json;charset=UTF-8"})
    public DemoObj getjson(DemoObj obj) {
        return new DemoObj(obj.getId(), obj.getName() + "yyy");
    }

    /**
     * 返回数据的媒体类型为xml
     */
    @RequestMapping(value = "/getxml", produces = {"application/xml;charset=UTF-8"})
    public DemoObj getxml(DemoObj obj) {
        return new DemoObj(obj.getId(), obj.getName() + "yy");
    }
}
