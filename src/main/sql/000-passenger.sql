create table passenger
(
	passenger_id int auto_increment
		primary key,
	passenger_name varchar(10) not null comment '旅客姓名',
	passenger_gender varchar(2) not null comment '旅客性别',
	passenger_idCard varchar(50) not null comment '旅客身份证号码',
	air_id varchar(30) not null comment '航班号',
	departure varchar(30) not null,
	destination varchar(30) not null,
	ticket_date date null,
	tickets_id varchar(30) not null,
	constraint passenger_passenger_idCard_uindex
		unique (passenger_idCard)
);

