/*
 * Alberto Gómez Morales -- Ejercicios 15, 16, 17, 18 y 19 del libro.
 * 
 * Completa tu menu iterativo con confirmación de salida (si o no) con métodos
 * que resuelvan los
 * ejercicios Ejercicios 4_15 al 4_19 de la pag 120 de tu libro.
 * 
 * 4.15 - Diseña una función a la que se le pasan las horas y minutos de dos
 * instantes de tiempo,
 * con el siguiente prototipo: 'static int diferenciaMin(int hora1, int minuto1,
 * int hora2, int
 * minuto2)'. La función devolverá la cantidad de minutos que existen de
 * diferencia entre los dos
 * instantes utilizados.
 * 
 * 4.16 - Implementa la función 'divisoresPrimos()' que muestra, por consola,
 * todos los divisores
 * primos del número que se le pasa como parámetro.
 * 
 * 4.17 - Escribe una función que decida si dos números positivos son amigos.
 *  * Dos números a y b son
 * amigos si lasuma de los divisores propios (distintos de él mismo) de a es
 * igual a b. Y viceversa.
 * Para probar se pueden usar los números 220 y 284, que son amigos.
 * 
 * 4.18 - Crea una función que muestre por consola una serie de números
 * aleatgorios enteros. Los
 * parámetros de la función serán: la cantidad de números aleatorios que se
 * mostrarán y los valores
 * mínimos y máximos que estos pueden tomar.
 * 
 * 4.19 - Sobrecarga la función realizada en la apliación 4.18 para que el único
 * parámetros sea la
 * cantidad de números aleatorios que se muestra por consola. Los números
 * aleatorios serán reales y
 * estarán comprendidos entre 0 y 1.
 */

import java.util.Scanner;

public class U4_R3_Ejercicios4_15_16_17_18_19_Alberto {
    public static void main(String[] args) {

        // Declaramos las variables
        Scanner teclado = new Scanner(System.in);

        /* Menú */
        int menu = 1; // Mientras no sea 0, se repetirá el bucle
        char salir = 'n';

        /* Opción 1 */
        int hora1;
        int hora2;
        int minuto1;
        int minuto2;

        /* Opción 2 */
        int numero;

        /* Opción 3 */
        int num1;
        int num2;

        /* Opción 4 */
        int numeros;
        int min;
        int max;

        /* Opción 5 */
        int cantidad;

        // Desarrollamos el programa
        do {
            if (menu == 0) {// Confirmación para salir del programa
                System.out.println("¿Seguro que quieres salir? (s/n)");
                salir = teclado.next().charAt(0);
                menu++;
            } else {
                do {
                    System.out.println("Selecciona una de las opciones:");
                    System.out.println("\t\t1.- Diferencia entre 2 tiempos (hora + minuto).");
                    System.out.println("\t\t2.- Indicar los divisores primos de un número.");
                    System.out.println("\t\t3.- Ver si dos números positivos son 'amigos'.");
                    System.out.println("\t\t4.- Mostrar una cantidad de números aleatorios.");
                    System.out.println("\t\t5.- Aleatorio con sobrecargada comprendido con números entre 0 y 1.");
                    System.out.println("Para salir pulsa '0'.");
                    menu = teclado.nextInt();
                    switch (menu) {

                        case 0: // Opción de salida
                            continue;

                        case 1: // Ejercicio 15 - Función 'diferenciaMin'
                            System.out.println(
                                    "Indicame dos instantes de tiempo (horas y minutos) y te diré su diferencia en minutos:");
                            System.out.println("Indica las horas del primer tiempo y luego los minutos.");
                            hora1 = teclado.nextInt();
                            minuto1 = teclado.nextInt();

                            System.out.println("Indica las horas del segundo tiempo y luego los minutos.");
                            hora2 = teclado.nextInt();
                            minuto2 = teclado.nextInt();

                            System.out.println(
                                    "La diferencia es " + diferenciaMin(hora1, minuto1, hora2, minuto2) + " minutos.");
                            break;

                        case 2: // Ejercicio 16 - Función 'divisoresPrimos()' y 'esPrimo'
                            System.out.println("Indicame dos números entero y te diré sus divisores primos:");
                            numero = teclado.nextInt();

                            System.out.println("Los divisores primos son: ");
                            divisoresPrimos(numero);
                            break;

                        case 3: // Ejercicio 17 - Función 'comprobarAmigos' y 'sumaDivisores'
                            System.out
                                    .println("Indica dos números enteros y positivos, te diré si son números amigos:");
                            System.out.println("Indica el primer número:");
                            num1 = teclado.nextInt();

                            System.out.println("Indica el segundo número:");
                            num2 = teclado.nextInt();

                            if (numerosAmigos(num1, num2)) {
                                System.out.println("Los números " + num1 + " y " + num2 + " son amigos.");
                            } else {
                                System.out.println("Los números " + num1 + " y " + num2 + " no son amigos.");
                            }
                            break;

                        case 4: // Ejercicio 18 - Función 'generarRandom(int x, int y, int z)'
                            System.out.println("Indica la cantidad de números que quieres generar:");
                            numeros = teclado.nextInt();

                            System.out.println("Introduce el número mínimo:");
                            min = teclado.nextInt();

                            System.out.println("Introduce el número máximo:");
                            max = teclado.nextInt();

                            System.out.printf("Los números aleatorios entre " + min + " y " + max + " son: ");
                            generarRandom(numeros, min, max);
                            break;

                        case 5: // Ejercicio 19 - Función 'generarRandom(int x)'
                            System.out.println("Introduce la cantidad de números aleatorios que quieres generar:");
                            cantidad = teclado.nextInt();
                            generarRandom(cantidad);
                            break;

                        default:
                            System.out.println(
                                    "Has introducido una opción incorrecta, selecciona una de las indicadas por favor.");
                            break;
                    }
                } while (menu != 0);
            }
        } while (salir == 'n');
    }

    // Definimos las funciones

    /* Opción 1 -- Ejercicio 15 */
    public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int total1 = hora1 * 60 + minuto1;
        int total2 = hora2 * 60 + minuto2;
        int diferencia = total1 > total2 ? total1 - total2 : total2 - total1;
        return diferencia;
    }

    /* Opción 2 -- Ejercicio 16 */
    public static void divisoresPrimos(int x) {
        for (int i = 2; i <= x; i++) {
            if (x % i == 0 && esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    /* Opción 2 -- Ejercicio 16 */
    public static boolean esPrimo(int x) {
        boolean esPrimo = true;
        int aux = 2;
        while (aux < x && esPrimo) {
            esPrimo = x % aux == 0 ? false : true;
            aux++;
        }
        return (esPrimo);
    }

    /* Opción 3 -- Ejercicio 17 */
    public static boolean numerosAmigos(int x, int y) {
        return sumaAmigos(x) == sumaAmigos(y);
    }

    /* Opción 3 -- Ejercicio 17 */
    public static int sumaAmigos(int x) {
        int suma = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    /* Opción 5 -- Ejercicio 19 */
    public static void generarRandom(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(Math.random());
        }
    }

    /* Opción 4 -- Ejercicio 18 */
    public static void generarRandom(int x, int y, int z) {
        for (int i = 1; i <= x; i++) {
            System.out.println(Math.floor(Math.random() * (z - y + 1) + y));
        }
    }

}