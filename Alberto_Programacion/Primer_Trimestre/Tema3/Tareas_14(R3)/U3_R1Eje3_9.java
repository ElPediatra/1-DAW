//Alberto Gómez Morales -- Ejercicio 3_9 del libro

/*
 * Implementar una aplicación que pida al usuario un número
 * comprendido entre 1 y 10. Hay que mostrar la tabla de multiplicar
 * de dicho número, asegurándose de que el número introducido se
 * encuentra en el rango establecido.
 */

import java.util.Scanner;

public class U3_R1Eje3_9 {
public static void main(String[] args){

    //Definimos las variables
    int numero;
    Scanner teclado=new Scanner (System.in);

    //Desarrollamos el programa
    do {
        System.out.println("Indica un número del 1 al 10 y te mostraré su tabla de multiplicar: ");
        numero=teclado.nextInt();
        } while (!(1 <= numero && numero <= 10));
        System.out.println("Tabla del " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println("\t\t" + numero + "x" + i + " = " + numero * i);
        }
    }
}