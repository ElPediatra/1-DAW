SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Compra;
DROP TABLE IF EXISTS Cliente;
DROP TABLE IF EXISTS Producto;
DROP TABLE IF EXISTS Proveedor;




/* Create Tables */

CREATE TABLE Cliente
(
	DNI char(4) NOT NULL,
	Nombre char(12),
	Apellidos char(12),
	Direccion char(32),
	Fecha_nac date,
	PRIMARY KEY (DNI)
);


CREATE TABLE Compra
(
	DNI char(4) NOT NULL,
	Codigo char(4) NOT NULL,
	Fecha date
);


CREATE TABLE Producto
(
	Codigo char(4) NOT NULL,
	Nombre char(12),
	Precio int(2),
	NIF char(9) NOT NULL,
	PRIMARY KEY (Codigo)
);


CREATE TABLE Proveedor
(
	NIF char(9) NOT NULL,
	Nombre char(12),
	Direccion char(32),
	PRIMARY KEY (NIF)
);



/* Create Foreign Keys */

ALTER TABLE Compra
	ADD FOREIGN KEY (DNI)
	REFERENCES Cliente (DNI)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Compra
	ADD FOREIGN KEY (Codigo)
	REFERENCES Producto (Codigo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Producto
	ADD FOREIGN KEY (NIF)
	REFERENCES Proveedor (NIF)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



