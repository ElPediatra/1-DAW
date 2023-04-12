/*
 * Pedir al usuario:
 *  - 3 nombres y ordenarlos alfabéticamente (A-Z)
 */

import java.util.Scanner;

public class ListaNombres_Alberto{
    public static void main(String[] args){

        //Definimos las variables
        byte opcion;
        char confirmacion;
        boolean salir=false;
        Scanner teclado = new Scanner(System.in);

        //Desarrollamos el programa
        do{
            mostrar();
                opcion=teclado.nextByte();
            switch(opcion) {
                case 1:
                    nombres();
                break;

                case 0:
                    System.out.println("Has elegido salir, ¿estás seguro?(s/n)");
                    confirmacion=teclado.next().charAt(0);

                    if(confirmacion=='s'){
                        System.out.println("\t\t\t Confirmada su salida. ¡Hasta la próxima!");
                        salir=true;
                        break;
                        } else if (confirmacion=='S'){
                            System.out.println("\t\t\t Confirmada su salida. ¡Hasta la próxima!");
                            salir=true;
                            break; 
                        }
                break;

                default:
                    System.out.println("Opción no válida.");

             }
            }while (!salir);
        }

//Funciones/Métodos

    /* Texto del menú */
    public static void mostrar(){
        System.out.println("\t\t Menú Lista de Nombres Alberto");
        System.out.println("1.Insertar 3 nombres y ordenarlos");
        System.out.println("0.Salir.");
        System.out.println("\t\tSeleccione una opción por favor.");
    }

    /* Opción de ordenar nombres */
    public static void nombres(){

        //Definimos las variables de la función
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[3]; //Defino el tamaño a 3 ya que son solo 3 nombres los que se van a incluir
        int numNombre=0;
        int contadorNombre;
        String auxiliar; //Auxiliar para ordenar los nombres
        String nombre;

        //Uso el contador para insertar un nombre en cada una de las posiciones del Array
        do {
                System.out.println("Inserta el "+ (numNombre+1) + "º nombre por favor:");
                nombre=teclado.nextLine().toLowerCase();
                nombres[numNombre]=nombre;
                numNombre++;
            } while(numNombre < 3);
        
        //Ordenamos el Array de Nombres
        contadorNombre = nombres.length;
  
        //Comparo las posiciones del array e intercambio los nombres si no están en orden
        for (int i = 0; i < contadorNombre - 1; i++) {
            for (int j = 0; j < contadorNombre - i - 1; j++) {
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                    auxiliar = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = auxiliar;
                }
            }
        }

        //Mostramos los nombres
        System.out.println("Los nombres ordenados son:");
        System.out.println("\t1º - " + nombres[0] + ".");
        System.out.println("\t2º - " + nombres[1] + ".");
        System.out.println("\t3º - " + nombres[2] + ".");
    }
}