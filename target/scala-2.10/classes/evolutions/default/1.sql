# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table rm_user (
  user_id                   bigint auto_increment not null,
  display_name              varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  mobile                    varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  gender                    varchar(255),
  age                       integer,
  role                      varchar(255),
  last_updated              datetime,
  updated_by                varchar(255),
  created_by                varchar(255),
  date_created              datetime,
  constraint pk_rm_user primary key (user_id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table rm_user;

SET FOREIGN_KEY_CHECKS=1;

