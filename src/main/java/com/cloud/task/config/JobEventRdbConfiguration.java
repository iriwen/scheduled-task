package com.cloud.task.config;

import java.io.Serializable;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.cloud.task.listener.JobEventRdbListener;
import com.dangdang.ddframe.job.event.JobEventConfiguration;
import com.dangdang.ddframe.job.event.JobEventListener;
import com.dangdang.ddframe.job.event.JobEventListenerConfigurationException;
import com.dangdang.ddframe.job.event.rdb.JobEventRdbIdentity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *〈job event 数据库配置〉<br> 
 *
 * @author number68
 * @date 2019/4/26
 * @since 0.1
 */
@RequiredArgsConstructor
@Getter
@Configuration
@Qualifier("defaultJobEventConfiguration")
public  class JobEventRdbConfiguration extends JobEventRdbIdentity implements JobEventConfiguration, Serializable {

    private static final long serialVersionUID = 3344410699286435226L;

    @Autowired
    JobEventRdbListener  jobEventRdbListener;

    @Override
    public JobEventListener createJobEventListener() throws JobEventListenerConfigurationException {
       // try {
            //return new JobEventRdbListener(dataSource);
        return jobEventRdbListener;
       /* } catch (SQLException ex) {
            throw new JobEventListenerConfigurationException(ex);
        }*/
    }
}
