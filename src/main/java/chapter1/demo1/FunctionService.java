
package chapter1.demo1;

import org.springframework.stereotype.Service;

/**
 * Date 2018/10/23 上午8:59
 * Author muse
 */
// 使用@Component、@Service、 @Respsitory和@Controller是等效的
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
