package com.cloud.task.task;

import com.cloud.task.annotation.ScheduledTask;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by yuxiaodong01 on 2021/06/02.
 */
@ScheduledTask(name = "CronTask01", cron = "* /1 * * * ? ", shardingTotalCount = 1, overwrite = true)
@Slf4j
public class CronTask implements SimpleJob {

    @Override
    public void execute(final ShardingContext shardingContext) {
        log.info("CronTask01 定时任务执行开始.....");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date today = new Date();//获取今天的日期

        log.info("CronTask01 执行时间点: {}", today.toString());

    }
}