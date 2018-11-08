目的：计划任务 Schedule

重点：从Spring3.1开始，计划任务在Spring中的实现变得异常的简单。

首先>通过在配置类注解@EnableScheduling来开启对计划任务的支持
其次>在要执行计划任务的方法上注解@Scheduled来声明这是一个计划任务，注解支持多种类型的计划任务，包括cron、fixDelay、fixRate等

运行：执行Main.java