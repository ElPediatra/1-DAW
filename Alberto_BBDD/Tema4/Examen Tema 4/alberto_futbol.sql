DROP DATABASE IF EXISTS futbol;
CREATE DATABASE futbol;
USE futbol;
DROP TABLE IF EXISTS Provincia;
DROP TABLE IF EXISTS Estadio;
DROP TABLE IF EXISTS Pais;
DROP TABLE IF EXISTS Equipo;
DROP TABLE IF EXISTS Peñas;
DROP TABLE IF EXISTS Situacion_de_nacionalidad;
DROP TABLE IF EXISTS Representante;
DROP TABLE IF EXISTS Jugador;
DROP TABLE IF EXISTS Demarcacion;

CREATE TABLE Provincia(
    Id CHAR (9) PRIMARY KEY,
    Nombre VARCHAR (20)
);

CREATE TABLE Estadio(
    Id CHAR (9) PRIMARY KEY,
    Nombre VARCHAR (40),
    Capacidad VARCHAR (10),
    Direccion VARCHAR (60),
    CP CHAR (5),
    Provincia CHAR (9),
    Telefono CHAR (9),
    Inauguracion DATE,
    Propietario VARCHAR (60),
    Dimensiones VARCHAR (10),
    Otras_Instalaciones TEXT NULL,
    Localidad VARCHAR (20),
    Foreign Key (Provincia) REFERENCES Provincia(Id) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE Pais(
    Id CHAR (9) PRIMARY KEY,
    Nombre VARCHAR (40),
    Abreviatura CHAR (3)
);

CREATE TABLE Equipo(
    Id CHAR (9) PRIMARY KEY,
    Nombre VARCHAR (20),
    Nombre_Oficial VARCHAR (60),
    Direccion VARCHAR (60),
    CP CHAR (5),
    Provincia CHAR (9),
    Pais CHAR (9),
    Direccion_Internet TEXT NULL,
    Email VARCHAR (60) NULL,
    Telefono CHAR (9),
    Fecha_de_fundacion DATE,
    Historia TEXT,
    Himno TEXT NULL,
    Estadio CHAR (9),
    Localidad VARCHAR (20),
    Foreign Key (Provincia) REFERENCES Provincia(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Pais) REFERENCES Pais(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Estadio) REFERENCES Estadio(Id) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE Peñas(
    Id_Equipo CHAR (9),
    Nombre VARCHAR (40),
    PRIMARY KEY (Id_Equipo,Nombre),
    Foreign Key (Id_Equipo) REFERENCES Equipo(Id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Situacion_de_nacionalidad(
    Id CHAR (9) PRIMARY KEY,
    Situacion enum ('Opcion','Residencia','Carta de naturaleza','Posesion de estado')
);

CREATE TABLE Representante(
    Id CHAR (9) PRIMARY KEY,
    Nombre VARCHAR (40)
);

CREATE TABLE Jugador(
    Id CHAR (9) PRIMARY KEY,
    Nombre_futbolistico VARCHAR (20),
    Nombre VARCHAR (20),
    Apellidos VARCHAR (40),
    Fecha_de_nacimiento DATE,
    Lugar_de_nacimiento VARCHAR (40),
    Provincia CHAR (9),
    Pais CHAR (9),
    Pie enum ('Derecho','Izquierdo'),
    Situacion CHAR (9),
    Altura CHAR (4),
    Peso CHAR (5),
    Cantera CHAR (9),
    Internacional BOOLEAN,
    Representante CHAR (9),
    Pais_nacionalidad VARCHAR (40),
    Retirado BOOLEAN,
    Foreign Key (Provincia) REFERENCES Provincia(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Pais) REFERENCES Pais(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Situacion) REFERENCES Situacion_de_nacionalidad(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Cantera) REFERENCES Equipo(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Representante) REFERENCES Representante(Id) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE Demarcacion(
    Jugador CHAR (9),
    Demarcacion ENUM ('Portero','Defensa','Centrocampista','Delantero'),
    PRIMARY KEY (Jugador, Demarcacion),
    Foreign Key (Jugador) REFERENCES Jugador(Id) ON UPDATE CASCADE ON DELETE CASCADE
);