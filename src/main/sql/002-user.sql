create table user
(
	user_id int auto_increment comment '用户ID'
		primary key,
	user_username varchar(20) not null comment '用户账号',
	user_PASSWORD varchar(20) not null comment '用户密码',
	user_birthday date null comment '用户生日,后续可以添加生日活动',
	user_registerTime timestamp default CURRENT_TIMESTAMP not null comment '注册时间',
	user_introduce varchar(255) null comment '用户简介',
	user_role varchar(10) default '普通用户' null comment '用户角色',
	user_gender varchar(2) null comment '性别',
	user_telephone varchar(20) null comment '电话号码'
);

