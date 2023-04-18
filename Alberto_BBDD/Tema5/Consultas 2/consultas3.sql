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
FROM Partidos

/* 21. Equipo y ciudad de los jugadores españoles de la NBA. */


/* 22. Puntos por partido de 'Pau Gasol' en toda su carrera. */

/* 23. Puntos por partido de los jugadores de los 'cavaliers'. */

/* 24. Número de jugadores que tiene cada equipo de la conferencia oeste ('west'). */

/* 25.  Asistencias por partido de 'José Calderón' en la temporada '07/08'. */

/* 26. Puntos por partido de 'LeBron James' en las temporadas del '03/04' al '05/06'. */

/* 27. Número de jugadores que tiene cada equipo en la conferencia este ('east'). */

/* 28. Tapones por partido de los jugadores de los ' Trail Blazers'. */

/* 29. Media de rebotes de los jugadores de la conferencia este ('east'). */

/* 30. Rebotes por partido de los jugadores de los equipos de Los Angeles. */

/* 31. Número de jugadores que tiene cada equipo en la división NorthWest. */

/* 32. Jugadores que no metieron ningún punto en alguna temporada. */

/* 33. Número total de jugadores de cada división. */

/* 34. Temporada con más puntos por partido de 'Kobe Bryant'. */

/* 35. Número de bases 'G' que tiene cada equipo de la conferencia este 'East'. */

/* 36. Máximo reboteador de los 'Suns'. */

/* 37. Máximo anotador de toda la base de datos en una temporada. */

/* 38.  ¿Cuantas letras tiene el equipo con nombre más largo de la NBA (Ciudad y Nombre)?. */