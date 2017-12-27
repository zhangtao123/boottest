create table a
(
	name varchar(20) null,
	type varchar(20) null,
	discount float null,
	add1 varchar(20) null,
	add2 varchar(20) null,
	add3 varchar(20) null
)
engine=InnoDB
;

create table b
(
	name varchar(20) null,
	account varchar(20) not null,
	`add` varchar(20) null,
	money varchar(20) null,
	qianfei int null,
	zhoukouqianfei float null
)
engine=InnoDB
;

create index n_c_m
	on b (name, account, money)
;

create table b_copy
(
	name varchar(20) null,
	account varchar(20) not null,
	`add` varchar(20) null,
	money varchar(20) null,
	qianfei int null,
	zhoukouqianfei float null
)
engine=InnoDB
;

create table bbs_brand
(
	id bigint auto_increment comment 'ID'
		primary key,
	name varchar(40) not null comment '名称',
	description varchar(80) null comment '描述',
	img_url varchar(80) null comment '图片Url',
	web_site varchar(80) null comment '品牌网址',
	sort int null comment '排序:最大最排前',
	is_display tinyint(1) null comment '是否可见 1:可见 0:不可见'
)
comment '品牌' engine=InnoDB
;

create table bbs_buyer
(
	id bigint auto_increment comment '主键'
		primary key,
	username varchar(18) not null comment '用户名',
	password varchar(32) null comment '密码',
	gender int(1) null comment '性别:0:保密,1:男,2:女',
	email varchar(50) null comment '邮箱',
	real_name varchar(8) null comment '真实名字',
	register_time datetime null comment '注册时间',
	province varchar(11) null comment '省ID',
	city varchar(11) null comment '市ID',
	town varchar(11) null comment '县ID',
	addr varchar(255) null comment '地址',
	is_del tinyint(1) null comment '是否已删除:1:未,0:删除了'
)
comment '购买者' engine=InnoDB
;

create table bbs_color
(
	id bigint auto_increment comment 'ID'
		primary key,
	name varchar(20) null comment '名称',
	parent_id bigint null comment '父ID为色系',
	img_url varchar(50) null comment '颜色对应的衣服小图'
)
comment '颜色大全' engine=InnoDB
;

create table bbs_detail
(
	id bigint auto_increment comment 'ID'
		primary key,
	order_id bigint not null comment '订单ID',
	product_id bigint null comment '商品编号',
	product_name varchar(255) null comment '商品名称',
	color varchar(11) not null comment ' 颜色名称',
	size varchar(11) not null comment '尺码',
	price float(8,2) not null comment '商品销售价',
	amount int not null comment '购买数量'
)
comment '订单详情' engine=InnoDB
;

create index fk_order_id
	on bbs_detail (order_id)
;

create table bbs_order
(
	id bigint auto_increment comment 'ID或订单号'
		primary key,
	deliver_fee float(8,2) not null comment '运费',
	total_price float(8,2) not null comment '应付金额',
	order_price float(8,2) not null comment '订单金额',
	payment_way tinyint(1) not null comment '支付方式 0:到付 1:在线 2:邮局 3:公司转帐',
	payment_cash tinyint(1) null comment '货到付款方式.1现金,2POS刷卡',
	delivery tinyint(1) null comment '送货时间',
	is_confirm tinyint(1) null comment '是否电话确认 1:是  0: 否',
	is_paiy tinyint(1) not null comment '支付状态 :0到付1待付款,2已付款,3待退款,4退款成功,5退款失败',
	order_state tinyint(1) not null comment '订单状态 0:提交订单 1:仓库配货 2:商品出库 3:等待收货 4:完成 5待退货 6已退货',
	create_date datetime not null comment '订单生成时间',
	note varchar(100) null comment '附言',
	buyer_id bigint not null comment '用户ID'
)
comment '订单' engine=InnoDB
;

create index buyer_id
	on bbs_order (buyer_id)
;

create table bbs_product
(
	id bigint auto_increment comment 'ID或商品编号'
		primary key,
	brand_id bigint null comment '品牌ID',
	name varchar(255) not null comment '商品名称',
	weight float(8,2) null comment '重量 单位:克',
	is_new tinyint(1) null comment '是否新品:0:旧品,1:新品',
	is_hot tinyint(1) null comment '是否热销:0,否 1:是',
	is_commend tinyint(1) null comment '推荐 1推荐 0 不推荐',
	is_show tinyint(1) null comment '上下架:0否 1是',
	img_url longtext null comment '商品图片集',
	is_del tinyint(1) null comment '是否删除:0删除,1,没删除',
	description longtext null comment '商品描述',
	package_list longtext null comment '包装清单',
	colors varchar(255) null comment '颜色集',
	sizes varchar(255) null comment '尺寸集',
	create_time datetime null comment '添加时间'
)
comment '商品' engine=InnoDB
;

create index brand_id
	on bbs_product (brand_id)
;

create table bbs_sku
(
	id bigint auto_increment comment 'ID'
		primary key,
	product_id bigint not null comment '商品ID',
	color_id bigint null comment '颜色ID',
	size varchar(5) null comment '尺码',
	market_price float(8,2) null comment '市场价',
	price float(8,2) not null comment '售价',
	delive_fee float(8,2) null comment '运费 默认10元',
	stock int(5) not null comment '库存',
	upper_limit int(5) null comment '购买限制',
	create_time datetime null
)
comment '最小销售单元' engine=InnoDB
;

create index product_id
	on bbs_sku (product_id)
;

create index color_id
	on bbs_sku (color_id)
;

create table test
(
	t1 timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
	t2 timestamp default '0000-00-00 00:00:00' not null
)
engine=InnoDB
;