目的：Profile演示

重点：Profile为在不同环境下使用不同的配置提供了支持（线上环境or测试环境or开发环境）
    1>通过设定Environment的ActiveProfiles来设定当前context需要使用的配置环境。
      在开发中使用@Profile注解类或者方法，达到在不同情况下选择实例化不同的Bean。
    2>通过设定jvm的spring.profiles.active参数来设置配置环境。
    3>Web项目设置在Servlet的context parameter中

    【Servlet 2.5及以下】
    <servlet>
        <servlet-name>dispatcher</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>spring.profiles.active</param-name>
            <param-value>production</param-value>
        </init-param>
    </servlet>

    【Servlet 3.0以上】
    public class WebInit implements WebApplicationInitializer {
        @override
        public void onStartup(ServletContext container) throws ServletException {
            container.setInitParameter("spring.profiles.default", "dev");
        }
    }

运行：执行Main.java