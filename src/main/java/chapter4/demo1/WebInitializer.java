package chapter4.demo1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Web配置类
 *
 * WebApplicationInitializer接口是Spring提供用来配置Servlet 3.0+配置的接口，从而实现了替代
 * web.xml的位置。实现此接口将会自动被SpringServletContainerInitializer(用来启动Servlet 3.0容器)获取到
 * <p>
 * Date 2018/11/9 上午9:23
 * Author muse
 */
public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyMvcConfig.class);
        context.setServletContext(servletContext); // 新建WebApplicationcontext，注册配置类，并将其和当前servletContext关联。

        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context)); // 注册Spring MVC的DispatcherServlet
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
