//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 16.- Escriba una apliación que lea dos enteros, determine si el primero es múltiplo del segundo e imprima el resultado. [Sugerencia: use el operador residuo].
 */

/* Imports */
import java.util.Scanner;

public class T2_R1_Ej16_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        int num1;
        int num2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("En este programa comprobaremos si 2 números son múltiplos.");
        System.out.print("\tIndica el primer número: ");
        num1 = teclado.nextInt();
        System.out.print("\tIndica el segundo número: ");
        num2 = teclado.nextInt();

        if(num1 > num2) {
            if(num1%num2 == 0){
                System.out.println(num1 + " SI es múltiplo de " + num2);
            } else {
                System.out.println(num1 + " NO es múltiplo de " + num2);
            }
        } else {
            if(num2%num1 == 0){
                System.out.println(num2 + " SI es múltiplo de " + num1);
            } else {
                System.out.println(num2 + " NO es múltiplo de " + num1);
            }
        }

        teclado.close();
    }
}
