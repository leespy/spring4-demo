
package chapter2.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Date 2018/10/24 上午12:26
 * Author muse
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService singleton_1 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService prototype_1 = context.getBean(DemoPrototypeService.class);

        DemoSingletonService singleton_2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService prototype_2 = context.getBean(DemoPrototypeService.class);

        System.out.println("singleton_1与singleton_2是否相等：" + (singleton_1 == singleton_2));
        System.out.println("prototype_1与prototype_2是否相等：" + (prototype_1 == prototype_2));

        context.close();
    }
}
