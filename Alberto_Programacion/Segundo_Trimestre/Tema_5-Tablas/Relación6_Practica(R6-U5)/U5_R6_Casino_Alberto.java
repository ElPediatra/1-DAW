import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/* 
 * Alberto Gómez Morales - 1º DAW - U5_R6_Casino
 * 
 * Opción 1: Generar 100 números aleatorios entre 5 y 105, mostrandolos de mayor a menor y viceversa.
 * 
 * Opción 2: Diseñar una función de nombre "primivita" que recibe 2 vectores de números enteros, el primero serán 6 números que
 * el usuario ha elegido y el segundo serán 6 números generados de forma aleatoria en el rango 0-50 que se corresponden con la 
 * combinación ganadora de la Primitiva. El método devolverá el número de aciertos que el usuario ha tenido, ninguno de los 2
 * arrays puede contener números repetidos
 * 
 * Opción 3: PENDIENTE DE PRÓXIMO EJERCICIO
 */

public class U5_R6_Casino_Alberto{
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args){

        //Definimos las variables
        byte opcion;
        char confirmacion;
        boolean salir=false;

        //Desarrollamos el programa
        do{
            mostrar();
                opcion=teclado.nextByte();
            switch(opcion) {
                case 1:
                    ejercicio1();
                break;

                case 2:
                    ejercicio2();
                break;

                case 3:
                    ejercicio3();
                break;

                case 0:
                    System.out.println("Has elegido salir, ¿estás seguro?(s/n)");
                    confirmacion=teclado.next().charAt(0);

                    if(confirmacion=='s' || confirmacion=='S'){
                        System.out.println("\t\t\t Confirmada su salida. ¡Hasta la próxima!");
                        salir=true;
                        break;
                        }
                break;

                default:
                    System.out.println("Opción no válida, selecciona otra.");

             }
            }while (!salir);
        }

//Funciones/Métodos

    /* Menú del programa */
    public static void mostrar(){
        System.out.println("\t\t ¡Welcome to 'Los Delincuentes' Casino!");
        System.out.println("\t\t Selecciona una de las opciones:");
        System.out.println("0.Salir.");
        System.out.println("1. Los 100 números aleatorios.");
        System.out.println("2. La Primitiva.");
        System.out.println("3. Opción NO DISPONIBLE (Futura actualización)");
    }

    /* Opción 1 - 100 números */
    public static void ejercicio1(){
        Random random = new Random(); //Puedo definir esta variable como 'Random' al haber importado el paquete 'util.Random'
        int[] numeros = new int[100]; //Creo la variable con la cantidad de números que va a tener para aplicar a Ramdon y que los genere

        for (int i = 0; i < 100; i++) {
            numeros[i] = 5 + random.nextInt(101); //Generamos los números Random
        }

    Arrays.sort(numeros); //Ordeno los números con el import 'java.util.Arrays' para ordenar el array de menor a mayor

    System.out.println("De menor a mayor:");
    for (int i = 0; i < 100; i++) {
      System.out.println(numeros[i]); //Mostramos los números de menor a mayor
    }

    System.out.println("De mayor a menor:");
    for (int i = 99; i >= 0; i--) { //Con un bucle for inverso (de 99 a 0) mostramos los números de mayor a menor
      System.out.println(numeros[i]);
    }

    }

    /* Opción 2 - La Primitiva */
    public static void ejercicio2() {
		int boleto[] = new int[6];
		int ganador[] = new int[6];
		for (int i = 0; i < ganador.length; i++) {
			ganador[i] = 51+i;
		}
		for (int i = 0; i < ganador.length; i++) {
			do {
				ganador[i] = generarAleatorio(0, 50);
			} while (estaRepetido(ganador[i], ganador, i));
		}
		Arrays.sort(ganador);
		for (int i = 0; i < boleto.length; i++) {
			boleto[i] = 51+i;
		}
		System.out.println("Para participar en la primitiva, indique los 6 números con los que participarás:");
		for (int i = 0; i < boleto.length; i++) {
			do {
				System.out.println("Introduzca su número [" + (i+1) + "] del 0 al 50:");
				boleto[i] = pedirNum();
			} while (boleto[i] < 0 || boleto[i] > 50 || estaRepetido(boleto[i], boleto, i));
		}
		System.out.printf("Los números premiados de la primitiva son: ");
		for (int i = 0; i < ganador.length; i++) {
			System.out.print(ganador[i] + " / ");
		}
		System.out.println();
		System.out.println("El número de aciertos que has consegido es de: " + comprobarAciertos(boleto, ganador));
	}

    public static int generarAleatorio(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

    public static int pedirNum() {
		teclado.nextLine();
		return teclado.nextInt();
	}


	public static boolean estaRepetido(int numero, int[] numeros, int pos) {
		boolean repetido = false;
		for (int i = 0; i < numeros.length; i++) {
			if (i == pos) {
				continue;
			}
			if (numero == numeros[i]) {
				repetido = true;
			}
		}
		return repetido;
	}

	public static int comprobarAciertos(int[] numeros1, int[] numeros2) {
		int aciertos = 0;
		for (int i = 0; i < numeros1.length; i++) {
			for (int j = 0; j < numeros2.length; j++) {
				if (numeros1[i] == numeros2[j]) {
					aciertos++;
				}
			}
		}
		return aciertos;
	}

    /* Opción 3 - Pendiente de  */
    public static void ejercicio3(){
        System.out.println("Opción en proceso de creación, vuelva en unos días para poder acceder.");
    }
}
