CREATE SEQUENCE SEQ_ESTADO;

CREATE TABLE ESTADO(
    ESTADOID NUMERIC(20),
    SIGLA VARCHAR(2),
    CONSTRAINT PK_ESTADO PRIMARY KEY (ESTADOID)
);