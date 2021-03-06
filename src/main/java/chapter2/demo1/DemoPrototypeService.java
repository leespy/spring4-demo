
package chapter2.demo1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Prototype的Bean
 *
 * Date 2018/10/24 上午12:22
 * Author muse
 */
@Service
@Scope("prototype") // 声明为prototype的类
public class DemoPrototypeService {
}
