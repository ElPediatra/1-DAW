//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 18.- Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima el diámetro, la circunferencia y el área del círculo mediante el uso de punto flotante 3.14159 para PI.
 *      Use las siguientes formulas (r es el radio);
 *          Diámetro = 2 r
 *          Circunferencia = 2 Pi r
 *          Área = Pi (r)2
 *      No almacene los resultados de cada calculo de una variable. En vez de ello, especifique cada cálculo como el valor que se imprimirá en una instrucción System.out.printf. Los valores producidos por los cálculos del área y de la circunferencia son números de punto flotante. Dichos valores pueden imprimirse con el especificador de formato %f en una instrucción System.out.printf.
 */

/* Imports */
import java.util.Scanner;

public class T2_R1_Ej18_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        int radio;
        double pi = 3.14159;
        Scanner teclado = new Scanner(System.in);

        System.out.println("En este programa calcularemos el diámetro, la circuferencia y el área de un círculo mediante el radio.");
        System.out.print("Indica el radio del círculo: ");
        radio = teclado.nextInt();

        System.out.println("Los datos del círculo son: ");
        System.out.printf("El diámetro es: %d, la circunferencia: %f y el área: %f.",2 * radio,2 * pi * radio,pi * radio * radio);

        teclado.close();
    }
}
