//Alberto Gómez Morales -- Ejercicio 18 Libro

//Modifica la Actividad de la aplicación 17 para que, además de los dos números
//aleatorios, también aparezca la operación que debe realizar el jugador: suma,
//resta o multiplicación.

import java.util.Scanner;

public class U2_R2_EJ18_Alberto{
	public static void main(String []args){
	
	//Definimos las variables
	int numero1;
	int numero2;
	int suma;
    int resta;
    int multiplicacion;
	int resultado;
    int tipoOperacion;
	Scanner teclado = new Scanner(System.in);
	
	//Desarrollamos el programa
	System.out.println("Indicame un número entero: ");
	numero1 = teclado.nextInt();
	System.out.println("Indicame otro número entero: ");
	numero2 = teclado.nextInt();
	System.out.println("¿Vas a sumar (1), restar (2) o multiplicar (3)? Indica el número de la operación que vas a realizar: ");
    tipoOperacion = teclado.nextInt();
    System.out.println("Indica el restultado de la operación y comprobaré si es correcto:");
    resultado = teclado.nextInt();

	suma = numero1 + numero2;
	resta = numero1 - numero2;
    multiplicacion = numero1 * numero2;

    switch (tipoOperacion) {
        case 1:
        if (suma == resultado) {
            System.out.println("Enhorabuena, sabes sumar dos números enteros");
        } else {
            System.out.println("Vas a tener que volver a primaria, no has sumado bien");
        }
        break;
        case 2:
        if (resta == resultado) {
            System.out.println("Enhorabuena, sabes restar dos números enteros");
        } else {
            System.out.println("Vas a tener que volver a primaria, no has sumado bien");
        }
        break;
        case 3:
        if (multiplicacion == resultado) {
            System.out.println("Enhorabuena, sabes multiplicar dos números enteros");
        } else {
            System.out.println("Vas a tener que volver a primaria, no has sumado bien");
        }
        break;
        default: System.out.println("No has elegido ninguna de las operaciones indicadas");
        }
	}
}