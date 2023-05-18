/* Alberto Gómez Morales - 1º DAW - Base de Datos
 Examen Tercera Evaluación - Tema 5 - Explotación de Bases de Datos en MySQL
 PRIMERA PARTE:
  */

DROP DATABASE IF EXISTS ProvEnvios;
CREATE DATABASE ProvEnvios;
USE ProvEnvios;

CREATE TABLE Proveedores (
	CodProv varchar(3),
	Pnombre varchar(15),
	Categoria int,
	Ciudad varchar(15),
	CONSTRAINT pk_Proveedores PRIMARY KEY (CodProv)
);

INSERT INTO Proveedores VALUES ('P1', 'Carlos', 20, 'Sevilla');
INSERT INTO Proveedores VALUES ('P2', 'Juan', 10, 'Madrid');
INSERT INTO Proveedores VALUES ('P3', 'José', 30, 'Sevilla');
INSERT INTO Proveedores VALUES ('P4', 'Inma', 20, 'Sevilla');
INSERT INTO Proveedores VALUES ('P5', 'Eva', 30, 'Cáceres');

CREATE TABLE Componentes (
	CodComp varchar(3),
	Cnombre varchar(10),
	Color varchar(10),
	Peso int,
	Ciudad varchar(15),
	CONSTRAINT pk_Componentes PRIMARY KEY (CodComp)
);

INSERT INTO Componentes VALUES ('C1', 'X3A', 'Rojo', 12, 'Sevilla');
INSERT INTO Componentes VALUES ('C2', 'B85', 'Verde', 17, 'Madrid');
INSERT INTO Componentes VALUES ('C3', 'C4B', 'Azul', 17, 'Málaga');
INSERT INTO Componentes VALUES ('C4', 'C4B', 'Rojo', 14, 'Sevilla');
INSERT INTO Componentes VALUES ('C5', 'VT8', 'Azul', 12, 'Madrid');
INSERT INTO Componentes VALUES ('C6', 'C30', 'Rojo', 19, 'Sevilla');

CREATE TABLE Articulos (
	CodArt varchar(3),
	Anombre varchar(15),
	Ciudad varchar(15),
	CONSTRAINT pk_Articulos PRIMARY KEY (CodArt)
);

INSERT INTO Articulos VALUES ('A1', 'Clasificadora', 'Madrid');
INSERT INTO Articulos VALUES ('A2', 'Perforadora', 'Málaga');
INSERT INTO Articulos VALUES ('A3', 'Lectora', 'Cáceres');
INSERT INTO Articulos VALUES ('A4', 'Consola', 'Cáceres');
INSERT INTO Articulos VALUES ('A5', 'Mezcladora', 'Sevilla');
INSERT INTO Articulos VALUES ('A6', 'Terminal', 'Barcelona');
INSERT INTO Articulos VALUES ('A7', 'Cinta', 'Sevilla');

CREATE TABLE Envios (
	CodProv varchar(3),
	CodComp varchar(3),
	CodArt varchar(3),
	Cantidad int,
	CONSTRAINT pk_Envios PRIMARY KEY (CodProv, CodComp, CodArt),
	CONSTRAINT fk_Envios_Proveedores FOREIGN KEY (CodProv)
		REFERENCES Proveedores(CodProv),
	CONSTRAINT fk_Envios_Componentes FOREIGN KEY (CodComp)
		REFERENCES Componentes(CodComp),
	CONSTRAINT fk_Envios_Articulos FOREIGN KEY (CodArt)
		REFERENCES Articulos (CodArt)
);

INSERT INTO Envios VALUES ('P1', 'C1', 'A1', 200);
INSERT INTO Envios VALUES ('P1', 'C1', 'A4', 700);
INSERT INTO Envios VALUES ('P2', 'C3', 'A1', 400);
INSERT INTO Envios VALUES ('P2', 'C3', 'A2', 200);
INSERT INTO Envios VALUES ('P2', 'C3', 'A3', 200);
INSERT INTO Envios VALUES ('P2', 'C3', 'A4', 500);
INSERT INTO Envios VALUES ('P2', 'C3', 'A5', 600);
INSERT INTO Envios VALUES ('P2', 'C3', 'A6', 400);
INSERT INTO Envios VALUES ('P2', 'C3', 'A7', 800);
INSERT INTO Envios VALUES ('P2', 'C5', 'A2', 100);
INSERT INTO Envios VALUES ('P3', 'C3', 'A1', 200);
INSERT INTO Envios VALUES ('P3', 'C4', 'A2', 500);
INSERT INTO Envios VALUES ('P4', 'C6', 'A3', 300);
INSERT INTO Envios VALUES ('P4', 'C6', 'A7', 300);
INSERT INTO Envios VALUES ('P5', 'C2', 'A2', 200);
INSERT INTO Envios VALUES ('P5', 'C2', 'A4', 100);
INSERT INTO Envios VALUES ('P5', 'C5', 'A4', 500);
INSERT INTO Envios VALUES ('P5', 'C5', 'A7', 100);
INSERT INTO Envios VALUES ('P5', 'C6', 'A2', 200);
INSERT INTO Envios VALUES ('P5', 'C1', 'A4', 100);
INSERT INTO Envios VALUES ('P5', 'C3', 'A4', 200);
INSERT INTO Envios VALUES ('P5', 'C4', 'A4', 800);
INSERT INTO Envios VALUES ('P5', 'C5', 'A5', 400);
INSERT INTO Envios VALUES ('P5', 'C6', 'A4', 500);

/* Para cada uno de los siguientes apartados, cea la consulta SQL con el resultado deseado:
	1. Obtener de la tabla de artículos los valores de CodArt y Ciudad donde el nombre de la Ciudad acaba en d o contiene al menos una e. */

SELECT CodArt, Ciudad
FROM Articulos
WHERE Ciudad LIKE '%d' OR Ciudad LIKE '%e%';

/*	2. Obtener los nombres de los Componentes que pesen entre 15 y 18 kg. */

SELECT Cnombre
FROM Componentes
WHERE Peso BETWEEN 15 AND 18;


/*	3. Obtener la Cantidad media de envíos de los Artículos procedentes de Cáceres. */

SELECT AVG(Cantidad) AS CantidadPromedio
FROM Envios
JOIN Articulos ON Envios.CodArt = Articulos.CodArt
WHERE Articulos.Ciudad = 'Cáceres';

/*	4. Obtener el Nombre de los Componentes enviados por el Proveedor Juan. No pueden repetirse. */

SELECT DISTINCT Componentes.Cnombre
FROM Envios
JOIN Componentes ON Envios.CodComp = Componentes.CodComp
JOIN Proveedores ON Envios.CodProv = Proveedores.CodProv
WHERE Proveedores.Pnombre = 'Juan';

/*	5. Obtener la Ciudad de los Proveedores que envían Componentes desde la Ciudad de Sevilla para Artículos */

SELECT DISTINCT Proveedores.Ciudad
FROM Envios
JOIN Proveedores ON Envios.CodProv = Proveedores.CodProv
JOIN Componentes ON Envios.CodComp = Componentes.CodComp
JOIN Articulos ON Envios.CodArt = Articulos.CodArt
WHERE Componentes.Ciudad = 'Sevilla' AND Articulos.Ciudad = 'Sevilla';