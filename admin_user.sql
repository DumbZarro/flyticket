drop table if exists admin_users;
drop table if exists menu;
drop table if exists role;
drop table if exists user_role;
drop table if exists role_menu;
/*==============================================================*/
/* Table: admin_users                                           */
/*==============================================================*/
create table admin_users
(
	 user_id						 int not null auto_increment, 
   username            VARCHAR(20) not null,
	 `password`   	     VARCHAR(128) not null,
   primary key (user_id)
);

create table menu
(
	 menu_id						 int not null auto_increment, 
	 perm_key						 VARCHAR(20) not null,
   primary key (menu_id)
);

create table role
(
	 role_id						 int not null auto_increment, 
	 role_key   	       VARCHAR(20) not null,
   primary key (role_id)
);

create table user_role
(
	 user_id						int not null auto_increment, 
   role_id            int not null default 0,
   primary key (user_id,role_id)
);

create table role_menu
(
	 role_id 						 int not null auto_increment,
	 menu_id 						 int not null default 0,
   primary key (role_id,menu_id)
);