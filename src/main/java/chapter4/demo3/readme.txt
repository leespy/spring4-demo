目的：Spring MVC 基本配置

重点：
    1>Spring MVC的定制配置需要我们的配置类继承一个WebMvcConfigurerAdapter类，并在此类使用@EnableWebMvc注解，来开启对Spring MVC的配置支持。
「MyMvcConfig」
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


    2>让普通的Bean实现HandlerInterceptor接口或者继承HandlerInterceptorAdapter类来实现自定义拦截器。
      重写WebMvcConfigurerAdapter的addInterceptors方法来注册自定义的拦截器。
「MyMvcConfig」
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

运行：执行Main.java