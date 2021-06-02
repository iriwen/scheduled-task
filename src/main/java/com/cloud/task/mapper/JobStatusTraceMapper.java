package com.cloud.task.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.cloud.task.entity.JobStatusTraceLog;

@Mapper
public interface JobStatusTraceMapper {
    int insert(@Param("pojo") JobStatusTraceLog pojo);

    int insertSelective(@Param("pojo") JobStatusTraceLog pojo);

    int insertList(@Param("pojos") List<JobStatusTraceLog> pojo);

    int update(@Param("pojo") JobStatusTraceLog pojo);

    String selectOriginalTaskId(@Param("taskId")String taskId,@Param("state") String state);
}
