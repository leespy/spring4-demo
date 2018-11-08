目的：集成测试——Spring TestContext Framework

重点：
    >单元测试：只针对当前开发的类和方法进行测试，对运行环境没有依赖。
    >集成测试：一般需要来自不同层的不同对象的交互，如数据库、网络连接、IoC容器等。

    >Spring通过Spring TestContext Framework对集成测试提供顶级支持。它不依赖于特定的测试框架，即可用Junit，也可用TestNG

    >Maven构建的项目结构：
        -src
            -main
                -java   项目源码
                -resources  项目资源
            -test
                -java   测试代码
                -resources  测试资源

    >Spring提供了一个SpringJUnit4ClassRunner类，它提供了Spring TestContext Framework的功能。
        @ContextConfiguration——配置Application Context
        @ActiveProfiles——确定活动的profile

依赖：
    <!-- 增加Spring test支持 -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-test</artifactId>
        <version>${spring-framework.version}</version>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.11</version>
    </dependency>

运行：执行Main.java