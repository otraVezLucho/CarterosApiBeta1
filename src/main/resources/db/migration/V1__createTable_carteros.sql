CREATE TABLE IF NOT EXISTS carteros(

     id bigint not null AUTO_INCREMENT,
     nombre varchar(100) not null,
     email varchar(50) not null unique,
     contacto varchar(20) not null unique,
     documento varchar(10) unique,
     marca varchar(100) not null,
     modelo varchar(100) not null,
     placa varchar(7) not null unique,
     direccion varchar(100) not null,
     ciudad varchar(100) not null,
     barrio varchar(100) not null,
     usuario varchar(100) not null,

     primary key(id)
);