
package chapter3.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 允许类
 *
 * Date 2018/11/8 上午10:25
 * Author muse
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();

        context.close();
    }
}
