//Alberto Gómez Morales -- 1º DAW -- Actividades de Aplicación

/*
 * Escribe un programa que solicite al usuario las distintas
 * cantidades de dinero de las que dispone. Por ejemplo: la
 * cantidad de dinero que tiene en el banco, en una hucha, en un
 * cajón y en los bolsillos. La aplicación mostrará la suma total
 * de dinero de la que dispone el usuario.
 * 
 * La manera de especificar que no desea introducir más cantidades
 * es mediante el cero.
 */

import java.util.Scanner;

public class U3_R3_Ejer3_20_Alberto {
    public static void main(String[] args) {
    
        //Definimos las variables
        double dinero;
        double total = 0.00;
        Scanner teclado=new Scanner(System.in);

        //Desarrollamos el programa
        System.out.println("Vamos a calcular el dinero que tienes en total: ");
        System.out.println("\t\t - En el banco.");
        System.out.println("\t\t - En una hucha.");
        System.out.println("\t\t - En tu cartera/monedero o en los bolsillos.");
        System.out.println("\t\t - El que tienes guardado en casa.");
        System.out.println("Con este programa calcularemos el total de todo ese dinero!!");
        System.out.println("Para terminar de calcular y parar el programa, deberás de indicar '0'.");

        do {
            System.out.println("Indica una cantidad de dinero: ");
            dinero=teclado.nextDouble();

            total = total + dinero;
        } while (dinero != 0);
            System.out.println("La cantidad de dinero total del que dispones es: ");
            System.out.printf("\t\t%.2f euros",total);
    }
}