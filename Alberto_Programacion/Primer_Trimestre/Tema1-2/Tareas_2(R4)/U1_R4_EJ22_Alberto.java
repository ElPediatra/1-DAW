//Alberto Gómez Moralse -- Ejercicio 1.22 página 42

import java.util.Scanner;
public class U1_R4_EJ22_Alberto{
	public static void main(String[] args){

	//Declaramos variables
    double metros;
	int centimetros;
	Scanner teclado=new Scanner(System.in);

    //Desarrollamos el programa
    System.out.println("Introduzca la longitud alcanzada en metros");
	metros=teclado.nextDouble();
	
    centimetros=(int) (metros * 100); // Calculo la distancia en centímetros

    //Mostrar resultado
    System.out.println("La distancia total es: " + centimetros + " cm");

    }
}