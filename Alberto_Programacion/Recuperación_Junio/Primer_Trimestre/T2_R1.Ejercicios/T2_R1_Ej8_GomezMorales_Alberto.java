//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 8.- Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números del usuario e imprima la suma, producto, diferencia y cociente (división) de los números.
 */

/* Imports */
import java.util.Scanner;

public class T2_R1_Ej8_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        int num1;
        int num2;
        int suma;
        int producto;
        int diferencia;
        int cociente;
        Scanner teclado = new Scanner(System.in);

        /* Desarrollo */
        System.out.println("En este programa se mostrará la suma, el producto la diferencia y el cociente de 2 números que nos indiques: ");
        System.out.println("Indica el primer número: ");
        num1 = teclado.nextInt();

        System.out.println("Indica el segundo número: ");
        num2 = teclado.nextInt();

        suma = num1 + num2;
        producto = num1 * num2;
        
        if(num1 > num2){
            diferencia = num1 - num2;
            cociente = num1 / num2;
        } else if (num2 > num1) {
            diferencia = num2 - num1;
            cociente = num2 / num1;
        } else {
            diferencia = num1 - num2;
            cociente = num1 / num2;
        }

        System.out.println("Los resultados de las operaciones de los números " + num1 + " y " + num2 + " son: ");
        System.out.println("\tSuma: " + suma + "\n\tProducto: " + producto + "\n\tDiferencia: " + diferencia + "\n\tCociente: " + cociente);

        teclado.close();
    }
}