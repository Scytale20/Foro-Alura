CREATE TABLE topicos (
    id bigint not null auto_increment,
    titulo VARCHAR(100) not null,
    mensaje VARCHAR(500),
    fecha_creacion DATE,
    estatus VARCHAR(20) not null,
    autor VARCHAR(50) not null,
    curso VARCHAR(50) not null,

    primary key (id)
);