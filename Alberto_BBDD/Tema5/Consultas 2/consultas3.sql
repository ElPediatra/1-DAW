/* 1. Equipos que comiencen por H y terminen en S. */

SELECT * FROM Equipos WHERE Nombre LIKE 'H%s';

/* 2. Equipos que hay en la conferencia oeste ('west'). */

SELECT * FROM Equipos WHERE Conferencia = 'west';

/* 3. Jugadores de Arizona que pesen más de 100 kilos y midan más de 1.82m (6 pies). */

SELECT *
FROM Jugadores
WHERE Procedencia = 'Arizona' AND Altura >= '1.82' AND Peso > 100;

/* 4. Jugadores cuya tercera letra de su nombre sea la v. */

SELECT *
FROM Jugadores
WHERE SUBSTRING(Nombre, 3, 1) = 'v';

/* 5. Número de jugadores argentinos de la NBA. */

SELECT COUNT(*)
FROM Jugadores
WHERE Procedencia LIKE '%Argentina%';

/* 6. Máxima media de puntos de 'Lebron James' en su carrera. */

SELECT MAX(Puntos_por_partido)
FROM Estadisticas
WHERE Jugador = (
  SELECT Codigo
  FROM Jugadores
  WHERE Nombre = 'Lebron James'
);

/* 7.  Número de jugadores de España y Francia en la NBA. */

SELECT COUNT(*)
FROM Jugadores
WHERE Procedencia LIKE '%Spain%' OR Procedencia LIKE '%France%';

/* 8. Número de pívots 'C' que tiene cada equipo. */

SELECT Nombre_equipo, COUNT(*)
FROM Jugadores
WHERE Posicion = 'C'
GROUP BY Nombre_equipo;

/* 9. ¿Cuánto mide el pívot más alto de la NBA? */

SELECT MAX(CAST(Altura AS DECIMAL(4, 2)))
FROM Jugadores
WHERE Posicion = 'C';

/* 10. ¿Cuánto pesa (en libras y kilos) el pívot más alto de la NBA? */

SELECT Nombre, Altura, Peso, ROUND(Peso / 2.2046, 2) AS Peso_kg
FROM Jugadores
WHERE Altura = (
  SELECT MAX(CAST(Altura AS DECIMAL(4, 2)))
  FROM Jugadores
  WHERE Posicion = 'C'
);

/* 11. Número de jugadores que empiezan por Y */

SELECT COUNT(*)
FROM Jugadores
WHERE Nombre LIKE 'Y%';

/* 12. Peso medio en kilos y en libras de los jugadores de los 'Raptors'. */

SELECT 
  AVG(Peso) AS "Peso medio en kilos",
  AVG(Peso*2.20462) AS "Peso medio en libras"
FROM Jugadores
WHERE Nombre_equipo = 'Raptors';

/* 13. Mostrar un listado de jugadores con el formato Nombre(Equipo) en una columna. */

SELECT CONCAT(Nombre, '(', Nombre_equipo, ')') AS "Jugador" FROM Jugadores;

/* 14. Puntuación más baja de un partido de la NBA. */

SELECT MIN(Puntos_local), MIN(Puntos_visitante) FROM Partidos;

/* 15. Primeros 10 jugadores por orden alfabético. */

SELECT Nombre FROM Jugadores ORDER BY Nombre LIMIT 10;

/* 16. Número de equipos que tiene cada conferencia. */

SELECT Conferencia, COUNT(*) AS "Número de equipos" FROM Equipos GROUP BY Conferencia;

/* 17. Nombre de las divisiones de la conferencia Este. */

SELECT Division FROM Equipos WHERE Conferencia = 'Este';

/* 18. Sacar cuántas letras tiene el nombre de cada jugador de los 'grizzlies' (función LENGTH). */

SELECT Nombre, LENGTH(Nombre) AS "Número de letras" FROM Jugadores WHERE Nombre_equipo = 'Grizzlies';

/* 19. Sacar un listado con el número de partidos ganados por los equipos de la NBA. */

SELECT Equipo_local AS "Equipo", COUNT(CASE WHEN Puntos_local > Puntos_visitante THEN 1 END) + COUNT(CASE WHEN Puntos_local = Puntos_visitante THEN 0.5 END) AS "Partidos ganados"
FROM Partidos GROUP BY Equipo_local
UNION SELECT Equipo_visitante AS "Equipo", COUNT(CASE WHEN Puntos_visitante > Puntos_local THEN 1 END) + COUNT(CASE WHEN Puntos_visitante = Puntos_local THEN 0.5 END) AS "Partidos ganados"
FROM Partidos GROUP BY Equipo_visitante;

/* 20. Sacar la media de partidos ganados por los equipos del oeste. */

