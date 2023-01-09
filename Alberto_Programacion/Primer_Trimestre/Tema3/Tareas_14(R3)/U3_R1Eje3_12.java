//Alberto Gómez Morales -- Ejercicio 3_12 del libro

/*
 * Pedir 5 calificaciones de alumnos y decir al final
 *  si hay algún suspenso.
 */

import java.util.Scanner;

public class U3_R1Eje3_12 {
public static void main(String[] args){

    //Definimos las variables
    int nota;
    int numSuspensos=0;
    boolean suspensos = false;
    Scanner teclado=new Scanner (System.in);

    //Desarrollamos el programa
    for (int i = 0; i < 5; i++) {
        System.out.println("Indica la nota (entre 0 y 10): ");
        nota=teclado.nextInt();
            if (nota < 5) {
                suspensos = true;
                numSuspensos++;
            }
    }
        if (suspensos) {
            System.out.println("Hay " + numSuspensos + " alumnos suspenson");
        } else {
            System.out.println("No hay alumnos suspensos");
        }
    }
}