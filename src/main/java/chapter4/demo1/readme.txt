目的：Spring MVC 示例

重点：
    >在Servlet 2.5及以下，只要在web.xml下配置<servlet>元素即可。
     在Servlet 3.0+无web.xml的配置方式中，实现WebApplicationInitializer接口便可实现等同于web.xml的配置。

    >Spring Boot的页面放置在src/main/resources下，而不是在Maven标准的src/main/webapp/WEB-INF下。

「MyMvcConfig」
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

「WebInitializer」
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyMvcConfig.class);
        context.setServletContext(servletContext); // 新建WebApplicationcontext，注册配置类，并将其和当前servletContext关联。

        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context)); // 注册Spring MVC的DispatcherServlet
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }


依赖：
    <!-- Spring MVC -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>${spring-framework.version}</version>
    </dependency>

    <!-- 其他web依赖 -->
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
        <version>${jstl.version}</version>
    </dependency>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>javax.servlet-api</artifactId>
        <version>${servlet.version}</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>javax.servlet.jsp</groupId>
        <artifactId>jsp-api</artifactId>
        <version>${jsp.version}</version>
        <scope>provided</scope>
    </dependency>

运行：执行Main.java