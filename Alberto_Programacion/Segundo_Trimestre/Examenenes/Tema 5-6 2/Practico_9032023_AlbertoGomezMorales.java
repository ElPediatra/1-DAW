/*
 * Se quiere simular una agenda telefónica, donde almacenaremos un nombre para cada teléfono asociado. Debemos poder visualizar la agenda,
 * buscar un nombre determinado, insertar nuevos numeros, modificarlos y eliminarlos.
 *
 * Se pide implementar un programa modular(basado en métodos) que simule las acciones a realizar en una agenda telefónica, teniendo en cuenta que:
 *
 * - La agenda estará siempre ordenada en base al nombre del contacto (A-Z).
 * - Se supondrá un tamaño máximo de 300 contactos.
 *
 * 1º Mostar agenda
 * 2º Crear contacto
 * 3º Buscar
 * 4º Editar/Eliminar
 */

//Importamos los paquetes
import java.util.Scanner;

//Desarrollamos el programa.
public class Practico_9032023_AlbertoGomezMorales{
	public static void main(String[] args){
		menu();
	}

// ME HE LIADO, BLOQUEADO Y NO CONSIGO SACARLO. SE QUE ES UNA TONTERIA YA QUE TENGO TODOS LOS ELEMENTOS
// PARA ORGANIZAR EL ARRAY
	
	//Métodos/Funciones
	
	public static void menu(){
		//Definimos las variables
		Scanner teclado=new Scanner(System.in);
		int confirmacion;
		int opcion;
		String agenda[][] = new String[300][300]; //Defino el tamaño de la agenda a 300 como se solicita
		
		//Desarrollamos el programa
		do{
			/* Genero el menú de entrada */
			System.out.println("Bienvenido a tu agenda telefónica.");
			System.out.println("Seleccione una de las opciones: ");
			System.out.println("\t1. Mostrar contactos.");
			System.out.println("\t2. Crear contactos.");
			System.out.println("\t3. Buscar/Editar/Eliminar contactos.");
			System.out.println("\t0. Salir.");
			
			/* Solicito la opción del usuario */
			System.out.print("Selecciona una opcion: ");
			opcion = teclado.nextInt();
			
			
			/* Abro try por si el usuario indica una letra en vez de un número */
			try{
			
				switch(opcion){
					case 1:
					
						/* Se tiene que ordenar el array (Arrays.sort) por nombre y después recorrerlo mostrando los contactos ya guardados*/
						System.out.println("Has seleccionado mostar la agenda.");
						
						/*
						for(i=0; i < agenda.lenght()-1; i++){ //-1 ya que comienza por 0 y length marca el total
							for(j=0; j=i; j++){
							}
						}
						*/
					break;
				
					case 2:
					
						/* Tengo que mover el array hasta la posición vacía más cercana y solicitar al usuario el nombre y el teléfono para almacenarlos*/
						System.out.println("En desarrollo.");
					break;
					
					case 3:
						/* 
						 * Con Arrays.equals tengo que localizar la posición del Array en la que se encuentra el usuario y luego mostrar sus datos
						 * después le preguntaré al usuario si quiere editarlo, modificarlo o eliminarlo
						 */
						
						System.out.println("En desarrollo.");
					break;
				
					case 0:
						System.out.println("Seguro que quieres salir?");
						System.out.println("\t1.Si");
						System.out.println("\t2.No");
						confirmacion = teclado.nextInt();
						
						if (confirmacion==1) {
							System.out.println("Confirmamos su salida.");
						} else {
							System.out.println("Salida rechazada.");
							opcion++;
						}
					break;
				
					default:
						System.out.println("Opción no válida, revíselo por favor (0-3).");
					break;
				}
			
			/* Excepción al introducir una letra en las opciones */
			}catch(Exception Letras){ //No me carga con la excepción "InputMismatchException" que me aparece al marcar una opción como "a" por ejemplo cuando lo tengo como int
					System.out.println("Las opciones son numéricas del 0 al 3, no puedes indicar letras para seleccionar una opción.");
					teclado.nextLine(); //No me da error con el try
					opcion=4;
			}
			
		}while(opcion != 0);
	}
}