/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter1.demo2;


/**
 * Date 2018/10/23 上午9:00
 * Author muse
 */
//没有使用@Service声明Bean
public class UseFunctionService {

    //没有使用@Autowired注入Bean
    private FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
}
