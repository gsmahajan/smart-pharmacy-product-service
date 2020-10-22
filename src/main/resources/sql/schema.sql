	create table product (
		id INT,
		name VARCHAR(200),
		price INT,
		distributor_name VARCHAR(200),
		generic_name VARCHAR(600),
		company_name VARCHAR(500)
	);

	create table pharmasist (
		id INT,
		pharmasist_name VARCHAR(50),
		pharmasist_address VARCHAR(50),
		email VARCHAR(50)
	);

	create table stockist_distrubutor (
		id INT,
		stockist_name VARCHAR(50),
		address VARCHAR(50),
		email VARCHAR(50),
		product_id INT,
		available_quantity INT
	);
	
	create table product_order (
		id INT,
		product_id INT,
		distributor_id INT,
		pharmasist_id INT,
		creation_date TIMESTAMP default CURRENT_TIMESTAMP,
		quantity INT,
		order_status boolean
	);

	/* hibernate wins :) */
 drop table if exists pharmasist CASCADE ;
 drop table if exists product CASCADE ;
 drop table if exists product_order CASCADE ;
 drop table if exists stockist_distrubutor CASCADE ;
 drop sequence if exists hibernate_sequence;
 create sequence hibernate_sequence start with 1 increment by 1;
 create table pharmasist (id bigint not null, email varchar(255), pharmasist_address varchar(255), pharmasist_name varchar(255), primary key (id));
 create table product (id bigint not null, company_name varchar(512), distributor_name varchar(255), generic_name varchar(600), name varchar(255), price varchar(255), primary key (id));
 create table product_order (id bigint not null, creation_date timestamp default current_timestamp, order_status boolean, quantity integer, distributor_id bigint, pharmasist_id bigint, product_id bigint, primary key (id));
 create table stockist_distrubutor (id bigint not null, address varchar(255), available_quantity integer, email varchar(255), product_id bigint, stockist_name varchar(255), primary key (id));
 alter table product_order add constraint FKs02c8oolwc3if7rcitdjvgkk7 foreign key (distributor_id) references stockist_distrubutor;
 alter table product_order add constraint FK3k67myv9j6bcru2r70r7jbtel foreign key (pharmasist_id) references pharmasist;
 alter table product_order add constraint FKh73acsd9s5wp6l0e55td6jr1m foreign key (product_id) references product;
 
	
/*
  DROP TABLE IF EXISTS SPRING_SESSION_ATTRIBUTES;
  DROP TABLE IF EXISTS SPRING_SESSION;

  CREATE TABLE SPRING_SESSION (
    PRIMARY_ID CHAR(36) NOT NULL,
    SESSION_ID CHAR(36) NOT NULL,
    CREATION_TIME BIGINT NOT NULL,
    LAST_ACCESS_TIME BIGINT NOT NULL,
    MAX_INACTIVE_INTERVAL INT NOT NULL,
    EXPIRY_TIME BIGINT NOT NULL,
    PRINCIPAL_NAME VARCHAR(100),
    CONSTRAINT SPRING_SESSION_PK PRIMARY KEY (PRIMARY_ID)
  );

  CREATE UNIQUE INDEX SPRING_SESSION_IX1 ON SPRING_SESSION (SESSION_ID);
  CREATE INDEX SPRING_SESSION_IX2 ON SPRING_SESSION (EXPIRY_TIME);
  CREATE INDEX SPRING_SESSION_IX3 ON SPRING_SESSION (PRINCIPAL_NAME);

  CREATE TABLE SPRING_SESSION_ATTRIBUTES (
    SESSION_PRIMARY_ID CHAR(36) NOT NULL,
    ATTRIBUTE_NAME VARCHAR(200) NOT NULL,
    ATTRIBUTE_BYTES LONGVARBINARY NOT NULL,
    CONSTRAINT SPRING_SESSION_ATTRIBUTES_PK PRIMARY KEY (SESSION_PRIMARY_ID, ATTRIBUTE_NAME),
    CONSTRAINT SPRING_SESSION_ATTRIBUTES_FK FOREIGN KEY (SESSION_PRIMARY_ID) REFERENCES SPRING_SESSION(PRIMARY_ID) ON DELETE CASCADE
  );
  */