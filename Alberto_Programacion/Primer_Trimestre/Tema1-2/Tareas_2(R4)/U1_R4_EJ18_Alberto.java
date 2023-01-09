//Alberto Gómez Moralse -- Ejercicio 1.18 página 42

import java.util.Scanner;
public class U1_R4_EJ18_Alberto{
	public static void main(String[] args){

	//Declaramos variables
    int hormigas;
    int aranas;
    int cochinillas;
    int patas;
    Scanner teclado=new Scanner (System.in);

    //Desarrollamos el programa
    System.out.println("Cuántas hormigas has capturado?: ");
	hormigas=teclado.nextInt();
	System.out.println("Cuántas arañas has capturado?: ");
	aranas=teclado.nextInt();
	System.out.println("Cuántas cochinillas has capturado?: ");
	cochinillas=teclado.nextInt();

	patas= hormigas * 6 + aranas * 8 + cochinillas * 14; //Calculo la suma total de patas de los insectos capturados

    //Mostrar resultado
    System.out.println("El número total de patas entre todos los insectos es: " +patas);

    }
}