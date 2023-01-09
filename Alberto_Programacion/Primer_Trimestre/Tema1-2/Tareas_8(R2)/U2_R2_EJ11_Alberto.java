//Alberto Gómez Morales -- Ejercicio 11 Libro -- Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999.
//La aplicación tendrá que indicar si el número introducido es capicúa.

import java.util.Scanner;
public class U2_R2_EJ11_Alberto {
	public static void main(String[]args) { 

        //Defino las variables
		Scanner teclado=new Scanner(System.in);
		int num;
        int millar;
        int centena;
        int decena;
        int unidad;
		boolean capicua=false, valido=true;
        //Defino una para cada posición del número, ya que vamos a tener que separarlo

		//Desarrollo
		System.out.println("Introduce un numero entre el 0 y 9999, comprobaré si es capicua");
		num=teclado.nextInt();

		//Dividimos el número para sacar cada unidad y ver si es capicúa
		millar = num / 1000;
		centena = (num - (millar * 1000)) / 100;
		decena= (num - (millar * 1000 + centena*100))/10;
		unidad= num%10;

		//Usamos boolean (true / false) para descartar los números no validos.
		if((num < 0) || (num > 9999))
			valido = false;
		else
			if(num<10)
				valido=false;
		//Vemos si es capicula o no comparando los números por su posición y tamaño del número indicado
			else
				if(num<100) //Número de 2 dígitos
					capicua=(unidad == decena) ?  true : false; 
				else
					if(num<1000) //Número de 3 dígitos
						capicua=(unidad == centena) ?  true : false;
					else { //Número de 4 dígitos
						capicua=(unidad == millar) ? true : false;
						capicua=(decena == centena) ? true : false;
					}
        //Indicamos los diferentes resultados
		if(valido==false)
			System.out.println("El número no es válido.");
		else
			if(capicua==true)
				System.out.println("El numero "+num+" si es capicua");
			else
				System.out.println("El numero "+num+" no es capicua");
	}
}