
package chapter2.demo4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Date 2018/11/6 上午9:54
 * Author muse
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev"); // 1：先将活动的Profile设置为dev
        // context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class); // 2：后置注册Bean配置类，不然会报Bean未定义的错误
        context.refresh(); // 3：刷新容器

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();
    }
}
