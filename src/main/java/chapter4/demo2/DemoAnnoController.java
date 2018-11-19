/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter4.demo2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Date 2018/11/16 上午9:25
 * Author muse
 */
@Controller // 声明此类是一个控制器
@RequestMapping("/anno") // 此类的访问路径是/anno
public class DemoAnnoController {

    /**
     * 此方法未标注路径，因此使用类级别的路径/anno；produces可定制返回的response的媒体类型和字符集，如果需要返回值是json对象，则设置
     * produces = "application/json;charset=UTF-8"
     */
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request) { // 可接受HttpServletRequest作为参数
        return "url:" + request.getRequestURL() + " can access";
    }

    /**
     * @PathVariable可以接收路径作为参数
     */
    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,str: " + str;
    }

    /**
     * 演示常规的request参数获取，访问路径为/anno/requestParam?id=1
     */
    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(Long id, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,id: " + id;
    }

    /**
     * 演示参数到对象，访问路径为/anno/obj?id=1&name=muse
     */
    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj obj, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,obj id: " + obj.getId() + " obj name:" + obj.getName();
    }

    /**
     * 演示映射不同的路径到相同的方法，访问路径为：/anno/name1 或 /anno/name2
     */
    @RequestMapping(value = {"/name1", "/name2"} ,produces = "text/plain;charset=UTF-8")
    public @ResponseBody String remove(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }
}
