//Alberto Gómez Morales - 1º DAW - Programación

/*
 * 10. Almacenar en un vector 30 caracteres y determinar qué letras y cuantas veces aparecen
 * repetidas, se deben implementar vectores auxiliares para almacenar esta información y
 * tras finalizar mostrarla por pantalla.
 */

import java.util.Scanner;

public class U5_Vectores_NumerosAleatrois_MenuRepetitivos_Ej10_GomezMorales_Alberto {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[] array = new char[30];
        int[] contador = new int[26];
        char letra;
        char letra2;
        int indice;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Indica la letra " + (i + 1) + ": ");
            array[i] = teclado.next().charAt(0);
        }

        for (int i = 0; i < array.length; i++) {
            letra = Character.toLowerCase(array[i]);

            if (Character.isLetter(letra)) {
                indice = letra - 'a';
                contador[indice]++;
            }
        }

        System.out.println("Letras repetidas:");
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 1) {
                letra2 = (char) (i + 'a');
                System.out.println("Letra: " + letra2 + ", Repeticiones: " + contador[i]);
            }
        }
        teclado.close();
    }
}