package chapter4.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date 2018/11/9 上午9:31
 * Author muse
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello() {
        /**
         * 通过上面ViewResolver的Bean配置，返回值为index，说明我们的页面放置的路径为/WEB-INF/classes/views/index.jsp
         */
        return "index";
    }
}
