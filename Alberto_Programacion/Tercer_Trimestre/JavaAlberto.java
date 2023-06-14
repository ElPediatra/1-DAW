import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math; //Math.sqrt

public class JavaAlberto {
    //extends
    /* Colores String */
    final static String ROJO = "\033[31m"; //Texto color rojo
    final static String VERDE = "\033[32m"; //Texto color verde
    final static String RESET = "\033[0m";  //Texto color por defecto

    //Setter void
    //Gettet tipo

    static Scanner teclado = new Scanner(System.in);

    /* Declarar ArrayList
     * public static ArrayList<NombreClaseObjeto> nombreArrayList = new ArrayList<>();
     * .add(i);
     * .size();
     * .get(i);
     * .set(i,j);
     * .remove(i);
     * boolean .contains(i);
     * boolean .isEmpty();
     */

    public static void main(String[] args){
        menu();
    }
     /* Métodos */
    private static void menu() {
        /* Variables */
        byte opcion;
        char confirmacion;
        boolean salir = false;

        //Desarrollamos el programa
        do {
            menuTexto();
            opcion = teclado.nextByte();
            switch (opcion) {
                case 1:
                    break;
                
                case 2:
                    break;
                
                case 3:
                    break;
                    
                case 4:
                    break;
                
                case 0:
                    System.out.println("Has elegido salir, ¿estás seguro?(s/n)");
                    confirmacion = teclado.next().charAt(0);
                    
                    if (confirmacion == 's' || confirmacion == 'S') {
                        System.out.println("\t\t Confirmada su salida del programa. ¡Hasta la próxima!");
                        salir = true;
                        break;
                    }
                    break;
                
                default:
                    System.out.println("Opción no válida. Por favor, selecciona otra opción.");
            }
        } while (!salir);
    }

    /* Texto Menu */
    public static void menuTexto() {
        System.out.println("\t Menú Alberto Gómez Morales ");
        System.out.println(ROJO + "1. " + RESET + VERDE + "" + RESET);
        System.out.println(ROJO + "2. " + RESET + VERDE + "" + RESET);
        System.out.println(ROJO + "3. " + RESET + VERDE + "" + RESET);
        System.out.println(ROJO + "4. " + RESET + VERDE + "" + RESET);
        System.out.println(ROJO + "0. " + RESET + VERDE + "Salir." + RESET);
        System.out.println("\tSeleccione una opción por favor.");
    }

    /*
    public static void mostrarArrayList(ArrayList<NombreClaseObjeto> nombreArrayList) {
        //Variables
        int contador=0;
        
        if(nombreArrayList.isEmpty()){
            System.out.println("El ArrayList está vacío");
        } else {        
            for (NombreClaseObjeto nombreI : nombreArrayList) {
                System.out.println(contador + ". Objeto:\n" + nombreI + "\n");
                contador++;
            }
        }
    }
    */

    /* Declara Array
     * int[] array = new int[i];
     * array[i] = j;
     * mostrarEspecifico = array[i]; sout(mostrarEspecifico);
     * tamanio = length; sout(tamanio);
     */

    /* Declara String
     * 
     */

}