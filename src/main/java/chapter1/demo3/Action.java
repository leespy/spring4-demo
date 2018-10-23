/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter1.demo3;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 新增Action注解类
 * <p>
 * Date 2018/10/23 下午6:56
 * Author lijinlong02@baidu.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
