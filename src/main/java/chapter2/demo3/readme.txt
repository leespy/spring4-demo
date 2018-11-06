目的：Bean的初始化和销毁

重点：>Java配置方式：使用@Bean的initMethod和destroyMethod（相当于xml配置的init-method和destroy-method）
     >注解方式：利用JSR-250的@PostConstruct和@PreDestroy

依赖：pom.xml
    <!-- 增加JSR250支持 -->
    <dependency>
        <groupId>javax.annotation</groupId>
        <artifactId>jsr250-api</artifactId>
        <version>1.0</version>
    </dependency>

运行：执行Main.java