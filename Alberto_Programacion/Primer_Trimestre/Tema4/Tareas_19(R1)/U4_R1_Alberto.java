/* 
 * Realizar todo en un mismo menú
 * 1.Diseñar la función eco() a la que se le pasa como parámetro un numero n, y muestra por pantalla n-veces el mensaje " Eco....."
 * 2. Escribir una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
 * 3. Escribir una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
 * 4.Diseñar una función que recibe como parámetros dos números enteros y devuelve el máximo de ambos.
 * 5.Crea una función que, mediante un booleano, indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.
 * 6. Diseñar una función con el siguiente prototipo: boolean esPrimo(int n)  que devovlverá true si n es primo y false en caso contrario.
 */

import java.util.Scanner;

public class U4_R1_Alberto {
    public static void main(String[] args) {

    //Declaramos las variables
    Scanner teclado=new Scanner(System.in);
    int numero1;
    int numero2;
    int opcion;
    char letra;

    //Desarrollamos el programa

    System.out.println("Bienvenido, selecciona una de las opciones para utilizar el programa: ");
    System.out.println("\t\t1.Eco...");
    System.out.println("\t\t2.Mostrar los números entre dos enteros.");
    System.out.println("\t\t3.Mostrar los números entre dos enteros v2.");
    System.out.println("\t\t4.Indicar el mayor de 2 números.");
    System.out.println("\t\t5.Comprobar si el carácter es vocal.");
    System.out.println("\t\t6.Comprobar si el número es primo.");
    System.out.println("Indique la opción que quiere utilizar: ");
    opcion=teclado.nextInt();

    switch(opcion){
        case 1:
            System.out.println("Indica la fuerza del eco (número entero): ");
            numero1=teclado.nextInt();
			eco(numero1);
        break;

        case 2:
			System.out.println("Indica el primer número: ");
			numero1=teclado.nextInt();
			System.out.println("Indica el segundo número: ");
			numero2=teclado.nextInt();
			numeros(numero1,numero2);
        break;

        case 3:
			System.out.println("Indica el primer número: ");
			numero1=teclado.nextInt();
			System.out.println("Indica el segundo número: ");
			numero2=teclado.nextInt();
			numeros(numero1,numero2);
        break;

        case 4:
			System.out.println("Indica el primer número: ");
			numero1=teclado.nextInt();
			System.out.println("Indica el segundo número: ");
			numero2=teclado.nextInt();
			System.out.println("El número más grande es:" + mayor(numero1,numero2));
        break;

        case 5:
			System.out.println("Indica el carácter para comprobar si es vocal: ");
			letra=teclado.next().charAt(0);
			System.out.println("¿La letres es vocal?" + vocal(letra));
			
        break;

        case 6:
			System.out.println("Indica un número, comprobaré si es primo: ");
			numero1=teclado.nextInt();
			System.out.println("¿El número es primo? " + esPrimo(numero1));
        break;

        default:
            System.out.println("La opción no es correcta.");
        break;

    }

    }
    
    //Desarrollamos los métodos

	public static void eco(int numero1){ //n-veces mensaje
		for(int i=1;i<=numero1;i++){
			System.out.println(" Eco.....");
		}
		System.out.println();
	}
    
	public static void numeros(int numero1, int numero2){ //números comprendidos entre enteros
		int aux; //Defino auxiliar para poder usarlo en el método

		if(numero2>numero1){
			aux=numero2;
			numero2=numero1;
			numero1=aux;
		}
		System.out.println("Los números entre "+numero1+" y "+numero2+" son: ");
		for(int i=numero2;i<=numero1;i++){
			System.out.println(i);
		}
		System.out.println();
	}

	public static int mayor(int numero1, int numero2){
		if(numero1>numero2){
			return numero1;
		}
		else{
			return numero2;
		}
	}

	public static boolean vocal(char letra){
		if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
			return true;
		}
		else{
			return false;
		}
	}

	public static boolean esPrimo(int numero1){
		boolean esPrimo=true;
		int aux=2;
		while(aux<numero1 && esPrimo){
			esPrimo=numero1%aux==0?false:true;
			aux++;
		}
		return(esPrimo);
	}

}