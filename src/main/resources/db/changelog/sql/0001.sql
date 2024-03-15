--liquibase formatted sql
--changeset owpk:ref-dict-1 runOnChange:true logicalFilePath:path-independent

CREATE TABLE IF NOT EXISTS example (
    id varchar(255) PRIMARY KEY NOT NULL,
    age integer,
    name varchar(255) UNIQUE
);
