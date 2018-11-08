/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter3.demo4;

/**
 * Linux下的列表命令
 *
 * Date 2018/11/8 下午1:43
 * Author lijinlong02@baidu.com
 */
public class LinuxListService implements ListService {

    @Override
    public String showListConmand() {
        return "ls";
    }
}
