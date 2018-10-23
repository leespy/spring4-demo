目的：演示基于注解的bean的初始化和依赖注入

重点：@Aspect：声明是一个的切面
     @After、@Before、@Around：定义建言（advice），可直接将拦截规则（切点）作为参数。
     @PointCut：切点，定义拦截规则

依赖：pom.xml
    <!-- aop支持 -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-aop</artifactId>
        <version>4.1.6.RELEASE</version>
    </dependency>

    <!-- aspectj支持 -->
    <dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjrt</artifactId>
        <version>1.8.5</version>
    </dependency>
    <dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjweaver</artifactId>
        <version>1.8.5</version>
    </dependency>

运行：执行Main.java