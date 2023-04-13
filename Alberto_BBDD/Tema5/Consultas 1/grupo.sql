/*Alberto Gómez Morales*/

/*1º*/
SELECT nombre, COUNT(*) AS num_jugadores 
FROM jugadores
GROUP BY nombre;

/*2º*/
SELECT posicion, COUNT(*) AS num_jugadores 
FROM jugadores
GROUP BY posicion;

/*3º*/
SELECT nombre, SUM(descripcion) AS num_goles 
FROM jugadores,goles
GROUP BY nombre;
/*4º*/
SELECT fecha, COUNT(*) AS num_jugadores 
FROM jugadores
GROUP BY fecha;
/*5º*/
SELECT nombre, COUNT(*) AS num_jugadores 
FROM jugadores
GROUP BY nombre
HAVING num_jugadores < 11;
/*6º*/
SELECT nombre, COUNT(*) AS num_delanteros 
FROM jugadores
WHERE posicion = 'delantero' 
GROUP BY nombre 
HAVING num_delanteros > 1;
/*7º*/
SELECT nombre, SUM(descripcion) AS num_goles 
FROM jugadores,goles 
GROUP BY nombre 
HAVING num_goles >= 2;
/*8º*/
SELECT fecha, COUNT(*) AS num_jugadores 
FROM jugadores
GROUP BY fecha
HAVING num_jugadores > 3;
/*9º*/
SELECT nombre, SUM(descripcion) AS num_goles 
FROM jugadores,goles
GROUP BY nombre;