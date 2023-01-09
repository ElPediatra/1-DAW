//Alberto Gómez Moralse -- Ejercicio 1.19 página 42

import java.util.Scanner;
public class U1_R4_EJ19_Alberto{
	public static void main(String[] args){

	//Declaramos variables
	int entradaInfantil;
    int entradaAdulto;
	double importe;
	Scanner teclado=new Scanner(System.in);

	//Desarrollamos el programa
	System.out.println("Entradas infantiles que desea comprar: ");
	entradaInfantil=teclado.nextInt();
	System.out.println("Entradas de adultos que desea comprar: ");
	entradaAdulto=teclado.nextInt();

	importe=entradaInfantil*15.50+entradaAdulto*20; //Calculo el precio total de las entradas
	importe=importe>100?importe-importe*0.05:importe; //Calculo si es necesario aplicar el descuento

	//Mostrar resultado

	System.out.println("El precio total de las entradas es de: "+importe+"€");

	}
}
