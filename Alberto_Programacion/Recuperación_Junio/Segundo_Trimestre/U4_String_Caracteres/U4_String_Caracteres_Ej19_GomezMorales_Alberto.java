//Alberto Gómez Morales - 1º DAW - Programación

/*
 * Implementa un sencillo editor de texto que, una vez que sea ha introducido el texto, permita reemplazar toas las ocurrencias de una palabra por otra
 */

import java.util.Scanner;

public class U4_String_Caracteres_Ej19_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        Scanner teclado = new Scanner(System.in);
        String texto;
        String textoModificado;
        String palabra;
        String palabraNueva;

        /* Pedimos el texto */
        System.out.print("Escribe el texto: ");
        texto = teclado.nextLine();

        /* Pedimos la palabra para cambiar */
        System.out.print("Palabra a cambiar: ");
        palabra = teclado.nextLine();

        /* Pedimos la nueva palabra */
        System.out.print("Palabra nueva: ");
        palabraNueva = teclado.nextLine();

        /* Hacemos el cambio */
        textoModificado = texto.replace(palabra, palabraNueva);

        /* Mostramos el texto */
        System.out.println("Texto modificado:");
        System.out.println(textoModificado);
    }
}