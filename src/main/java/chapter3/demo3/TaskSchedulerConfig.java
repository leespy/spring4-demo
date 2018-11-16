
package chapter3.demo3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 计划任务配置类
 * <p>
 * Date 2018/11/8 下午1:28
 * Author muse
 */
@Configuration
@ComponentScan("chapter3.demo3")
@EnableScheduling // 开启对计划任务的支持
public class TaskSchedulerConfig {
}
