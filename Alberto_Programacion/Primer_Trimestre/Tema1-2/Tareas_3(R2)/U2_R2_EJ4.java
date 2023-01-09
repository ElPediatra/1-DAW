//Alberto Gómez Morales -- Pedir 2 numeros y mostrarlos ordenados de mayor a menor

import java.util.Scanner;
public class U2_R2_EJ4 {
    public static void main (String[] args){

        //Definimos las variables
        int numero1;
        int numero2;
        Scanner teclado=new Scanner(System.in);
    
        //Desarrollamos el programa
        System.out.println("Indica el primer número: ");
        numero1 = teclado.nextInt();
        System.out.println("Indica el segundo número: ");
        numero2 = teclado.nextInt();
    
        //Calculamos e indicamos si los 2 número son iguales o no
    
        if (numero1 == numero2){
            System.out.println("Los números " + numero1 + " y " + numero2 + " son iguales");
        } else { if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que " + numero2);
        } else {
            System.out.println("El número " + numero2 + " es mayor que " + numero1);
        }
        }
   }
}
