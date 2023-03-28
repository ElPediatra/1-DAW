SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Revision;
DROP TABLE IF EXISTS Vehiculo;
DROP TABLE IF EXISTS Cliente;




/* Create Tables */

CREATE TABLE Cliente
(
	Cod_cliente varchar(8) NOT NULL,
	NIF varchar(9) NOT NULL,
	Nombre char(40) NOT NULL,
	PRIMARY KEY (Cod_cliente),
	UNIQUE (Cod_cliente),
	UNIQUE (NIF)
);


CREATE TABLE Revision
(
	Cod_revision varchar(8) NOT NULL,
	Filtro boolean NOT NULL,
	Aceite boolean NOT NULL,
	Frenos boolean NOT NULL,
	Matricula varchar(7) NOT NULL,
	PRIMARY KEY (Cod_revision),
	UNIQUE (Cod_revision)
);


CREATE TABLE Vehiculo
(
	Matricula varchar(7) NOT NULL,
	Modelo char(40) NOT NULL,
	Marca char(20) NOT NULL,
	Cod_cliente varchar(8) NOT NULL,
	Fecha date,
	PRIMARY KEY (Matricula),
	UNIQUE (Matricula),
	UNIQUE (Cod_cliente)
);



/* Create Foreign Keys */

ALTER TABLE Vehiculo
	ADD CONSTRAINT Compra FOREIGN KEY (Cod_cliente)
	REFERENCES Cliente (Cod_cliente)
	ON UPDATE CASCADE
	ON DELETE RESTRICT
;


ALTER TABLE Revision
	ADD CONSTRAINT Pasa FOREIGN KEY (Matricula)
	REFERENCES Vehiculo (Matricula)
	ON UPDATE CASCADE
	ON DELETE RESTRICT
;



