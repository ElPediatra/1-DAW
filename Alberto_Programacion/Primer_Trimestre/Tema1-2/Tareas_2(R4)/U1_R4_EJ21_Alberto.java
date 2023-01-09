//Alberto Gómez Moralse -- Ejercicio 1.21 página 42

import java.util.Scanner;
public class U1_R4_EJ21_Alberto{
	public static void main(String[] args){

	//Declaramos variables
    int num1;
    int num2;
	boolean resultado;
	Scanner teclado=new Scanner(System.in);

    //Desarrollamos el programa
    System.out.println("Indica el primer número");
	num1=teclado.nextInt();
	System.out.println("Indica el segundo número");
	num2=teclado.nextInt();

	resultado= num1==num2 ? true:false; // Comparamos si los 2 números son iguales para dar una respuesta u otra

    //Mostrar resultado
    System.out.println(resultado);

    }
}