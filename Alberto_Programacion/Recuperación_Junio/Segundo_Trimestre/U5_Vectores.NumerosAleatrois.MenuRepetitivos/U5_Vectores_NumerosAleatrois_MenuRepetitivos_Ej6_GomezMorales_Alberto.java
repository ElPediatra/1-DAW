//Alberto Gómez Morales - 1º DAW - Programación

/*
 * 6. Almacenar en un vector 20 números enteros, y determinar cuántas veces se repite el mayor.
 */

import java.util.Scanner;

public class U5_Vectores_NumerosAleatrois_MenuRepetitivos_Ej6_GomezMorales_Alberto{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[20];
        int mayor = array[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            array[i] = teclado.nextInt();
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == mayor) {
                contador++;
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("Se repite " + contador + " veces.");

        teclado.close();
    }
}