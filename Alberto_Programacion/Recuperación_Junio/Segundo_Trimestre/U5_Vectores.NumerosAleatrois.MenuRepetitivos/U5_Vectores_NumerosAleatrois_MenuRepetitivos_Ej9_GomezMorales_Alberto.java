//Alberto Gómez Morales - 1º DAW - Programación

/*
 * 9. Almacenar en un vector 20 caracteres y determinar cuantas veces aparece la vocal “e”.
 */

import java.util.Scanner;

public class U5_Vectores_NumerosAleatrois_MenuRepetitivos_Ej9_GomezMorales_Alberto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[] array = new char[20];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Escribe la letra número " + (i + 1) + ": ");
            array[i] = teclado.next().charAt(0);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'e' || array[i] == 'E') {
                contador++;
            }
        }
        System.out.println("La vocal 'e' aparece " + contador + " veces en el array.");

        teclado.close();
    }
}