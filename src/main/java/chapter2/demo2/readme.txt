目的：Spring EL-Spring表达式语言

重点：EL表达式支持在xml和注解中使用表达式。
     @Value：当Spring开发中涉及调用各种资源的情况，（包含普通文件、网址、配置文件、系统环境变量等），可以使用Spring的表达式语言实现资源的注入。

依赖：pom.xml
    <!-- 增加commons-io可简化文件相关操作 -->
    <dependency>
        <groupId>commons-io</groupId>
        <artifactId>commons-io</artifactId>
        <version>2.3</version>
    </dependency>

运行：执行Main.java