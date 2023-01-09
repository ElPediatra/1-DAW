//Alberto Gómez Moralse -- Ejercicio 1.17 página 42

import java.util.Scanner;
public class U1_R4_EJ17_Alberto{
	public static void main(String[] args){

	//Declaramos variables
    double milimetros;
    double centimetros;
    double metros;
    double resultado;
    Scanner teclado=new Scanner (System.in);

    //Desarrollamos el programa
    System.out.println("Indica una distancia en milímetros ");
	milimetros = teclado.nextDouble();
    System.out.println("Indica una distancia en centímetros: ");
    centimetros = teclado.nextDouble();
    System.out.println("Indica una distancia en metros: ");
    metros = teclado.nextDouble();

    resultado = milimetros * 10 + centimetros + metros / 100; // Paso metros y milímetros a centímetros y hago la suma total

    //Mostrar resultado

    System.out.println("La distancia total en centímetros es " + resultado);

    }
}
