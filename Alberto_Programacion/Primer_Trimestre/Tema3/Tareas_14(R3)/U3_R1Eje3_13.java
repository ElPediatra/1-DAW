//Alberto Gómez Morales -- Ejercicio 3_13 del libro

/*
 * Dadas 6 notas, escribir la cantidad de algunos aprobados,
 * condicionados (nota igual a cuatro) y suspensos.
 */

import java.util.Scanner;

public class U3_R1Eje3_13 {
public static void main(String[] args){

    //Definimos las variables
    int nota;
    int aprobados = 0;
    int suspensos = 0;
    int condicionados = 0;
    Scanner teclado=new Scanner (System.in);

    //Desarrollamos el programa
    for (int i = 1; i <= 6; i++) {
        System.out.println("Indique la nota del alumno " + i + ": ");
        nota=teclado.nextInt();

        if (nota == 4) {
            condicionados++;
        } else if (nota >= 5) {
            aprobados++;
        } else if (nota < 4) {
            suspensos++;
        }
    }

    System.out.println("Tras revisar las notas veo que hay: ");
    System.out.println("\t\tAlumnos aprobados: " + aprobados);
    System.out.println("\t\tAlumnos suspensos: " + suspensos);
    System.out.println("\t\tAlumnos condicionados: " + condicionados);

    }
}