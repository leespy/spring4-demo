
package chapter3.demo4;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 判定Linux操作系统的条件
 * <p>
 * Date 2018/11/8 下午1:41
 * Author muse
 */
public class LinuxCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getEnvironment().getProperty("os.name").toLowerCase().contains("linux")
                || conditionContext.getEnvironment().getProperty("os.name").toLowerCase().contains("mac");
    }
}
