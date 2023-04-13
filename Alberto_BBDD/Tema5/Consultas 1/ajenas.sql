/*Alberto Gómez Morales*/

/*1º*/
SELECT Equipos.Nombre AS Equipo, Presidentes.Nombre FROM equipos, presidentes
WHERE Equipos.Presidente=Presidentes.DNI

/*2º*/
SELECT Jugadores.Nombre, Equipos.Nombre
FROM Jugadores, Equipos
WHERE Jugadores.Cod_equipo = Equipos.Codigo;


/*3º*/
SELECT E1.Nombre as Local, E2.Nombre As visitante
FROM Equipos E1, Equipos E2, Partidos
WHERE E1.Codigo = Partidos.Equipo_local AND E2.codigo = Partidos.Equipo_visitante
AND Partidos.Codigo LIKE 'J1%';

/*4º*/
SELECT DISTINCT  Nombre, Posicion FROM Jugadores, Goles WHERE Jugadores.Codigo = Goles.Cod_Jugador;

/*5º*/
SELECT modulos.Nombre, profesores.Nombre
FROM modulos, profesores
WHERE modulos.Dni_profesor = profesores.Dni;

/*6º*/
SELECT Alnormal.Nombre As Alumno, Delegado.Nombre As Delegado
FROM Alumnos as Alnormal, Alumnos AS Delegado, Grupos
WHERE Grupos.Delegado= Delegado.N_expdte AND Grupos.Letra=Alnormal.Letra;


/*7º*/
SELECT alumnos.Nombre
FROM alumnos, matriculas, modulos
WHERE alumnos.N_expdte=Matriculas.ALumno AND matriculas.Modulo = Modulos.Codigo AND Modulos.Nombre = 'Base de Datos';



/*8º*/
SELECT alumnos.Nombre
FROM alumnos, profesores, matriculas, modulos
WHERE Alumnos.N_Expdte = MAtriculas.Alumno
AND Modulos.Dni_Profesor = Profesores.Dni
AND alumnos.Fecha_nac> 1999-01-01 AND profesores.Nombre='Fernando';

/*9º*/
SELECT CONCAT(Grupos.Curso,'º',Grupos.Letra) AS Grupo, Alumnos.Nombre , Grupos.Delegado
FROM Grupos, Alumnos WHERE Grupos.Delegado= alumnos.N_expdte
ORDER BY Grupo;

/*10º*/
SELECT modulos.nombre
FROM modulos,grupos,matriculas,alumnos
WHERE modulos.Codigo=Matriculas.Modulo AND Matriculas.Alumno= Alumnos.N_Expdte AND Alumnos.N_Expdte=Grupos.Delegado;

/*11º*/
SELECT CONCAT(Alumnos.Curso,'º',Alumnos.Letra) AS Grupo FROM Alumnos, Matriculas,Modulos,Profesores
WHERE Alumnos.N_expdte =Matriculas.Alumno
AND Matriculas.modulo=Modulos.Codigo 
AND Modulos.Dni_Profesor=Profesores.Dni
AND Profesores.Nombre='Macarena';
