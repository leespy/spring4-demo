
package chapter2.demo5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行类
 * <p>
 * Date 2018/11/6 上午10:56
 * Author muse
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);

        publisher.publish("hello application event!");

        context.close();
    }
}
