/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter1.demo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Date 2018/10/23 上午9:03
 * Author muse
 */
@Configuration // 声明当前类是一个配置类
@ComponentScan("chapter1.demo1") // 自动扫描包下所有使用@Sercice、@Component、@Controller和@Repository的类，并注册为Bean
public class DiConfig {

}
