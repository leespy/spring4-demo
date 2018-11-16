
package chapter1.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Date 2018/10/23 上午9:05
 * Author muse
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("java config"));
        context.close();
    }
}