SELECT AVG(wins) AS "Media de partidos ganados por equipos del oeste" FROM (
SELECT Equipo_local AS "Equipo", COUNT(CASE WHEN Puntos_local > Puntos_visitante THEN 1 END) + COUNT(CASE WHEN Puntos_local = Puntos_visitante THEN 0.5 END) AS "wins"
FROM Partidos
JOIN Equipos ON Partidos.Equipo_local = Equipos.Nombre
WHERE Equipos.Conferencia = 'Oeste' GROUP BY Equipo_local
UNION SELECT Equipo_visitante AS "Equipo", COUNT(CASE WHEN Puntos_visitante > Puntos_local THEN 1 END) + COUNT(CASE WHEN Puntos_visitante = Puntos_local THEN 0.5 END) AS "wins"
FROM Partidos;

/* 21. Equipo y ciudad de los jugadores españoles de la NBA. */

SELECT Jugadores.Nombre_equipo, Equipos.Ciudad
FROM Jugadores
JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre
WHERE Jugadores.Procedencia LIKE '%Spain%';

/* 22. Puntos por partido de 'Pau Gasol' en toda su carrera. */

SELECT AVG(Puntos_por_partido) AS "Puntos por partido de Pau Gasol en su carrera"
FROM Estadisticas
JOIN Jugadores ON Estadisticas.Jugador = Jugadores.Codigo
WHERE Jugadores.Nombre = 'Pau Gasol';

/* 23. Puntos por partido de los jugadores de los 'cavaliers'. */

SELECT AVG(Puntos_por_partido) AS "Puntos por partido de los jugadores de los Cavaliers"
FROM Estadisticas
JOIN Jugadores ON Estadisticas.Jugador = Jugadores.Codigo
JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre
WHERE Equipos.Nombre LIKE '%Cavaliers%';

/* 24. Número de jugadores que tiene cada equipo de la conferencia oeste ('west'). */

SELECT Equipos.Nombre, COUNT(*) AS "Número de jugadores"
FROM Jugadores
JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre
WHERE Equipos.Conferencia = 'West'
GROUP BY Equipos.Nombre;

/* 25.  Asistencias por partido de 'José Calderón' en la temporada '07/08'. */

SELECT Asistencias_por_partido AS "Asistencias por partido de José Calderón en la temporada 07/08"
FROM Estadisticas
JOIN Jugadores ON Estadisticas.Jugador = Jugadores.Codigo
WHERE Jugadores.Nombre = 'José Calderón' AND Estadisticas.Temporada = '07/08';

/* 26. Puntos por partido de 'LeBron James' en las temporadas del '03/04' al '05/06'. */

SELECT AVG(Puntos_por_partido) AS "Puntos por partido de LeBron James del 03/04 al 05/06"
FROM Estadisticas
JOIN Jugadores ON Estadisticas.Jugador = Jugadores.Codigo
WHERE Jugadores.Nombre = 'LeBron James' AND Estadisticas.Temporada BETWEEN '03/04' AND '05/06';

/* 27. Número de jugadores que tiene cada equipo en la conferencia este ('east'). */

SELECT Equipos.Nombre, COUNT(*) AS "Número de jugadores"
FROM Jugadores
JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre
WHERE Equipos.Conferencia = 'East'
GROUP BY Equipos.Nombre;

/* 28. Tapones por partido de los jugadores de los ' Trail Blazers'. */

SELECT AVG(Tapones_por_partido) AS "Tapones por partido de los jugadores de los Trail Blazers"
FROM Estadisticas
JOIN Jugadores ON Estadisticas.Jugador = Jugadores.Codigo
JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre
WHERE Equipos.Nombre LIKE '%Trail Blazers%';

/* 29. Media de rebotes de los jugadores de la conferencia este ('east'). */

SELECT AVG(rebotesPorPartido)
FROM Jugador
WHERE conferencia = 'East';

/* 30. Rebotes por partido de los jugadores de los equipos de Los Angeles. */

SELECT AVG(rebotes_por_partido) AS promedio_rebotes, equipo, ciudad
FROM jugadores
WHERE equipo LIKE '%Lakers%' OR equipo LIKE '%Clippers%'
GROUP BY equipo, ciudad;

/* 31. Número de jugadores que tiene cada equipo en la división NorthWest. */

SELECT COUNT(*) AS numero_jugadores, equipo
FROM jugadores
WHERE division = 'Northwest'
GROUP BY equipo;

/* 32. Jugadores que no metieron ningún punto en alguna temporada. */

SELECT nombre, MIN(puntos_por_partido)
FROM jugadores
GROUP BY nombre
HAVING MIN(puntos_por_partido) = 0;

/* 33. Número total de jugadores de cada división. */

SELECT COUNT(*) AS numero_jugadores, division
FROM jugadores
GROUP BY division;

/* 34. Temporada con más puntos por partido de 'Kobe Bryant'. */

SELECT MAX(puntos_por_partido) AS max_puntos, temporada
FROM jugadores
WHERE nombre = 'Kobe Bryant'
GROUP BY temporada
ORDER BY max_puntos DESC
LIMIT 1;

/* 35. Número de bases 'G' que tiene cada equipo de la conferencia este 'East'. */

SELECT COUNT(*) AS numero_bases, equipo
FROM jugadores
WHERE posicion LIKE '%G' AND conferencia = 'East'
GROUP BY equipo;

/* 36. Máximo reboteador de los 'Suns'. */

SELECT MAX(rebotes_por_partido) AS max_rebotes, nombre
FROM jugadores
WHERE equipo = 'Suns';

/* 37. Máximo anotador de toda la base de datos en una temporada. */

SELECT MAX(puntos_por_partido) AS max_puntos, nombre, equipo, temporada
FROM jugadores
GROUP BY nombre, equipo, temporada
ORDER BY max_puntos DESC
LIMIT 1;

/* 38.  ¿Cuantas letras tiene el equipo con nombre más largo de la NBA (Ciudad y Nombre)?. */

SELECT LENGTH(equipo) AS numero_letras, equipo
FROM jugadores
ORDER BY numero_letras DESC
LIMIT 1;