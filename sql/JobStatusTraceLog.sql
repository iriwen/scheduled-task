-- auto Generated on 2021-05-24 22:40:14 
-- DROP TABLE IF EXISTS job_status_trace_log; 
CREATE TABLE job_status_trace_log(
    sid NUMBER(24) DEFAULT -1 NOT NULL,
    id VARCHAR2(50) NOT NULL,
    job_name VARCHAR2(50) DEFAULT '' NOT NULL,
    original_task_id VARCHAR2(50) DEFAULT '' NOT NULL,
    task_id VARCHAR2(50) DEFAULT '' NOT NULL,
    slave_id VARCHAR2(50) DEFAULT '' NOT NULL,
    source VARCHAR2(50) DEFAULT '' NOT NULL,
    execution_type VARCHAR2(50) DEFAULT '' NOT NULL,
    sharding_item NUMBER(12) DEFAULT -1 NOT NULL,
    state VARCHAR2(50) DEFAULT '' NOT NULL,
    message VARCHAR2(50) DEFAULT '' NOT NULL,
    creation_time DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT job_status_trace_log_pk PRIMARY KEY (id));
create sequence job_status_trace_log_seq start with 1 increment by 1 nomaxvalue;
create trigger job_status_trace_log_trigger
before insert on job_status_trace_log
for each row
   begin
     select job_status_trace_log_seq.nextval into :new.id from dual;
   end;
