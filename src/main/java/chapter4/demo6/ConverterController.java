
package chapter4.demo6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import chapter4.demo2.DemoObj;

/**
 * 控制器
 * http://localhost:8080/spring4/converter
 * <p>
 * Date 2018/11/22 下午10:40
 * Author muse
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/convert", produces = {"application/x-wisely"})
    public @ResponseBody DemoObj convert(@RequestBody DemoObj demoObj) {
        return demoObj;
    }
}
