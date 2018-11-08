目的：@Conditional——条件注解

重点：Spring4提供的，Spring Boot中将会大量应用到条件注解
     @Conditional根据满足某一个特定条件创建一个特定的Bean。即：根据特定条件来控制Bean的创建行为，我们可以利用这个特性进行一些自动的配置。

示例：以不同的操作西欧他那个为条件，若在Windows系统下运行程序，则输出列表命令为dir；若在Linux下运行，则输出列表命令为ls。

运行：执行Main.java