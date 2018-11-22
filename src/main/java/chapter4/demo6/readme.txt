目的：自定义HttpMessageConverter

重点：
    HttpMessageConverter使用来处理request和response里的数据的。
    Spring为我们内置了大量的HttpMessageConverter，例如：
        1>MappingJackson2HttpMessageConverter
        2>StringHttpMessageConverter
        3>... ...

    自定义HttpMessageConverter需要我们继承AbstractHttpMessageConverter
依赖：

运行：执行Main.java