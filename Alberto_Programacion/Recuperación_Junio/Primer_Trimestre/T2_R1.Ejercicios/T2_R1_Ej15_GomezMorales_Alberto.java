//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 15.- Escriba una aplicación que lea un entero y que determine e imprima si es impar o par [sugerencia: use el operador residuo. Un número par es un múltiplo de 2. Cualquier múltiplo de 2 deja un residuo de 0 cuando se divide entre 2].
 */

/* Imports */
import java.util.Scanner;

public class T2_R1_Ej15_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("En este programa, comprobaremos si un número es par o impar.");
        System.out.print("\tIndique su número: ");
        numero = teclado.nextInt();

        if(numero%2 == 0){
            System.out.println("\nEl número " + numero + " es par.");
        } else {
            System.out.println("\nEl número " + numero + " es impar.");
        }

        teclado.close();
    }
}
