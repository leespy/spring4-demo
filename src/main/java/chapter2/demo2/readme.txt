目的：Spring EL-Spring表达式语言

重点：EL表达式支持在xml和注解中使用表达式。
     @Value：当Spring开发中涉及调用各种资源的情况，（包含普通文件、网址、配置文件、系统环境变量等），可以使用Spring的表达式语言实现资源的注入。
    >注入普通字符串
    >注入操作系统属性
    >注入表达式运算结果
    >注入其他Bean的属性
    >注入文件内容
    >注入网址内容
    >注入属性文件

properties文件要放入resources中。
classpath是指 WEB-INF文件夹下的classes目录

web.xml 配置中classpath: 与classpath*:的区别
classpath：只会到你的class路径中查找找文件;
classpath*：不仅包含class路径，还包括jar文件中(class路径)进行查找.

依赖：pom.xml
    <!-- 增加commons-io可简化文件相关操作，本例中使用commons-io将file转换成字符串 -->
    <dependency>
        <groupId>commons-io</groupId>
        <artifactId>commons-io</artifactId>
        <version>2.3</version>
    </dependency>

运行：执行Main.java