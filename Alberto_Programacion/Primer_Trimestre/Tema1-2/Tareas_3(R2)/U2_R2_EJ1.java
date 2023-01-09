//Alberto Gómez Morales -- Ejercicio aleatorio -- Pide un número e indica si es par

import java.util.Scanner;
public class U2_R2_EJ1{
    public static void main (String[] args){

    //Definimos las variables
    int numero=0;
    Scanner teclado=new Scanner(System.in);

    //Desarrollamos el programa
    System.out.println("Indicame un número y te diré si es par o no.");
    numero = teclado.nextInt();

    //Calculamos e indicamos si es par o no

    if (numero%2==0){
        System.out.println("El número " + numero +" si es par.");
    } else{
        System.out.println("El número " + numero + " no es par.");
    }

    }
}