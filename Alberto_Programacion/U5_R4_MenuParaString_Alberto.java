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

public class U5_R4_MenuParaString_Alberto{
    public static void main(String[] args){

        //Definimos las variables
        byte opcion;
        char confirmacion;
        boolean salir=false;
        Scanner teclado = new Scanner(System.in);

        //Desarrollamos el programa
        do{
            mostrar();
                opcion=teclado.nextByte();
            switch(opcion) {
                case 1:
                    ejercicio1();
                break;

                case 2:
                    ejercicio2();
                break;

                case 3:
                    ejercicio3();
                break;

                case 4:
                    ejercicio4();
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

    /* Opción 1 - Quitar vocales de un nombre */
    public static void ejercicio1(){
        String nombre;
        String auxiliar;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Indica tu nombre por favor:");
        nombre = teclado.nextLine();

        auxiliar = nombre.replaceAll("[a,e,i,o,u,A,E,I,O,U,á,é,í,ó,ú]", "");

        System.out.println("Tu nombre sin vocales es: " + auxiliar + ".");
    }

    /* Opción 2 - Comprobar palabras en una frase */
    public static void ejercicio2(){
        String frase;
        String palabra;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica una frase: ");
        frase = teclado.nextLine();
        
        System.out.println("Indica una palabra que quieras buscar en la frase indicada: ");
        palabra = teclado.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().startsWith(palabra.toLowerCase(), i)) {
                contador++;
            }
        }

        System.out.println("La palabra " + palabra + " se ha encontrado " + contador + " vez/veces en la frase indicada.");
    }

    /* Opción 3 - Comprobar si una frase es palíndroma */
    public static void ejercicio3(){
        String frase;
        String minuscula;
        String tildes;
        String espacios;
        String comas;
        String puntos;
        int inicio;
        int fin;
        boolean palindroma = true;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Indica la frase que quieres que comprobemos: ");
        frase = teclado.nextLine();

        minuscula = frase.toLowerCase();
        tildes = minuscula.replace("á", "a");
        tildes = tildes.replace("é", "e");
        tildes = tildes.replace("í", "i");
        tildes = tildes.replace("ó", "o");
        tildes = tildes.replace("ú", "u");
        espacios = tildes.replace(" ", "");
        comas = espacios.replace(",", "");
        puntos = comas.replace(".", "");

        inicio = 0;
        fin = puntos.length()-1;

        while(inicio < fin) {
            if(puntos.charAt(inicio) != puntos.charAt(fin)){
                palindroma=false;
            }
            inicio++;
            fin--;
        }

        if(palindroma) {
            System.out.println("La frase '"+ frase +"' es palíndroma.");
        } else {
            System.out.println("La frase '"+ frase +"' no es palíndroma.");
        }        
    }

    /* Opción 4 - Codificar una palabra */
    public static void ejercicio4(){
        String frase;
        String frase1;
        String frase2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Buenas, indica la palabra/frase que quieres codificar: ");
        frase = teclado.nextLine();

        frase1 = frase.toLowerCase();
        
        for (int i=0; i < frase1.length(); i++){
        frase2 = frase1.replace("e", "p").replace("i", "v").replace("k", "i").replace("m", "u").replace("p", "m").replace("q", "t").replace("r", "e").replace("s", "r").replace("t", "k").replace("u", "q").replace("v", "s");
        /* [e,i,k,m,p,q,r,s,t,u,v]" "[p,v,i,u,m,t,e,r,k,q,s] */
        }

        System.out.println("La frase/palabra " + frase + " codificada es " + frase2 + ".");

    }
}