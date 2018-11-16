package chapter3.demo6;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试类
 *
 * Date 2018/11/8 下午11:26
 * Author muse
 */
@RunWith(SpringJUnit4ClassRunner.class) // 在JUnit环境下提供Spring TestContext Framework的功能
@ContextConfiguration(classes = {TestConfig.class}) // 用来加载ApplicationContext，其中classes属性用来加载配置类
@ActiveProfiles("prod") // 用来声明活动的profile
public class DemoBeanIntegrationTest {
    @Autowired // 可使用普通的@Autowired注入Bean
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
