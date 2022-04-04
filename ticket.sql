/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     28/3/2022 ÏÂÎç7:58:27                          */
/*==============================================================*/

-- show VARIABLES like "foreign%";
-- DESCRIBE information_schema.key_column_usage

SET foreign_key_checks = 0;  # 先设置外键约束检查关闭

drop table if exists passenger;

drop table if exists plane;

drop table if exists flight;

drop table if exists orders;

drop table if exists ticket;


/*==============================================================*/
/* Table: passenger                                              */
/*==============================================================*/
create table passenger
(
   person_id              int not null,
   passenger_name         varchar(20) not null,
   primary key (person_id)
);

/*==============================================================*/
/* Table: plane                                                 */
/*==============================================================*/
create table plane
(
   plane_id             int not null,
   size                 int not null,
   plane_name           varchar(20),
   primary key (plane_id)
);

/*==============================================================*/
/* Table: flight                                                */
/*==============================================================*/
create table flight
(
   flight_id            int not null AUTO_INCREMENT,
   plane_id             int not null,
   start_t              datetime not null,
   end_t                datetime not null,
   origin               varchar(20) not null,
   destination          varchar(20) not null,
   primary key (flight_id)
);

/*==============================================================*/
/* Table: orders                                                */
/*==============================================================*/
create table orders
(
   orders_id            int not null AUTO_INCREMENT,
	 flight_id            int not null,
   person_id            int not null,
   cost                 int not null,
   order_t              datetime not null,
   pay_state            bool not null,
   primary key (orders_id)
);

/*==============================================================*/
/* Table: ticket                                                */
/*==============================================================*/
create table ticket
(
   ticket_id            int not null AUTO_INCREMENT,
   orders_id            int not null,
   seat                 varchar(20) not null,
   type                 varchar(20),
   primary key (ticket_id)
);

alter table flight add constraint FK_Relationship_1 foreign key (plane_id)
      references plane (plane_id) on delete restrict on update restrict;

alter table orders add constraint FK_Relationship_2 foreign key (person_id)
      references passenger (person_id) on delete restrict on update restrict;

alter table orders add constraint FK_Relationship_3 foreign key (flight_id)
      references flight (flight_id) on delete restrict on update restrict;

alter table ticket add constraint FK_Relationship_4 foreign key (orders_id)
      references orders (orders_id) on delete restrict on update restrict;


SET foreign_key_checks = 1; # 开启外键约束检查，以保持表结构完整性
