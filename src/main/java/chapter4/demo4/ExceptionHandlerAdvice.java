
package chapter4.demo4;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * 定制ControllerAdvice
 *
 * Date 2018/11/20 上午10:33
 * Author muse
 */
@ControllerAdvice // 声明一个控制器建言，该注解组合了@Component注解，所以自动注册为Spring的Bean
public class ExceptionHandlerAdvice {

    /**
     * @ExceptionHandler在此处定义全局处理，通过value属性可以过滤拦截的条件，在此处我们拦截了所有的Exception
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", exception.getMessage());
        return modelAndView;
    }

    /**
     * 使用@ModelAttribute注解将键值对添加到全局，所有注解的@RequestMapping的方法可获得此键值对
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "额外信息");
    }

    /**
     * 通过@InitBinder注解定制WebDataBinder
     */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields("id"); // 此处忽略request参数的id
    }
}
