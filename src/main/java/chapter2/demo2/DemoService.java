
package chapter2.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 需要被注入的类
 *
 * Date 2018/10/24 下午1:44
 * Author muse
 */
@Service
public class DemoService {
    @Value("其他属性") // 此处注入普通字符串
    private String other;

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
