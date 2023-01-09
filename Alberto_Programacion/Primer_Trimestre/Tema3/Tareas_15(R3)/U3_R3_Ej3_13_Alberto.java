//Alberto Gómez Morales -- 1º DAW -- Actividades de Aplicación

/*
 * Escribe un programa que incremente la hora de un reloj. Se
 * pedirán por teclado la hora, minutos y segundos, así como
 * cuántos segundos se desea incrementar la hora introducida.
 * La aplicación mostrará la nueva hora. Por ejemplo, si las
 * 13:59:51 se incrementan en 10 segundos, resultan las 14:00:01.
 */

import java.util.Scanner;

public class U3_R3_Ej3_13_Alberto{
	public static void main(String []args){

	//Declaramos las variables
    int horas;
    int minutos;
    int segundos;
	Scanner teclado=new Scanner(System.in);

    //Desarrollamos el programa

	System.out.println("Tenemos que configurar la hora en el reloj.");
	System.out.println("Indicame la hora, por favor:");
	horas=teclado.nextInt();
	System.out.println("Ahora indicame los minutos:");
	minutos=teclado.nextInt();
	System.out.println("Por último, indicame los segundos:");
	segundos=teclado.nextInt();

	System.out.printf("Son las %02d:%02d:%02d.%n",horas,minutos,segundos);

	System.out.println("Dime cuántos segundos quieres aumentar la hora y te la indicaré:");
	segundos=teclado.nextInt()+segundos;

	while(segundos>=60) {
		minutos++;
		segundos-=60;
	}

	while(minutos>=60) {
		horas++;
		minutos-=60;
	}

	while(horas>=24) {
		horas-=24;
	}

	System.out.println("Con los segundos indicados, serían las: " + horas + ":" + minutos + ":" + segundos);
    }
}