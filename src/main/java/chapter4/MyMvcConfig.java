
package chapter4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import chapter4.demo3.DemoInterceptor;

/**
 * 配置代码
 * <p>
 * Date 2018/11/19 下午10:33
 * Author muse
 */
@Configuration
@EnableWebMvc // 开启Spring MVC支持，若无此句，重写WebMvcConfigurerAdapter方法无效
@ComponentScan("chapter4.*")
public class MyMvcConfig extends WebMvcConfigurerAdapter { // 继承WebMvcConfigurerAdapter类，重写其方法可对Spring MVC进行配置

    @Bean
    public InternalResourceViewResolver viewResolver() {
        /**
         * ViewResolver是Spring MVC视图渲染的核心机制。返回接口View。而View的职责就是使用model、request、response对象，并将渲染的视图
         * （不一定是html，可能是json、xml、pdf）返回给浏览器。
         */
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    /**
     * addResourceHandler：指的是对外暴露的访问路径
     * addResourceLocations：指的是文件放置的目录
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
    }

    /**
     * 配置拦截器的Bean
     */
    @Bean
    public DemoInterceptor demoInterceptor() {
        return new DemoInterceptor();
    }

    /**
     * 重写addInterceptors方法，注册拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor());
    }
}
