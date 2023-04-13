/*Alberto Gómez Morales*/

/*1º*/
SELECT count(*)
FROM Equipos;

/*2º*/
SELECT MAX(Fecha_nac)
FROM presidentes;

/*3º*/
SELECT MIN(Fecha)
FROM Partidos;

/*4º*/
SELECT COUNT(*) AS num_penaltis
FROM Goles
WHERE Descripcion LIKE '%penalti%';

/*5º*/
SELECT COUNT(*) FROM Jugadores WHERE posicion = 'portero';

/*6º*/
SELECT COUNT(*) AS Delanteros_Zamora
FROM Jugadores, Equipos
WHERE Jugadores.Cod_equipo = Equipos.Codigo
And Jugadores.Posicion='Delantero'
AND Equipos.Nombre="Atlético Zamora";
SELECT COUNT(*) FROM Jugadores 
INNER JOIN Equipos ON Jugadores.cod_equipo = Equipos.nombre
WHERE Equipos.nombre = 'Atlético Zamora' AND Jugadores.posicion = 'delantero';

/*7º*/
SELECT COUNT(*) AS Defensas_Zamora
FROM Jugadores, Equipos
WHERE Jugadores.Cod_equipo = Equipos.Codigo
And Jugadores.Posicion='Defensa'
AND Equipos.Nombre="Atlético Zamora";

/*8º*/
SELECT nombre, fecha FROM Jugadores 
ORDER BY fecha 
LIMIT 3;

/*9º*/
SELECT nombre, fecha FROM Jugadores 
ORDER BY fecha
LIMIT 3, 4  ;
/*10º*/
SELECT COUNT(*) AS Goles_segunda_parte
FROM Goles
WHERE Minuto>45;
/*11º*/
SELECT COUNT(*) FROM Jugadores WHERE nombre LIKE 'P%';

/*12º*/
SELECT MAX(aforo) AS mayor_aforo FROM equipos;


/*13º*/
SELECT AVG(aforo) FROM Equipos, Presidentes
WHERE Equipos.Presidente=Presidentes.Dni 
And Presidentes.Apellidos LIKE '%s';