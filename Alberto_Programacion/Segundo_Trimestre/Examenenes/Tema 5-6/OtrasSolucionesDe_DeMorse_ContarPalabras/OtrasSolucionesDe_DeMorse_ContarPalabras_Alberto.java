import java.util.Scanner;

public class OtrasSolucionesDe_DeMorse_ContarPalabras_Alberto{
    public static void main(String[] args){

        //Definimos las variables
        byte opcion;
        char confirmacion;
        boolean salir=false;
        Scanner teclado = new Scanner(System.in);

        //Desarrollamos el programa
        do{
            menu();
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

                case 0:
                    System.out.println("Has elegido salir, ¿estás seguro?(s/n)");
                    confirmacion=teclado.next().charAt(0);

                    if(confirmacion=='s' || confirmacion=='S'){
                        System.out.println("\t\t Confirmada su salida del programa. ¡Hasta la próxima!");
                        salir=true;
                        break;
                        }
                break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona otra opción.");
             }
            }while (!salir);
        }

//Funciones/Métodos

	/* Menú Principal*/
    public static void menu(){
        System.out.println("\t\t ");
        System.out.println("0.Salir.");
        System.out.println("1.Traducir una frase de Español a Morse.");
        System.out.println("2.Traducir una frase de Morse a Español.");
        System.out.println("3.Contar la longitud de las palabras de una frase e indicar su cantidad.");
        System.out.println("\t\tSeleccione una opción por favor.");
    }
	
	/* Traducir palabras a Morse */
	public static void ejercicio1(){
		Scanner teclado = new Scanner(System.in);
        String frase;
        StringBuilder morse;
        //Creo arrays para almacenar las traducciones de cada letra
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] codigos = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};

        //Solicito la frase a traducir
        System.out.print("Introduce una frase en español: ");
        frase = teclado.nextLine().toLowerCase();

        //Traduzco la frase usando StringBuilder
        morse = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == ' ') {
                morse.append("   "); //Dejamos los 3 espacios entre las palabras
            } else {
                int indice = -1;
                for (int j = 0; j < letras.length; j++) {
                    if (letras[j].charAt(0) == letra) {
                        indice = j;
                        break;
                    }
                }
                if (indice != -1) {
                    morse.append(codigos[indice]).append(" "); //Dejamos 1 espacio entre las letras
                }
            }
        }

        // Mostrar el resultado
        System.out.println("La traducción a código Morse es:");
        System.out.println(morse.toString());
    }

	
	/* Traducir de Morse a Español */
	public static void ejercicio2(){
        Scanner teclado = new Scanner(System.in);
        String codigoMorse;
        StringBuilder frase;
        // Creo arrays para almacenar las traducciones de cada letra
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] codigos = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};

        // Obtener el código Morse a traducir desde el usuario
        System.out.print("Introduce la frase en Morse que quieres traducir: ");
        codigoMorse = teclado.nextLine();

        // Traducimos el código Morse a español
        frase = new StringBuilder();
        String[] palabras = codigoMorse.split("   "); //Separamos las palabras
        for (String palabra : palabras) {
            String[] letrasMorse = palabra.split(" "); //Separamos las letras
            for (String letraMorse : letrasMorse) {
                int indice = -1;
                for (int j = 0; j < codigos.length; j++) {
                    if (codigos[j].equals(letraMorse)) {
                        indice = j;
                        break;
                    }
                }
                if (indice != -1) {
                    frase.append(letras[indice]); //Asignamos la letra correspondiente
                }
            }
            frase.append(" "); //Agregamos un espacio entre palabras
        }

        // Mostrar el resultado
        System.out.println("La traducción a español es:");
        System.out.println(frase.toString());
    }

	/* Contar el tamaño de las palabras de una frase */
	public static void ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        String frase;
        int aux3;
        int tamano;

        //Solicitamos la frase al usuario
        System.out.print("Introduce una frase: ");
        frase = teclado.nextLine();

        //Creamos 2 arrays para almacenar los tamaños de las palabras y el número de palabras de cada tamaño
        int[] tamanos = new int[frase.length()];
        int[] frecuencias = new int[frase.length()];

        //Separamos la frase en palabras y contamos el tamaño de cada palabra
        aux3 = 0;
        tamano = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                tamano++;
            } else if (tamano > 0) {
                tamanos[aux3] = tamano;
                frecuencias[tamano]++;
                aux3++;
                tamano = 0;
            }
        }
        if (tamano > 0) {
            tamanos[aux3] = tamano;
            frecuencias[tamano]++;
        }

        //Mostramos el resultado
        for (int i = 1; i < frecuencias.length; i++) {
            if (frecuencias[i] > 0) {
                System.out.println("Hay " + frecuencias[i] + " palabra(s) de tamaño " + i);
            }
        }
	}
}