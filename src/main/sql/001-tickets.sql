create table tickets
(
	ticket_id varchar(30) not null comment '航班号'
		primary key,
	air_company varchar(20) not null comment '航空公司',
	ticket_price int not null comment '机票价格',
	ticket_date date null,
	ticket_startTime time not null comment '出发时间',
	ticket_arrivalTime time null comment '到达时间',
	departure varchar(30) not null comment '出发地',
	destination varchar(30) not null comment '目的地'
);

