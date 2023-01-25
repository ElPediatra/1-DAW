import java.util.Scanner;
import java.util.Arrays; //Para el ejercicio 5

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
                    ejercicio5();
                break;

                case 6:
                    ejercicio6();
                break;

                case 7:
                    ejercicio7();
                break;

                case 8:
                    ejercicio8();
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
        tildes = minuscula.replaceAll("á", "a");
        tildes = tildes.replaceAll("é", "e");
        tildes = tildes.replaceAll("í", "i");
        tildes = tildes.replaceAll("ó", "o");
        tildes = tildes.replaceAll("ú", "u");
        espacios = tildes.replaceAll(" ", "");
        comas = espacios.replaceAll(",", "");
        puntos = comas.replaceAll(".", "");

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
    /* Opción 4 - Codificar un texto */
    public static void ejercicio4(){
        String frase;
        String codificada="";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica tu palabra/frase por favor: ");
        frase = teclado.nextLine();

        char codifica[] = frase.toLowerCase().toCharArray();
        char clave1[] = {'e','i','k','m','p','q','r','s','t','u','v'};
        char clave2[] = {'p','v','i','u','m','t','e','r','k','q','s'};

        for(int i = 0; i < codifica.length; i++) {
            for(int j = 0; j < clave1.length; j++){
                if (codifica[i] == clave1[j]) {
                    codifica[i] = clave2[j];
                    break; /* Para que salte a la siguiente posición y no revise todas las letras para que no rompa el código */
                }
            }
            codificada += codifica[i];
        }

        System.out.println("La palabra/frase "+frase+" codificada es '"+codificada+"'.");
    }

    /* Opción 5 - Anagrama de palabras */
    public static void ejercicio5(){
        String palabra1;
        String palabra2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica la primera palabra: ");
        palabra1 = teclado.nextLine();
        System.out.println("Indica la segunda palabra: ");
        palabra2 = teclado.nextLine();

        // Separamos las letras de las 2 frase
        char cadena1[] = palabra1.toLowerCase().toCharArray();
        char cadena2[] = palabra2.toLowerCase().toCharArray();

        //Ordenamos los caracteres y los comparamos
        Arrays.sort(cadena1);
        Arrays.sort(cadena2);

        if(Arrays.equals(cadena1, cadena2)){
            System.out.println("Las palabras " +palabra1+ " y "+palabra2+" SI son anagramas.");
        } else {
            System.out.println("Las palabras " +palabra1+ " y "+palabra2+" NO son anagramas.");
        }
    }
    /* Opción 6 - Convertir palabra en secuencia de 4 letras */
    public static void ejercicio6(){
        String palabra;
        String auxiliar;
        int tamano;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica la palabra que quieres dividir: ");
        palabra = teclado.nextLine();
        System.out.println("Indicame el tamaño con el que quieres divivir la palabra: ");
        tamano = teclado.nextInt();

        auxiliar = palabra;

        //Procedo a separar la palabra en el tamaño indicado y mostarla
        System.out.println("La palabra "+ palabra +" separada en texto de " + tamano+ " unidades es:");
        while (auxiliar.length()> tamano){
            System.out.println("\t\t" + auxiliar.substring(0, tamano));
            auxiliar = auxiliar.substring(tamano);
        }
        System.out.println("\t\t" + auxiliar);
    }

    /* Opción 7 - Convertir frase en Camel */
    public static void ejercicio7(){
        String frase;
        String auxiliar;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica la frase que quieres convertir en Camel: ");
        frase = teclado.nextLine();

        auxiliar = frase.toLowerCase();

        for(int i = 0; i> auxiliar.length(); i++){
            if (auxiliar.charAt(i) == ' ') {
                auxiliar = auxiliar.substring(0, i) + auxiliar.substring(i+1, i+2).toUpperCase() + auxiliar.substring(i+2);
            }
        }
        System.out.println("La frase "+frase+" pasada a Camel es: "+auxiliar);
    }

    /* Opción 8 - Reemplazar una palabra en un texto */
    public static void ejercicio8(){
        String frase;
        String auxiliar;
        String palabra1;
        String palabra2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, indicame el texto que quieres revisar/modificar: ");
        frase = teclado.nextLine().trim();

        System.out.println("Indica la palabra que quieres modificar: ");
        palabra1 = teclado.nextLine().trim();
        System.out.println("Indica la palabra que la reemplazará: ");
        palabra2 = teclado.nextLine().trim();

        auxiliar = frase;
        auxiliar = auxiliar.replaceAll(palabra1, palabra2);

        System.out.println("La frase modificada quedaría así: ");
        System.out.println(auxiliar);
    }

}