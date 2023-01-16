import java.util.Scanner;

public class R0_U6_Ahorcado_Alberto {
    public static void main(String[] args) {

            //Definimos las variables
            String palabra;
            String aux = "";
            char letra;
            Scanner teclado = new Scanner(System.in);

            //Desarrollamos el programa
            System.out.println("¡Bienvenido al juego del ahorcado!");
            System.out.println("Programa en desarrollo: ");
            System.out.println("\t\t - Detección de palabra - DISPONIBLE");
            System.out.println("\t\t - Dibujo del ahorcado - NO DISPONIBLE");
            System.out.print("Inserte una palabra: "); /* Solicito la palabra */
            palabra = teclado.nextLine();
            System.out.println("La palabra insertada es " + palabra);
            System.out.println("*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\nFrancés el que mire la palabra de arriba");


            for(int i=0;i<palabra.length();i++){ /* Creo el espacio de la palabra para el juego */
                aux+="_";
            }
            do {
                System.out.println("Inserte un letra: "); /* Solicito una letra para comprobar si está en la palabra */
                letra = teclado.next().charAt(0);

                for (int pos = 0; pos < palabra.length(); pos++) { /* Asigno una posición a cara letra de la palabra y compruebo si la letra indicada  */

                    if(pos==0 && palabra.charAt(pos) == letra) { /* Si cumple la letra con la posición la marca */
                        aux=letra+aux.substring(1);
                    }else if (palabra.charAt(pos) == letra) {
                        aux = aux.substring(0, pos)+letra+aux.substring(pos+1); /* Si no cumple la letra con la posición pasa a la siguiente */
                    }
                }

                System.out.println(aux); /* Enseño el progreso actual de la palabra */

            } while (!aux.equals(palabra)); /* Si se ha completado, sale mensaje de victoria */
                System.out.println("¡Enhorabuena, lo has conseguido!");

                teclado.close();
    }
}