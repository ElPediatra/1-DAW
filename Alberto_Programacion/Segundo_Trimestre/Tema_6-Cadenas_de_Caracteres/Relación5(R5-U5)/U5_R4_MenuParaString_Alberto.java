import java.util.Scanner;

// Menú tareas y ejercicios libro

/*
 * Ejercicio 6.11 página 187 del libro.
 * 
 * Se dispone de la siguiente relación de letras:
 *      Conjunto 1: e i k m p q r s t u v
 *      Conjunto 2: p v i u m t e r k q s
 * Con ella es posible codificar un texto, convirtiendo cada letra del conjunto 1 en su correspondiente del conjunto 2. El resto de las letras no se modifican. Los conjuntos se
 * utilizan tanto para codificar mayúsculas como minúsculas, mostrando siempre la codificación en minúsculas.
 * 
 * Un ejemplo: la palabra "PaquiTo" se codifica como "matqvko".
 * 
 * Realizar un programa que codifique un texto. Para ello implementar la siguiente función:
 *      char codifica(char conjunto1[], char conunto2[],char c)
 * que devuelve el carácter "c" codificado según los conjuntos 1 y 2 que se le pasan.
 */

/*
 * Ejercicio 6.12 página 189 del libro.
 * 
 * Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra. Ejemplos de anagramas para la palabra roma son: amor, ramo o mora. Construir un programa
 * que solicite al usuario dos palabras e indique si son anagramas una de otra.
 */

/*
 * Ejercicio 6.17 página 196 del libro.
 * 
 * Construir un programa que convierta una palabra en secuencias de n letras. Por ejemplo, la palabra "destornillador", dividida en secuencias de 4 letras, se mostrará de la siguente forma:
 * 
 *      dest
 *      orni
 *      llad
 *      or
 */

/*
 * Ejercicio 6.18 página 196 del libro.
 * 
 * Escribe una aplicación que convierte una frase (que puede estar escrita con cualquier combinación de mayúsculas y minúsculas) en el nombre de una variable que utilice la nomenclatura
 * Camel. Por ejemplo, la frase "Me GUsta merenDAR gaLLEtas", se convertirá en "meGustaMerendarGalletas".
 * 
 * Supondremos que cada palabra que compone la frase está separada por un único espacio en blanco.
 */

/*
 * Ejercicio 6.19 página 196 del libro.
 * 
 * Implementa un sencillo editor de texto que, una vez que se ha introducido el texto, permita reemplazar todas las ocurrencias de una palabra por otra.
 */

public class R3_U6_EJ1_2_3_4_5_6_Alberto{
static Scanner teclado = new Scanner(System.in); //Variable GLOBAL
    public static void main(String[] args){

        //Definimos las variables
        byte opcion;
        char confirmacion;
        boolean salir=false;

        //Desarrollamos el programa
        do{
            mostrar();
                opcion=teclado.nextByte();
            switch(opcion) {
                case 1:
                break;

                case 2:
                break;

                case 3:
                break;

                case 4:
                break;

                case 5:
                break;

                case 6:
                break;

                case 7:
                break;

                case 8:
                break;

                case 0:
                    System.out.println("Has elegido salir, ¿estás seguro?(s/n)");
                    confirmacion=teclado.next().charAt(0);

                    if(confirmacion=='s'){
                        System.out.println("\t\t\t Confirmada su salida. ¡Hasta la próxima!");
                        salir=true;
                        break;
                        }
                break;

                default:
                    System.out.println("Opción no válida.");
                
             }
            }while (!salir);

            teclado.close();
        }

//Funciones/Métodos


    public static void mostrar(){
        System.out.println("\t\tBienvenido a las Estructuras de Datos Arrays.");
        System.out.println("0.Salir.");
        System.out.println("1. Pedir el nombre al usuario y mostrarlo sin vocales.");
        System.out.println("2. Pedir una frase y una palabra. Buscar cuantas veces aparece la palabra en la frase.");
        System.out.println("3. Leer una frase y decir si es palíndroma.");
        System.out.println("4. Ejercicio 6.11 página 187 del libro.");
        System.out.println("5. Ejercicio 6.12 página 189 del libro.");
        System.out.println("6. Ejercicio 6.17 página 196 del libro.");
        System.out.println("7. Ejercicio 6.18 página 196 del libro.");
        System.out.println("8. Ejercicio 6.19 página 196 del libro.");
        System.out.println("\t\tSeleccione una opción por favor.");
    }

}