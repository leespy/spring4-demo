目的：Spring Aware

重点：Spring Aware的目的是为了让Bean获得Spring容器的服务。

Spring提供的Aware接口如下所示：
    >BeanNameAware——获得到容器中Bean的名称
    >BeanFactoryAware——获得当前bean factory，这样可以调用容器的服务
    >ApplicationContextAware——获得当前的application context，这样可以调用容器的服务
        >MessageSourceAware——获得message source，这样可以获得文本信息
        >ApplicationEventPublisherAware——应用时间发布器，可以发布事件
        >ResourceLoaderAware——获得资源加载器，可以获得外部资源文件

因为ApplicationContext接口集成了MessageSource接口、ApplicationEventPublisher接口和ResourceLoader接口，所以Bean继承ApplicationContextAware
可以获得Spring容器的所有服务，但原则上我们还是用到什么接口，就实现什么接口

运行：执行Main.java