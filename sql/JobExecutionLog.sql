-- auto Generated on 2021-05-24 22:39:29 
-- DROP TABLE IF EXISTS job_execution_log; 
CREATE TABLE job_execution_log(
    sid NUMBER(24) DEFAULT -1 NOT NULL,
    id VARCHAR2(50) NOT NULL,
    job_name VARCHAR2(50) DEFAULT '' NOT NULL,
    task_id VARCHAR2(50) DEFAULT '' NOT NULL,
    hostname VARCHAR2(50) DEFAULT '' NOT NULL,
    ip VARCHAR2(50) DEFAULT '' NOT NULL,
    sharding_item NUMBER(12) DEFAULT -1 NOT NULL,
    execution_source VARCHAR2(50) DEFAULT '' NOT NULL,
    failure_cause VARCHAR2(50) DEFAULT '' NOT NULL,
    is_success NUMBER(12) DEFAULT -1 NOT NULL,
    complete_time DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT job_execution_log_pk PRIMARY KEY (id));
create sequence job_execution_log_seq start with 1 increment by 1 nomaxvalue;
create trigger job_execution_log_trigger
before insert on job_execution_log
for each row
   begin
     select job_execution_log_seq.nextval into :new.id from dual;
   end;
