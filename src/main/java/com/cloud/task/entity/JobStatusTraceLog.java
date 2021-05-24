package com.cloud.task.entity;

import java.util.Date;

/**
 * created by yuxiaodong01 on 2021/05/24.
 */
public class JobStatusTraceLog {

    private Long sid;
    private String id;
    private String jobName;
    private String originalTaskId;
    private String taskId;
    private String slaveId;
    private String source;
    private String executionType;
    private Integer shardingItem;
    private String state;
    private String message;
    private Date creationTime;

}
