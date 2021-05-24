package com.cloud.task.entity;

import java.util.Date;

/**
 * created by yuxiaodong01 on 2021/05/24.
 */
public class JobExecutionLog {

    private Long sid;
    private String id;
    private String jobName;
    private String taskId;
    private String hostname;
    private String ip;
    private Integer shardingItem;
    private String executionSource;
    private String failureCause;
    private Integer isSuccess;
    private Date completeTime;

}
