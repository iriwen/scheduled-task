package com.cloud.task.entity;

import java.util.Date;

/**
 * created by yuxiaodong01 on 2021/02/20.
 */
public class JobStatusTraceLog {

    private Long sid ;
    private String id;
    private String jobName;
    private String originalTaskId;
    private String taskId;
    private String slaveId;
    private String source;
    private String executionType;
    private String shardingItem;
    private String state;
    private String message;
    private Date creationTime;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getOriginalTaskId() {
        return originalTaskId;
    }

    public void setOriginalTaskId(String originalTaskId) {
        this.originalTaskId = originalTaskId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getSlaveId() {
        return slaveId;
    }

    public void setSlaveId(String slaveId) {
        this.slaveId = slaveId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getExecutionType() {
        return executionType;
    }

    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    public String getShardingItem() {
        return shardingItem;
    }

    public void setShardingItem(String shardingItem) {
        this.shardingItem = shardingItem;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
}
