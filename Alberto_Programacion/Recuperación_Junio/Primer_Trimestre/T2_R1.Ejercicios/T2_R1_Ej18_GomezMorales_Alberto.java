//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 18.- Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima el diámetro, la circunferencia y el área del círculo mediante el uso de punto flotante 3.14159 para PI.
 *      Use las siguientes formulas (r es el radio);
 */

/* Imports */
import java.util.Scanner;

public class T2_R1_Ej18_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        double radio;
        double pi = 3.14159;
        Scanner teclado = new Scanner(System.in);

        System.out.println("En este programa calcularemos el diámetro, la circuferencia y el área de un círculo mediante el radio.");
        System.out.print("Indica el radio del círculo: ");
        radio = teclado.nextDouble();

        System.out.println("Los datos del círculo son: ");


    }
}
