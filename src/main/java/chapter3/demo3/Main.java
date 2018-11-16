
package chapter3.demo3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 执行类
 *
 * Date 2018/11/8 下午1:28
 * Author muse
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);

        // context.close();
    }
}
