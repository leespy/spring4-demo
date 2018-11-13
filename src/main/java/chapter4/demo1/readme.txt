目的：Spring MVC 示例

重点：
    >在Servlet 2.5及以下，只要在web.xml下配置<servlet>元素即可。
     在Servlet 3.0+无web.xml的配置方式中，实现WebApplicationInitializer接口便可实现等同于web.xml的配置。

    >Spring Boot的页面放置在src/main/resources下，而不是在Maven标准的src/main/webapp/WEB-INF下。

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