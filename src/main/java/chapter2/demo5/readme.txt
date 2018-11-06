目的：Spring事件（Application Event）

重点：Spring的事件为Bean与Bean之间的消息通信提供了支持。当一个Bean处理完一个任务后，希望另一个Bean知道并能做出相应的处理，这时我们就需要让另外一个Bean监听当前Bean所发送的事件。

Spring的事件需要遵循如下流程：
    1>自定义事件，继承ApplicationEvent
    2>定义事件监听器，实现ApplicationListener
    3>使用容器发布事件

运行：执行Main.java