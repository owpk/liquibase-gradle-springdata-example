--liquibase formatted sql
--changeset owpk:ref-dict-1 runOnChange:true logicalFilePath:path-independent

CREATE TABLE IF NOT EXISTS example (
    id bigserial PRIMARY KEY NOT NULL,
    age integer,
    name varchar(255) UNIQUE
);
