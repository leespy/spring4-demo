/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter1.demo3;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 切面
 * <p>
 * Date 2018/10/23 下午7:24
 * Author lijinlong02@baidu.com
 */
@Aspect // 注解声明切面
@Component // 注解让切面类成为Spring的容器Bean
public class LogAspect {

    @Pointcut("@annotation(chapter1.demo3.Action)") // 注解声明切点
    public void annotationPointCut() {
    }

    @After("annotationPointCut()") // 注解声明建言——拦截注解
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 " + action.name());
    }

    @Before("execution(* chapter1.demo3.DemoMethodService.* (..))") // 注解声明建言——拦截规则
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则式拦截 " + method.getName());
    }
}
