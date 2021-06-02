package com.cloud.task.listener;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.cloud.task.handler.JobEventRdbStorage;
import com.dangdang.ddframe.job.event.JobEventListener;
import com.dangdang.ddframe.job.event.rdb.JobEventRdbIdentity;
import com.dangdang.ddframe.job.event.type.JobExecutionEvent;
import com.dangdang.ddframe.job.event.type.JobStatusTraceEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *〈job event数据库持久化监听器〉<br> 
 *
 * @author number68
 * @date 2019/4/26
 * @since 0.1
 */
@Component
public class JobEventRdbListener extends JobEventRdbIdentity implements JobEventListener {

    //private final JobEventRdbStorage repository;

   /* public JobEventRdbListener(final DataSource dataSource) throws SQLException {
        repository = new JobEventRdbStorage(dataSource);
    }*/

    @Autowired
    private  JobEventRdbStorage  jobEventRdbService;

    @Override
    public void listen(final JobExecutionEvent executionEvent) {
        jobEventRdbService.addJobExecutionEvent(executionEvent);
    }

    @Override
    public void listen(final JobStatusTraceEvent jobStatusTraceEvent) {
        jobEventRdbService.addJobStatusTraceEvent(jobStatusTraceEvent);
    }
}
