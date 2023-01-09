// Alberto Gómez Morales -- Ejercicio 3.2 Libro - Página 74

/*
 * Implementar una aplicación para calcular datos estadísticos de las edades
 * de los alumnos de un centro educativo. Se introducirán datos hasta que uno de
 * ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
 * la media, el número de alumnos y cuántos son mayores de edad.
*/

//Se debe resolver con "while".

import java.util.Scanner;
public class U3_R1_EJ2_2_Alberto {
    public static void main(String[] args) {

    //Defino las variables
    Scanner teclado=new Scanner(System.in);
    byte edad=0;
    long acumuladorEdad=0;
    short contadorAlum=0, contadorMayores=0;
    float mediaEdad=0;

    System.out.println("");

    do {
        acumuladorEdad=acumuladorEdad+edad;

        if (edad>=18){
            contadorMayores++;
        }

        System.out.println("\nDame la edad: ");
        edad=teclado.nextByte();
        contadorAlum++;
    } while (edad > 0 );


    }
}