USE MediatecaUDB;

CREATE TABLE TIPO_MATERIAL (
	id_tipo INT auto_increment PRIMARY KEY,
    nombre_tipo VARCHAR(30) NOT NULL
);

CREATE TABLE LIBROS (
	id_libro INT auto_increment PRIMARY KEY,
    titulo VARCHAR(50) NOT NULL,
    num_paginas INT NOT NULL,
    autor VARCHAR(20) NOT NULL,
    ISBN VARCHAR(15) UNIQUE NOT NULL,
    stock INT DEFAULT 0,
    year_libro INT NOT NULL,
    id_tipo INT,
    FOREIGN KEY (id_tipo) REFERENCES TIPO_MATERIAL(id_tipo)
);

CREATE TABLE REVISTA (
	id_revista INT auto_increment PRIMARY KEY,
    titulo VARCHAR(50) NOT NULL,
    editorial VARCHAR(20) NOT NULL,
    stock INT DEFAULT 0,
    periocidad VARCHAR(15) NOT NULL,
	id_tipo INT,
	FOREIGN KEY (id_tipo) REFERENCES TIPO_MATERIAL(id_tipo)
);

CREATE TABLE CD (
	id_cd INT auto_increment PRIMARY KEY,
    titulo VARCHAR(50) NOT NULL,
    genero VARCHAR(25) NOT NULL,
    duracion TIME NOT NULL,
    stock INT DEFAULT 0,
    num_canciones INT NOT NULL,
    artista VARCHAR(30) NOT NULL,
    id_tipo INT,
    FOREIGN KEY (id_tipo) REFERENCES TIPO_MATERIAL(id_tipo)
);

CREATE TABLE DVD (
	id_dvd INT auto_increment PRIMARY KEY,
    titulo VARCHAR(50) NOT NULL,
    duracion TIME NOT NULL,
    genero VARCHAR(25) NOT NULL,
    director VARCHAR(30) NOT NULL,
    id_tipo INT,
    FOREIGN KEY (id_tipo) REFERENCES TIPO_MATERIAL(id_tipo)
);