DROP DATABASE IF EXISTS ajedrez;
CREATE DATABASE ajedrez;
USE ajedrez;
DROP TABLE IF EXISTS Pais;
DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS Campeonatos_Persona;
DROP TABLE IF EXISTS Jugador;
DROP TABLE IF EXISTS Arbitro;
DROP TABLE IF EXISTS Hotel;
DROP TABLE IF EXISTS Aloja;
DROP TABLE IF EXISTS Sala;
DROP TABLE IF EXISTS Medios_Sala;
DROP TABLE IF EXISTS Partida;
DROP TABLE IF EXISTS Movimiento;

CREATE TABLE Pais(
    Numero INT PRIMARY KEY,
    Nombre VARCHAR (40),
    N_clubes INT,
    Pais_representador INT,
    Foreign Key (Pais_representador) REFERENCES Pais(Numero) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE Persona(
    N_asociado CHAR (9) PRIMARY KEY,
    Nombre VARCHAR (40),
    Direccion VARCHAR (60),
    Telefono CHAR (9),
    Pais INT,
    Foreign Key (Pais) REFERENCES Pais(Numero) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE Campeonatos_Persona(
    N_asociado CHAR (9),
    Campeonato VARCHAR (200), /* CON TEXT NO DEJA, PIDE QUE AL SER UNA PRIMARY KEY TIENE QUE TENER UNA LONGITUD */
    PRIMARY KEY (N_asociado,Campeonato),
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Jugador(
    N_asociado CHAR (9) PRIMARY KEY,
    Nivel ENUM ('1','2','3','4','5','6','7','8','9','10'),
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Arbitro(
    N_asociado CHAR (9) PRIMARY KEY,
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Hotel(
    Nombre VARCHAR (40) PRIMARY KEY,
    Direccion VARCHAR (60),
    Telefono CHAR (9)
);

CREATE TABLE Aloja(
    N_asociado CHAR (9),
    Nombre_hotel VARCHAR (40),
    Fecha DATE,
    PRIMARY KEY (N_asociado,Nombre_hotel),
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE CASCADE,
    Foreign Key (Nombre_hotel) REFERENCES Hotel(Nombre) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE Sala(
    Id_sala CHAR (9) PRIMARY KEY,
    Nombre_hotel VARCHAR (40),
    Capacidad INT,
    Foreign Key (Nombre_hotel) REFERENCES Hotel(Nombre) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Medios_Sala(
    id_sala CHAR (9),
    Medio VARCHAR (20),
    PRIMARY KEY (id_sala,Medio),
    Foreign Key (id_sala) REFERENCES Sala(Id_sala) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Partida(
    Cod_Partida INT AUTO_INCREMENT PRIMARY KEY,
    dia_jornada INT,
    mes_jornada INT,
    año_jornada YEAR,
    Jugador1 CHAR (9),
    color_jugador1 ENUM ('Blancas','Negras'),
    Jugador2 CHAR (9),
    color_jugador2 ENUM ('Blancas','Negras'),
    Arbitro CHAR (9),
    Id_sala CHAR (9),
    Entradas_vendidas INT,
    Foreign Key (Jugador1) REFERENCES Jugador(N_asociado) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Jugador2) REFERENCES Jugador(N_asociado) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Arbitro) REFERENCES Arbitro(N_asociado) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Id_sala) REFERENCES Sala(Id_sala) ON UPDATE CASCADE ON DELETE SET NULL
);

CREATE TABLE Movimiento(
    Codigo INT PRIMARY KEY,
    Comentario TEXT,
    Jugada VARCHAR (20),
    cod_partida INT,
    Foreign Key (cod_partida) REFERENCES Partida(Cod_Partida) ON UPDATE CASCADE ON DELETE CASCADE
);