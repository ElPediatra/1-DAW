//Alberto Gómez Morales -- 1º DAW -- Actividades de Aplicación

/*
 * De forma similar a la Actividad de aplicación 3.17, implementa un
 * algoritmo que calcule el mínimo común múltiplo de dos números dados.
 */

import java.util.Scanner;

public class U3_R3_Ejer3_18_Alberto {
    public static void main(String[] args){
    
    //Definimos las varibales
    int a;
    int b;
    int i = 2;
    int mcm = 1;
    Scanner teclado=new Scanner(System.in);

    //Desarrollamos el programa
    System.out.println("Vamos a calcular el Máximo Común Divisor de dos números: ");
    
    System.out.println("Indica el primer numero: ");
    a=teclado.nextInt();

    System.out.println("Indica el segundo numero: ");
    b=teclado.nextInt();

    while(i <= a || i <= b){
        if(a%i==0 || b%i==0) {
        mcm=mcm*i;

        if(a%i==0) a=a/i;
        if(b%i==0) b=b/i;

        } else {
            i=i+1; //Si pongo i++ me da bucle infinito
        }
    }
    System.out.println("El Mínimo Común Múltiplo es:" + mcm);

    }
}