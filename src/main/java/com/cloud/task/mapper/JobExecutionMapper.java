package com.cloud.task.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.cloud.task.entity.JobExecutionLog;

@Mapper
public interface JobExecutionMapper {
    int insert(@Param("pojo") JobExecutionLog pojo);

    int insertSelective(@Param("pojo") JobExecutionLog pojo);

    int insertList(@Param("pojos") List<JobExecutionLog> pojo);

    int update(@Param("pojo") JobExecutionLog pojo);
}
