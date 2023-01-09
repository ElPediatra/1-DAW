// Alberto Gómez Morales -- Ejercicio 3.3 Libro - Página 74

/*
 * Un centro de investigación de la flora urbana necesita una aplicación
 * que muestre cuál es el árbol más alto. Para ello se introducirá por
 * teclado la altura (en centímetros) de cada árbol (terminando la introducción
 * de datos cuando se utilice -1 como altura). Los árboles se identifican
 * mediante etiquetas con números únicos correlativos, comenzando el 0.
 * Diseñar una apliación que resuelva el problema planteado.
 */

import java.util.Scanner;

public class U3_R1_EJ4_Alberto {
    public static void main(String[] args) {

    //Declaramos las variables
    Scanner teclado=new Scanner(System.in);
    int etiqueta=0;
    int altura;
    int alturaArbolMasAlto;
    int etqArbolMasAlto;
    
    //Desarrollamos el programa
    
    do {
        System.out.println("Indica la altura del árbol "+ etiqueta +":");
        altura=teclado.nextInt();
        etiqueta++;

        } while (altura != -1)

        System.out.println("El árbol más grande es el etiqueado con el
        número " +etqArbolMasAlto+ " con una altura de "+alturaArbolMasAlto+"cm.")
    }
}