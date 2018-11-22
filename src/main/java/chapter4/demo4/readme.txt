目的：@ControllerAdvice

重点：通过@ControllerAdvice我们可以将对于控制器的全局配置放置在同一个位置，注解了@Controller的类的方法可以使用如下注解到方法上，这对所有注解了@RequestMapping的控制器内的方法都有效。
    >@ExceptionHandler：用于全局处理控制器里的异常。
    >@InitBinder：用来设置WebDataBinder，WebDataBinder用来自动绑定前台请求参数到Model中。
    >@ModelAttribute：作用是绑定键值对到Model里，此处是让全局的@RequestMapping都能获得在此处设置的键值对。


运行：执行Main.java