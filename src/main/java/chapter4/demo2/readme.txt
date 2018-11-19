目的：Spring MVC的常用注解

重点：
    >@Controller：声明为Spring的一个Bean，Dispatcher Servlet会自动扫描注解了此注解的类，并将Web请求映射到注解了@RequestMapping的方法上。
    >@RequestMapping：用来映射Web请求的访问路径和参数。它支持request和resposne作为参数，也支持对request和response的媒体类型进行配置。
    >@ResponseBody：支持将返回值放在response体内，而不是返回一个页面。
    >@RequestBody：支持将返回值放在request体内，而不是在直接链接在地址后面。
    >@PathVariable：用来接收路径参数，如/new/001，可接收001作为参数。
    >@RestController：它是一个组合注解，组合了@Controller和@ResponseBody。

依赖：
    <!-- 对json和xml格式的支持 -->
    <dependency>
        <groupId>com.fasterxml.jackson.dataformat</groupId>
        <artifactId>jackson-dataformat-xml</artifactId>
        <version>2.5.3</version>
    </dependency>

    <!-- 对json格式的支持，上面的依赖已经包含了json支持，所以不需要再依赖
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.5.3</version>
        </dependency>
    -->

运行：执行Main.java