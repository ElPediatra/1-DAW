//Alberto Gómez Morales -- 1º DAW -- Actividad Maestro

/*
 * Indicar si el número indicando por el usuario es primo o no.
 * Hay que utilizar funciones/métodos.
 */

public class U4_R1_Ej1_Alberto {
public static void main(String[] args) {

    //Definimos las variables
    int numero;
	Scanner teclado=new Scanner(System.in);

	//Desarrollamos el programa
	System.out.println("Introduce un número y te indicaré si es primo:");
	numero=teclado.nextInt();

	if(comprobarPrimo(numero)){
		System.out.println("El número " + numero + " es primo");
	}else{
		System.out.printf("El número " + numero +" no es primo");
	}
	}

	//Método para comprobar si es primo
	public static boolean comprobarPrimo(int numero){
		boolean esPrimo=true;
		int aux=2;
		while(aux<numero && esPrimo){
			esPrimo=numero%aux==0?false:true;
			aux++;
		}
		return(esPrimo);
}
}
