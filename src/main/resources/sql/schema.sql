 
 CREATE TABLE pharmasist 
  ( 
     id                 BIGINT NOT NULL, 
     email              VARCHAR(255), 
     pharmasist_address VARCHAR(255), 
     pharmasist_name    VARCHAR(255), 
     PRIMARY KEY (id) 
  ); 

CREATE TABLE product 
  ( 
     id               BIGINT NOT NULL, 
     company_name     VARCHAR(512), 
     distributor_name VARCHAR(255), 
     generic_name     VARCHAR(600), 
     NAME             VARCHAR(255), 
     price            VARCHAR(255), 
     PRIMARY KEY (id) 
  ); 

CREATE TABLE stockist_distributor 
  ( 
     id                 BIGINT NOT NULL, 
     address            VARCHAR(255), 
     available_quantity INTEGER, 
     email              VARCHAR(255), 
     product_id         BIGINT, 
     stockist_name      VARCHAR(255), 
     PRIMARY KEY (id) 
  ); 

CREATE TABLE product_order 
  ( 
     id             BIGINT NOT NULL, 
     creation_date  TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
     order_status   BOOLEAN, 
     quantity       INTEGER, 
     distributor_id BIGINT, 
     pharmasist_id  BIGINT, 
     product_id     BIGINT, 
     PRIMARY KEY (id) 
  ); 
  
ALTER TABLE product_order 
  ADD CONSTRAINT fks02c8oolwc3if7rcitdjvgkk7 FOREIGN KEY (distributor_id) 
  REFERENCES stockist_distributor; 

ALTER TABLE product_order 
  ADD CONSTRAINT fk3k67myv9j6bcru2r70r7jbtel FOREIGN KEY (pharmasist_id) 
  REFERENCES pharmasist; 

ALTER TABLE product_order 
  ADD CONSTRAINT fkh73acsd9s5wp6l0e55td6jr1m FOREIGN KEY (product_id) REFERENCES 
  product; 
  
	
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