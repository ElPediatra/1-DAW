//Alberto Gómez Moralse -- Ejercicio 1.16 página 42

import java.util.Scanner;
public class U1_R4_EJ16_Alberto{
	public static void main(String[] args){

	//Declaramos variables
	int segundos;
	int horas;
	int minutos;
	int segundosFinal;
	Scanner teclado=new Scanner (System.in);

	//Desarrollo del programa
	System.out.println("Dime una cantidad en segundos");
	segundos = teclado.nextInt();

	horas = (segundos / 3600); //Calculamos las horas por los segundos
    minutos = ((segundos-horas*3600)/60); //Quitamos las horas a los segundos totales y calculamos los minutos
    segundosFinal = segundos-(horas*3600+minutos*60); //Quitamos las horas y segundos a los segundos totales y obtenemos los segundos restantes

	//Mostrar resultado

	System.out.println(segundos+ " es " + horas + " horas " + minutos + " minutos  y " + segundosFinal + " segundos");

	}
}
