package com.cloud.task.mapper;


import com.cloud.task.entity.JobStatusTraceLog;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;


public interface JobStatusTraceLogMapper {

    int insert(@Param("pojo") JobStatusTraceLog pojo);

    int insertSelective(@Param("pojo") JobStatusTraceLog pojo);

    int insertList(@Param("pojos") List<JobStatusTraceLog> pojo);

    int update(@Param("pojo") JobStatusTraceLog pojo);

    int getJobStatusTraceEventsCount(@Param("jobName")String jobName, @Param("startTime")Date startTime, @Param("endTime")Date endTime);
}
