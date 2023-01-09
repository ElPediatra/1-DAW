//Alberto Gómez Morales -- Ejercicio 2 Tema 6 - Moodle

/*
 * Implementa los siguientes métodos, añadelos al menú de la relación anterior.
 * 
 * 1. Se reciben por cabecera  dos caracteres y se comprueba si son iguales.Se puede devolver un booleano para ello.
 * 
 * 2. Convierte un digito a caracteres y viceversa, un carácter en digito (usa los metodos digit() y forDigit()).
 * 
 * 3. Sobre un carácter que introduce el usuario haz la siguiente evaluación: si esta definido, si es un dígito, si
 * es un identificador de Java, si es una letra, si es una letra o dígito, si esta en minúscula, si está en mayúscula,
 * conviértelo en mayúscula y en minúscula.
 */
import java.util.Scanner;

public class Relacion1_Character_3EjerciciosMas_Alberto {
    public static void main(String[] args) {

        // Declaramos las variables

        /* Variables menú */
        int menu = 1;
        char salir = 'n';

        /* Variables Opción 1 */
        int numeros;

        /* Variables Opción 2 */
        char primero;
        char segundo;

        /* Variables Opción 3 */
        char caracter;
        int digito;

        /* Variables Opción 4 */
        char a;

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
                    System.out.println("1.- Generar números aleatorios y mostrarlos como caracteres '(char)'.");
                    System.out.println("2.- Comprobar si dos caracteres son iguales.");
                    System.out.println("3.- Convertir un dígito a caracter y viceversa.");
                    System.out.println(
                            "4.- Comprobar si el caracter introducido esta definido, si es un dígito, si es un identificador de Java, si es una letra, si es una letra o dígito, si esta en minúscula, si está en mayúscula y convertirlo en mayúscula y minúscula.");
                    System.out.println("0.- Salir del programa.");
                    menu = teclado.nextInt();

                    switch (menu) {
                        case 0: /* Salida */
                            continue;

                        case 1: /* Caracteres aleatorios */
                            System.out.println("Indica la cantidad de números que quieres que sean generados:");
                            numeros = teclado.nextInt();

                            System.out.println("Los " + numeros + " números aleatorios generados son:");
                            for (int i = 0; i < numeros; i++) {
                                char c = (char) numRandom(21, 126);
                                System.out.print(c + " ");
                            }
                            System.out.println();
                            break;

                        case 2:
                            System.out.println("Indicame el primer caracter:");
                            primero = teclado.next().charAt(0);

                            System.out.println("Indicame el segundo caracter:");
                            segundo = teclado.next().charAt(0);

                            if (primero == segundo) {
                                System.out.println("Los caracteres " + primero + " y " + segundo + " son iguales.");
                            } else {
                                System.out.println("Los caracteres " + primero + " y " + segundo + " no son iguales.");
                            }
                            System.out.println();
                            break;

                        case 3:
                            System.out.println("Indicame un caracter");
                            caracter = teclado.next().charAt(0);

                            System.out.println("Indicame un dígito");
                            digito = teclado.nextInt();

                            System.out.println("El dígito " + digito + " convertido a caracter es "
                                    + convertirInt(digito) + " y el caracter " + caracter + " convertido en dígito es "
                                    + convertirChar(caracter));
                            System.out.println();
                            break;

                        case 4:
                            System.out.println("Introduce un caracter");
                            a = teclado.next().charAt(0);

                            System.out.println("Se ha procesado el caracter " + a + "Los resultados son: ");
                            System.out.println("¿Está definido? \n\t\t" + Character.isDefined(a));
                            System.out.println("¿Es un dígito? \n\t\t" + Character.isDigit(a));
                            System.out.println("¿Es el primer caracter de un identificador de Java? \n\n\t\t"
                                    + Character.isJavaIdentifierStart(a));
                            System.out.println("¿Es una letra? \n\t\t" + Character.isLetter(a));
                            System.out.println("¿Es una letra o un dígito? \n\t\t" + Character.isLetterOrDigit(a));
                            System.out.println("¿Está en minúscula? \n\t\t" + Character.isLowerCase(a));
                            System.out.println("¿[%s] está en mayúscula? \n\t\t" + Character.isUpperCase(a));
                            System.out.println("En mayúscula es \n\t\t" + Character.toUpperCase(a));
                            System.out.println("En minúscula es \n\t\t" + Character.toLowerCase(a));
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

    /* Opción 1 */
    public static int numRandom(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    /* Opción 3 */

    public static int convertirChar(char a) {
        return Character.digit(a, 10);
    }

    public static char convertirInt(int a) {
        return Character.forDigit(a, 10);
    }
}