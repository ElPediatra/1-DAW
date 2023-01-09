//Alberto Gómez Morales -- Pedir 3 numeros distintos y ordenarlos de mayor a menor

import java.util.Scanner;
public class U2_R6_EJ1_Alberto {
    public static void main (String[] args){

        //Definimos las variables
        int numero1;
        int numero2;
        int numero3;
        Scanner teclado=new Scanner(System.in);
        
        int aux; //Para estos pedidos es necesario tener auxiliar para manejar varios datos
        int aux2;
        
        //Desarrollamos el programa
        System.out.println("Dame tres números enteros y los ordenaré de mayor a menor.");
        System.out.println("Indica el primer número: ");
        numero1 = teclado.nextInt();
        System.out.println("Indica el segundo número: ");
        numero2 = teclado.nextInt();
        
        //Ordenamos los 2 números para ponerlos de mayor a menor
        if (numero1 < numero2){ //Intercambio el primero por el segundo
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }

        //Pedimos el tercer número
        System.out.println("Indica el tercer número: ");
        numero3 = teclado.nextInt();

        //Ordenamos el tercer número con los 2 primeros
        if (numero3 < numero1 ) {
            if (numero3 > numero2) { //Intercambio el segundo por el tercero
                aux = numero2;
                numero2 = numero3;
                numero3 = aux;
            }
            else{ //Numero2 > Numero3

            }
        } else {//Numero1 < Numero3
            aux = numero1;
            numero1 = numero3;
            aux2 = numero2; // Añado un segundo auxiliar (aux2) para no pisar el dato guardo en auxiliar (aux)
            numero2 = aux;
            numero3 = aux2;
        }

        //Mandamos mensaje final
        System.out.println("Los números ordenados de mayor a menor son: " + numero1 + ", " + numero2 + " y " + numero3);
    }
}