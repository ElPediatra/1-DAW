Use Liga;

DROP TABLE IF EXISTS Goles;
DROP TABLE IF EXISTS Jugadores;
DROP TABLE IF EXISTS Partidos;
DROP TABLE IF EXISTS Equipos;
DROP TABLE IF EXISTS Presidentes;

CREATE TABLE Presidentes (
	Dni char(9),
	Nombre varchar(40) NOT NULL,
	Apellidos varchar(40) NOT NULL,
	Fecha_nac date,
	Anno YEAR NOT NULL,
	CONSTRAINT pk_presidentes PRIMARY KEY (Dni)
);

CREATE TABLE Equipos (
	Codigo char(5),
	Nombre varchar(40) NOT NULL,
	Estadio varchar(40) NOT NULL,
	Aforo integer,
	Fundacion date,
	Ciudad varchar(20) NOT NULL,
	Presidente char(9) NOT NULL,
	CONSTRAINT pk_equipos PRIMARY KEY (Codigo),
	CONSTRAINT fk_equiposPresidentes FOREIGN KEY (Presidente)
		REFERENCES Presidentes (Dni)
		ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE Partidos (
	Codigo char(4),
	Fecha date NOT NULL,
	Equipo_local char(5) NOT NULL,
	Equipo_visitante char(5) NOT NULL,
	CONSTRAINT pk_partidos PRIMARY KEY (Codigo),
	CONSTRAINT fk_partidosEquipos1 FOREIGN KEY (Equipo_local)
		REFERENCES Equipos(Codigo)
		ON UPDATE CASCADE ON DELETE RESTRICT,
	CONSTRAINT fk_partidosEquipos2 FOREIGN KEY (Equipo_visitante)
		REFERENCES Equipos(Codigo)
		ON UPDATE CASCADE ON DELETE RESTRICT
);
	
CREATE TABLE Jugadores (
	Codigo char(5),
	Nombre varchar(40) NOT NULL,
	Fecha date NOT NULL,
	Posicion enum('portero', 'defensa', 'centrocampista', 'delantero') NOT NULL,
	Cod_equipo char(5) NOT NULL,
	CONSTRAINT pk_jugadores PRIMARY KEY (Codigo),
	CONSTRAINT fk_jugadoresEquipos FOREIGN KEY (Cod_equipo)
		REFERENCES Equipos(Codigo)
		ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE Goles (
	Cod_partido char (4),
	Minuto TINYINT,
	Descripcion text,
	Cod_jugador char(5) NOT NULL,
	PropiaPuerta boolean NOT NULL,
	CONSTRAINT pk_goles PRIMARY KEY (Cod_partido, minuto),
	CONSTRAINT fk_golesPartidos FOREIGN KEY (Cod_partido)
		REFERENCES Partidos(Codigo)
			ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_golesJugadores FOREIGN KEY (Cod_jugador)
		REFERENCES Jugadores(Codigo)
		ON UPDATE CASCADE ON DELETE RESTRICT
);