目的：演示基于java配置的bean的初始化和依赖注入
重点：@Configuration注解
     @Bean
     AnnotationConfigApplicationContext
运行：执行Main.java

Spring4.x推荐使用Java配置方式，可以完全替代xml配置。
>全局配置使用Java配置（如数据库相关配置、MVC相关配置）
>业务Bean的配置使用注解配置（@Service、@Component、@Repository、@Controller）