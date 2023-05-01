/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * 
 * @author alber
 *
 * El cifrado César es una forma sencilla de modificar un texto para que no sea entendible a quienes no conocen el código. Este cifrado consiste en modificar cada letra de un texto por otra que se encuentra en el alfabeto n posiciones detrás.
 *
 * Por ejemplo, para un valor de n igual a 3, la letra a se codifica con la d, y la letra q se codifica con la x. En el caso de que una letra exceda a la z, seguiremos de forma circular utilizando la a. Solo se cifrarán las letras, mayúsculas o minúsculas.
 *
 * Realiza una clase que, mediante un método estático, devuelva cifrado el texto que se le pasa con un paso de n letras.
 */

/* Paquetes */
package CifradoCesarAlberto;

/* Imports */
import java.util.Scanner;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
        
    public static void main(String[] args) {
        /* Variables */
        String texto;
        int n;
        
        System.out.print("Introduce el texto a cifrar: ");
        texto = teclado.nextLine();
        System.out.print("Introduce el valor de n: ");
        n = teclado.nextInt();
        
        String cifrado = CifradoCesar.cifrar(texto, n);
        System.out.println("Texto cifrado: " + cifrado);
    }
}
