//Alberto Gómez Morales -- 1º DAW -- Actividades de Aplicación

/*
 * Para dos números dados, a y b, es posible buscar el máximo
 * común divisor (el número más grande que divide a ambos)
 * mediante un algoritmo ineficiente pero sencillo: desde el
 * menor de a y b, ir buscando, de forma decreciente, el primer
 * número que divide a ambos simultáneamente. Realiza un programa
 * que calcule el máximo común divisor de dos números.
 */

import java.util.Scanner;

public class U3_R3_Ejer3_17_Alberto {
    public static void main(String[] args){
    
    //Definimos las varibales
    int a;
    int b;
    Scanner teclado=new Scanner(System.in);

    //Desarrollamos el programa
    System.out.println("Vamos a calcular el Máximo Común Divisor de dos números: ");
    
    System.out.println("Indica el primer numero: ");
    a=teclado.nextInt();

    System.out.println("Indica el segundo numero: ");
    b=teclado.nextInt();
    
    while(a != b){ //Resta los valores hasta que los 2 sean iguales y muestra el resultado
        if(a>b) {
            a= a-b;
        } else {
            b= b-a;
        }
    }
    System.out.println("El Máximo Común Divisor es:" + a);

    }
}