目的：Spring MVC的测试

重点：


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
