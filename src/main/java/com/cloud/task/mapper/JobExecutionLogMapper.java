package com.cloud.task.mapper;


import com.cloud.task.entity.JobExecutionLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobExecutionLogMapper {

    int insert(@Param("pojo") JobExecutionLog pojo);

    int insertSelective(@Param("pojo") JobExecutionLog pojo);

    int insertList(@Param("pojos") List<JobExecutionLog> pojo);

    int update(@Param("pojo") JobExecutionLog pojo);
}
