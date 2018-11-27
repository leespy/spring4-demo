目的：Spring MVC的测试

重点：
    为了测试Web项目通常不需要启动项目，我们需要一些Servlet相关的模拟对象，比如：MockMVC、MockHttpServletRequest、MockHttpServletResponse、MockHttpSession等。
    在Spring里，我们使用@WebAppConfiguration指定加载的ApplicationContext是一个WebApplicationContext。

依赖：
    <!-- 增加Spring test支持 -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-test</artifactId>
        <version>${spring-framework.version}</version>
        <scope>test</scope> <!-- 说明这些包的存活是在test周期，意味着发布时将不包含这些jar包 -->
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.11</version>
        <scope>test</scope>
    </dependency>

运行：执行Main.java

resources/views/converter.jsp
