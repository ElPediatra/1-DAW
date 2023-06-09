//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 20.- Escriba una apliación que reciba del usuario un número compuesto por cinco dígitos, que separe ese número en sus dígitos individuales y los imprima, cada uno separado de los demás por tres espacios. Por ejemplo, si el usuario escribe el número 42339, el programa debe imprimir 4   2   3   3   9.
 */

/* Imports */
import java.util.Scanner;

public class T2_R1_Ej20_GomezMorales_Alberto{
    public static void main(String[] args){
        /* Variables */
        int numero;
        Scanner teclado = new Scanner(System.in);

        /* Desarrollamos el programa */
        System.out.println("Introduce un número entero de 5 dígitos:");
	    numero = teclado.nextInt();
	    System.out.printf("%d   %d   %d   %d   %d",numero / 10000,(numero % 10000) / 1000,((numero % 10000) % 1000) / 100,(((numero % 10000) % 1000) % 100) / 10,((((numero % 10000) % 1000) % 100) % 10));

        teclado.close();
    }
}