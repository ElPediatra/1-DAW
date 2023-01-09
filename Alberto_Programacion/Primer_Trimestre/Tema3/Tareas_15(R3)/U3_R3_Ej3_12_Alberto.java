//Alberto Gómez Morales -- 1º DAW -- Actividades de Aplicación

/*Modifica la Actividad de aplicación 3.11 para que el usuario
pueda introducir un número en binario y el programa muestre su conversión a decimal.*/

import java.util.Scanner;
import java.lang.Math;

public class U3_R3_Ej3_12_Alberto{
	public static void main(String []args){

	//Declaramos las variables
	int binario;
    int decimal = 0;
    int auxiliar;
    int contador=0;
	Scanner teclado=new Scanner(System.in);

	//Desarrollamos el programa
	System.out.println("Indica un número en binario y lo pasaré a decimal: ");
	binario=teclado.nextInt();
	auxiliar=binario;

	while(auxiliar>0){
		decimal+=(auxiliar % 2 * (Math.pow(2, contador))); //Operación Math.pow para potencias
		auxiliar /= 10;
		contador++;
	}
	System.out.println("El número binario" + binario + " convertido a decimal es " + decimal + ".");
	}
}