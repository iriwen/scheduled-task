package com.cloud.task.entity;

import java.util.Date;

/**
 * created by yuxiaodong01 on 2021/02/20.
 */
public class JobExecutionLog {

    private Long sid ;
    private String id;
    private String jobName;
    private String originalTaskId;
    private String taskId;
    private String hostName;
    private String ip;
    private Integer shardingItem;
    private String executionSource;
    private String failureCause;
    private Integer isSuccess;
    private Date startTime;
    private Date completeTime;

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

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getShardingItem() {
        return shardingItem;
    }

    public void setShardingItem(Integer shardingItem) {
        this.shardingItem = shardingItem;
    }

    public String getExecutionSource() {
        return executionSource;
    }

    public void setExecutionSource(String executionSource) {
        this.executionSource = executionSource;
    }

    public String getFailureCause() {
        return failureCause;
    }

    public void setFailureCause(String failureCause) {
        this.failureCause = failureCause;
    }

    public Integer getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Integer isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }
}
