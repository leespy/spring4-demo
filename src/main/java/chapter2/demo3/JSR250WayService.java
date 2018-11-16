
package chapter2.demo3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 使用JSR250形式的Bean
 * <p>
 * Date 2018/11/6 上午9:12
 * Author muse
 */
public class JSR250WayService {

    @PostConstruct // 在构造函数执行完之后执行
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy // 在Bean销毁之前执行
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }
}
