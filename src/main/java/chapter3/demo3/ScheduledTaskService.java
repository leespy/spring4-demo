/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package chapter3.demo3;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 计划任务执行类
 * <p>
 * Date 2018/11/8 上午11:23
 * Author muse
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000) // 使用fixedRate属性每隔固定时间执行
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次 " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 35 13 ? * *") // 每天13点35分执行任务
    public void fixTimeExecution() {
        System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
    }
}
