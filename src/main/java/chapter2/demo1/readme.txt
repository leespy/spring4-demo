目的：Bean的Scope，本例演示singleton和prototype

重点：@Scope：描述的是Spring容器如何新建Bean的实例。
     >Singleton：默认配置，全容器共享一个实例。
     >Prototype：每次调用新建一个Bean的实例。
     >Request：Web项目中，给每一个http request新建一个Bean实例。
     >Response：Web项目中，给每一个http response新建一个Bean实例。
     >GlobalSession：这个只在portal应用中有用，给每个global http session新建一个Bean实例。

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