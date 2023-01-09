//Alberto Gómez Morales -- Ejercicio 1 Tema 6 - Moodle

/*
 * Implementa un menú recursivo con confirmación de salida. Donde en una de las opciones generes números aleatorios (enteros positivos)
 * y compruebes a que símbolo corresponde. Para ello debes usar la clase Character.
 */

import java.util.Scanner;

public class Unidad6_Relacion1_Character {
    public static void main(String[] args) {

        // Declaramos las variables

        /* Variables menú */
        int menu = 1;
        char salir = 'n';

        /* Variables Opción 1 */
        int numeros;

        /* Variables generales */
        Scanner teclado = new Scanner(System.in);

        // Desarrollamos el programa
        do {
            if (menu == 0) {
                System.out.println("¿Seguro que quieres salir? (s/n)");
                salir = teclado.next().charAt(0);
                menu++; // Contador para salir de la opción y que se resuelva si sale o no del programa
            } else {
                do {
                    System.out.println("\t\tSelecciona una de las opciones: ");
                    System.out.println("1.- Generar números aleatorios.");
                    System.out.println("0.- Salir del programa.");
                    menu = teclado.nextInt();

                    switch (menu) {
                        case 0:
                            continue;
                        case 1:
                            System.out.println("Indica la cantidad de números que quieres que sean generados:");
                            numeros = teclado.nextInt();

                            System.out.println("Los " + numeros + " números aleatorios generados son:");
                            for (int i = 0; i < numeros; i++) {
                                char c = (char) numRandom(21, 126);
                                System.out.print(c + " ");
                            }
                            System.out.println();
                            break;
                        default:
                            System.out.println("La opción indicada no está habilitada, vuelve a intentarlo.");
                            break;
                    }
                } while (menu != 0);
            }
        } while (salir == 'n');
    }

    // Funciones del programa

    public static int numRandom(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

}