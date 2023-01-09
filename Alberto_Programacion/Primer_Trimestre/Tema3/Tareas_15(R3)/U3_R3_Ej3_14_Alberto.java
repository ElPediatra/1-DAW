//Alberto Gómez Morales -- 1º DAW -- Actividades de Aplicación

/* 
 * Realiza un programa que nos pida un número n, y nos diga cuántos
 * números hay entre 1 y n que sean primos. Un número primo es aquel
 * que solo es divisible por 1 y por él mismo.
 */

import java.util.Scanner;

public class U3_R3_Ej3_14_Alberto{
	public static void main(String []args){

	//Declaramos las variables
    int numero;
    int primos=0;
    int auxiliar;
	boolean esPrimo;
	Scanner teclado=new Scanner(System.in);

	//Desarrollamos el programa
	System.out.println("Indicame un número y te cuántos números primos hay entre 1 y ese número:");
	numero=teclado.nextInt();

	for(int i=1;i<=numero;i++){
		esPrimo=true;
		auxiliar=2;
		    while(auxiliar<i && esPrimo){
			esPrimo=i%auxiliar==0?false:true;
			auxiliar++;
		    }
		primos+=esPrimo?1:0;
	}
	System.out.println("Entre 1 y " + numero + " hay " + primos + " números primos.");

    }
}