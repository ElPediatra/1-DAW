import java.util.Scanner;
public class U2_R2_EJ5_Alberto {
	public static void main(String[]args) { 
		//Solicitar al usuario un numero entre 0 y 9999, indicar si el numero introducido es capicua.
		//Variables
		Scanner teclado=new Scanner(System.in);
		int num, millares, centenas, decenas, unidades;
		boolean capicua=false, valido=true;
		//Desarrollo
		System.out.println("Introduce un numero[0-9999], voy a comprobar si es capicua");
		num=teclado.nextInt();
		//Dividimos el numero para comparar cada numero
		millares=num/1000;
		centenas=(num-(millares*1000))/100;
		decenas=(num-(millares*1000 + centenas*100))/10;
		unidades=num%10;
		//Descartamos las opciones no validas asignando un booleano que mostraremos al final.
		if((num<0)||(num>9999))
			valido=false;
		else 
			if(num<10)
				valido=false;
		//Comparamos si es capicua
			else
				if(num<100)
					capicua=(unidades==decenas) ?  true : false; 
				else
					if(num<1000)
						capicua=(unidades==centenas) ?  true : false;
					else {
						capicua=(unidades==millares) ? true : false;
						capicua=(decenas==centenas) ? true : false;
					}
		if(valido==false)
			System.out.println("El número no esta en el rango establecido.");
		else
			if(capicua==true)
				System.out.println("El numero "+num+" SI es capicua");
			else
				System.out.println("El numero "+num+" NO es capicua");
	}
}