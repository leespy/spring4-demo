
package chapter1.demo3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Date 2018/10/23 下午11:26
 * Author muse
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();

        context.close();
    }
}
