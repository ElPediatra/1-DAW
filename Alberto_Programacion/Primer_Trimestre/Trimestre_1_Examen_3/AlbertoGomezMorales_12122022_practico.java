import java.util.Scanner;

public class AlbertoGomezMorales_12122022_practico {
	public static void main(String[] args){

	//Definimos las variables
	Scanner teclado = new Scanner(System.in);

	/* Menú */
	int menu = 1;
	char salida = 'n';
	char nombre;

	/* Opción 1*/
	int numero;

	/* Opción 2*/
	int binario;

	//Desarrollamos el programa
	
	System.out.println("Bienvenido a este programa. Por favor, indique su nombre: ");
	nombre = teclado.next().charAt(0);
	
		do { //Bucle de menú hasta que (salida) no sea 'n'
			menuOpciones(nombre);
			menu = teclado.nextInt();
			do { //Bucle de menú para que cuando marque una opción y se resvuelva, vuelva a salir el mensaje
				if (menu == 0) {
					System.out.println("\t\t\t\t¿Seguro que quieres salir? (s/n)");
					salida = teclado.next().charAt(0);
				} else {
					switch (menu) {//Menú para las diferentes opciones, con mensaje de error en caso de que ninguna sea correcta
						case 0:
						continue;
						
						case 1:
							System.out.println("Lo sentimos, esta opción todavía no está implementada");							
						break;

						case 2:
							System.out.println("Indicame el número que quieres que convierta en binario, recuerda que tiene que ser positivo y entero.");
							binario = teclado.nextInt();

							do {
							System.out.println("El número debe ser un entero positivo, indica otro por favor: ");
							binario = teclado.nextInt();
							} while (binario < 0);
							
							decBin(binario);
						break;

						default:
							System.out.println("Perdona " + nombre + ", esa opción no es válida. Selecciona otra.");
						break;
					}
				}
			} while (menu != 0);
		} while (salida == 'n');

		esSalida(nombre);
	}

	//Desarrollamos los métodos/funciones
	
	/* Menú de opciones */
	public static void menuOpciones (char nombre){
		System.out.println("Hola " + nombre + ", bienvenid@ a mi programa: ");
		System.out.println();
		System.out.println("\t\t\t\tSelecciona una de las opciones:");
		System.out.println("1.- Indicar en orden inverso los números positivos que hayas indicado hasta indicar el número 5.");
		System.out.println("2.- Convertir un número entero positivo en binario.");
		System.out.println("\t\t\t\tPara salir pulsa '0'");
	}

	/* Mensaje de salida */
	public static void esSalida (char nombre){
		System.out.println("\t\tSe ha procedido a cerrar el programa. ¡Hasta la próxima " + nombre + "!");
	}
	
	/* Opción 1 */
	public static void positivosInverso (int n) {
	}

	/* Opción 2 */
	public static void decBin(int n) {
		int aux;
		int resto;

		if (n == 0) {
		System.out.println(n);
		} else {
		resto = n%2;
		System.out.println(resto);
		aux = n;
		n = aux/2;
		decBin(n); //Reemplazo n para seguir utilizando la función hasta que de 0
		}

	}
}
