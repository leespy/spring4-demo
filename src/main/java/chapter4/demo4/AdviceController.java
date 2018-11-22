
package chapter4.demo4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import chapter4.demo2.DemoObj;

/**
 * 控制器
 * 请求地址：http://localhost:8080/springboot/advice?id=1&name=xx
 *
 * <p>
 * Date 2018/11/22 上午8:05
 * Author muse
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) {
        throw new IllegalArgumentException("非常抱歉，参数有误/" + "来自@ModelAttribute:" + msg);
    }

}
