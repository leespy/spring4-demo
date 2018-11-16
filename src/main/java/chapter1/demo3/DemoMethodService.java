
package chapter1.demo3;

import org.springframework.stereotype.Service;

/**
 * 被拦截的类
 * <p>
 * Date 2018/10/23 下午6:59
 * Author muse
 */
@Service
public class DemoMethodService {

    public void add() {
        System.out.println("DemoMethodService.add()");
    }
}
