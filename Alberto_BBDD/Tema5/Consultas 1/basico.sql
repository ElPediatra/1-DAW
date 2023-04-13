/*Alberto Gómez Morales*/

/*1º*/
SELECT * FROM presidentes

/*2º*/
SELECT * FROM partidos

/*3º*/
SELECT Nombre,Cod_equipo FROM jugadores
/*4º*/
SELECT Estadio,Aforo FROM Equipos
/*5º*/
SELECT Posicion FROM Jugadores
/*6º*/
SELECT DISTINCT Posicion FROM Jugadores
/*7º*/
SELECT * FROM Jugadores WHERE Cod_equipo= '4';
/*8º*/
SELECT DISTINCT * FROM Jugadores WHERE Cod_equipo = '3' 
/*9º*/
SELECT Descripcion,Cod_jugador FROM goles WHERE Minuto<=45;
/*10º*/
SELECT * FROM presidentes WHERE Fecha_nac>2006
/*11º*/
SELECT * FROM goles WHERE Minuto>=30 AND Minuto<=60;
/*12º*/
SELECT * FROM equipos WHERE Ciudad LIKE '%s';
/*13º*/
SELECT * FROM jugadores WHERE Cod_equipo='3' AND Posicion='Delantero';
/*14º*/
SELECT * FROM jugadores WHERE Cod_equipo='3';
 SELECT * FROM jugadores Where Posicion='Delantero';
 /*15º*/
 SELECT * FROM goles WHERE Descripcion LIKE '%penalti%';
 /*16º*/
 SELECT * FROM jugadores WHERE Nombre LIKE 'i';
