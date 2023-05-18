/* Alberto Gómez Morales - 1º DAW - Base de Datos
 Examen Tercera Evaluación - Tema 5 - Explotación de Bases de Datos en MySQL
 SEGUNDA PARTE:
  */

DROP DATABASE IF EXISTS ProyecPPS;

CREATE DATABASE ProyecPPS;
USE ProyecPPS;

CREATE TABLE Proveedores (
	CodProv CHAR(2),
	NombreProv VARCHAR(20),
	Situacion VARCHAR(10),
	Ciudad VARCHAR(20),
	CONSTRAINT pk_Proveedores PRIMARY KEY (CodProv)
);

CREATE TABLE Piezas (
	CodPieza CHAR(2),
	NombrePieza VARCHAR(20),
	Color VARCHAR(10),
	Peso INT,
	Ciudad VARCHAR(20),
	CONSTRAINT pk_Piezas PRIMARY KEY (CodPieza)
);

CREATE TABLE Proyectos (
	CodProy CHAR(2),
	NombreProy VARCHAR(20),
	Ciudad VARCHAR(20),
	CONSTRAINT pk_Proyectos PRIMARY KEY (CodProy)
);

CREATE TABLE Suministros (
	CodProv CHAR(2),
	CodPieza CHAR(2),
	CodProy CHAR(2),
 	Cantidad INT,
	CONSTRAINT pk_Suministros PRIMARY KEY (CodProv, CodPieza, CodProy),
	CONSTRAINT fk_sum_prov FOREIGN KEY (CodProv) REFERENCES Proveedores(CodProv),
	CONSTRAINT fk_sum_piezas FOREIGN KEY (CodPieza) REFERENCES Piezas(CodPieza),
	CONSTRAINT fk_sum_proy FOREIGN KEY (CodProy) REFERENCES Proyectos(CodProy)
);

INSERT INTO Proveedores VALUES ('S1','prov_1','activo','Sevilla');
INSERT INTO Proveedores VALUES ('S2','prov_2','jubilado','Londres');
INSERT INTO Proveedores VALUES ('S3','prov_3','vacaciones','Madrid');
INSERT INTO Proveedores VALUES ('S4','prov_4','activo','Londres');
INSERT INTO Proveedores VALUES ('S5','prov_5','activo','Huelva');


INSERT INTO Piezas VALUES ('P1','Piezas_1','rojo', 10, 'Sevilla');
INSERT INTO Piezas VALUES ('P2','Piezas_2','azul', 20, 'Londres');
INSERT INTO Piezas VALUES ('P3','Piezas_3','rojo', 30, 'Huelva');
INSERT INTO Piezas VALUES ('P4','Piezas_4','azul', 40, 'Sevilla');
INSERT INTO Piezas VALUES ('P5','Piezas_5','verde', 10, 'Huelva');
INSERT INTO Piezas VALUES ('P6','Piezas_6','rojo', 20, 'Sevilla');

INSERT INTO Proyectos VALUES ('J1','proy_1','Sevilla');
INSERT INTO Proyectos VALUES ('J2','proy_2','Londres');
INSERT INTO Proyectos VALUES ('J3','proy_3','Huelva');
INSERT INTO Proyectos VALUES ('J4','proy_4','Sevilla');
INSERT INTO Proyectos VALUES ('J5','proy_5','Huelva');
INSERT INTO Proyectos VALUES ('J6','proy_6','Sevilla');
INSERT INTO Proyectos VALUES ('J7','proy_7','Londres');


INSERT INTO Suministros VALUES ('S1','P1','J1',200);
INSERT INTO Suministros VALUES ('S1','P1','J4',700);
INSERT INTO Suministros VALUES ('S2','P3','J1',400);
INSERT INTO Suministros VALUES ('S2','P3','J2',200);
INSERT INTO Suministros VALUES ('S2','P3','J3',200);
INSERT INTO Suministros VALUES ('S2','P3','J4',500);
INSERT INTO Suministros VALUES ('S2','P3','J5',600);
INSERT INTO Suministros VALUES ('S2','P3','J6',400);
INSERT INTO Suministros VALUES ('S2','P3','J7',800);
INSERT INTO Suministros VALUES ('S2','P5','J2',100);
INSERT INTO Suministros VALUES ('S3','P3','J1',200);
INSERT INTO Suministros VALUES ('S3','P4','J2',500);
INSERT INTO Suministros VALUES ('S4','P6','J3',300);
INSERT INTO Suministros VALUES ('S4','P6','J7',300);
INSERT INTO Suministros VALUES ('S5','P2','J2',200);
INSERT INTO Suministros VALUES ('S5','P2','J4',100);
INSERT INTO Suministros VALUES ('S5','P5','J4',500);
INSERT INTO Suministros VALUES ('S5','P5','J7',100);
INSERT INTO Suministros VALUES ('S5','P6','J2',200);
INSERT INTO Suministros VALUES ('S5','P1','J4',100);
INSERT INTO Suministros VALUES ('S5','P3','J4',200);
INSERT INTO Suministros VALUES ('S5','P4','J4',800);
INSERT INTO Suministros VALUES ('S5','P5','J5',400);
INSERT INTO Suministros VALUES ('S5','P6','J4',500);

/*
Para cada uno de los siguientes apartados, crea la consulta SQL con el resultado deseado:
	6. Obtener una lista de todas las combinaciones posibles Color/Ciudad de las piezas, eliminando todas las parejas repetidas.*/

SELECT DISTINCT Color, Ciudad
FROM Piezas;


/*	7. Obtener todos los Suministros para los cuales la Cantidad no sea nula. */

SELECT *
FROM Suministros
WHERE Cantidad IS NOT NULL;


/*	8. Obtener todas las tripletas de códigos de Proveedor, Pieza y Proyecto tales que el Proveedor, la Pieza y el Proyecto indicados estén todos en diferente ciudad. */

SELECT suministros.CodProv, suministros.CodPieza, suministros.CodProy
FROM Suministros suministros
JOIN Proveedores proveedor ON suministros.CodProv = proveedor.CodProv
JOIN Piezas pieza ON suministros.CodPieza = pieza.CodPieza
JOIN Proyectos proyecto ON suministros.CodProy = proyecto.CodProy
WHERE proveedor.Ciudad <> pieza.Ciudad AND proveedor.Ciudad <> proyecto.Ciudad AND pieza.Ciudad <> proyecto.Ciudad;


/*	9. Obtener todas las parejas de nombres de Ciudad (sin repetirse) tales que un proveedor de la primera Ciudad suministre Piezas a un Proyecto en la segunda Ciudad. */

SELECT DISTINCT proveedor1.Ciudad, proveedor2.Ciudad
FROM Proveedores proveedor1
JOIN Suministros suministro ON proveedor1.CodProv = suministro.CodProv
JOIN Proyectos proyecto ON suministro.CodProy = proyecto.CodProy
JOIN Piezas pieza ON suministro.CodPieza = pieza.CodPieza
JOIN Proveedores proveedor2 ON pieza.Ciudad = proveedor2.Ciudad
WHERE proveedor1.Ciudad <> proveedor2.Ciudad;


/*	10. Obtener los códigos de las Piezas suministradas a cualquier Proyecto en Londres. */

SELECT DISTINCT suministro.CodPieza
FROM Suministros suministro
JOIN Proyectos proyecto ON suministro.CodProy = proyecto.CodProy
WHERE proyecto.Ciudad = 'Londres';