/*
 * Diseña una aplicación para gestionar la llegada a meta de los participantes de una carrera. Cada uno de ellos
 * dispone de un dorsal (un número entero) que los identifica. En la aplicación se introduce el número de dorsal
 * de cada corredor cuando este llega a la meta. Para indicar que la carrera ha finalizado (han llegado todos los
 * corredores a la meta), se introduce como dorsal el número -1.
 * 
 * A continuación, la aplicación solicita información extra de los corredores. En primer lugar, se introducen los
 * dorsales de todos los corredores menores de edad; para premiarlos por su esfuerzo se les avanza un puesto en
 * el ranking general de la carrera, es decir, es como si hubieran adelantado al corredor que llevaban delante.
 * En segundo lugar, se introducen los dorsales de los corredores que han dado positivo en el test antidopaje, lo
 * que provoca su expulsión inmediata. Para finalizar, se introducen los dorsales de los corredores que no han
 * pagado su inscripción en la carrera, lo que provoca que se releguen a los últimos puestos del ranking general.
 * La aplicación debe mostrar los dorsales de los corredores que han conseguido las medallas de oro, plata y bronce.
 * 
 * 
 * 
 * Diseña una aplicación que muestre un array bidimensional con forma cuadrada, solicitando por terminal el tamaño
 * de uno de sus lados. La diagonal tiene que ser 1 y el resto de casillas rellenarlas con números aleatorios entre 2 y 20.
 */

import java.util.Scanner;
import java.util.Random;

public class U5_R7_CarrerayMatriz_Alberto{
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
                    ejercicio1(); //Carrera
                break;

                case 2:
                    ejercicio2(); //Array bidimensional
                break;

                case 0:
                    System.out.println("Has elegido salir, ¿estás seguro?(s/n)");
                    confirmacion=teclado.next().charAt(0);

                    if(confirmacion=='s'){
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

    /* Menú */
    public static void mostrar(){
        System.out.println("\t\t Menú");
        System.out.println("0.Salir.");
        System.out.println("1.Carrera.");
        System.out.println("2.Matriz.");
        System.out.println("\t\tSeleccione una opción por favor.");
    }

    /* Opción 1 y submétodos */
    public static void ejercicio1(){
        
        //Definimos las variables
        Scanner teclado = new Scanner(System.in);
        /* Llegada de corredores */
        int[] dorsales = new int[100]; //Pongo 100 corredores por poner un tope al array
        int numCorredores = 0; //Contador
        /* Corredores menores de edad */
        int[] menores = new int[100];
        int numMenores = 0; //Contador
        /* Corredores con positivo en Dopaje */
        int[] positivos = new int[100];
        int numPositivos = 0; //Contador
        /* Corredores que no han pagado */
        int[] impagos = new int[100];
        int numImpagos = 0; //Contador

        //Solicitamos los dorsales que van llegando
        int dorsal;
        do {
            System.out.print("Introduce los dorsales de los corredores que llegan a la meta (-1 para finalizar): ");
            dorsal = teclado.nextInt();
            if (dorsal != -1) {
                dorsales[numCorredores] = dorsal;
                numCorredores++;
            }
        } while (dorsal != -1);
        
        //Revisamos menores de edad
        System.out.println("Introduce los dorsales de los corredores menores de edad (-1 para finalizar):");
        do {
            System.out.print("Dorsal: ");
            dorsal = teclado.nextInt();
            if (dorsal != -1) {
                menores[numMenores] = dorsal;
                numMenores++;
            }
        } while (dorsal != -1);

        for (int i = 0; i < numMenores; i++) {
            int pos = buscarDorsal(dorsales, menores[i], numCorredores);
            if (pos > 0) {
                //Se pasan a la posición del array que tienen delante
                int aux = dorsales[pos - 1];
                dorsales[pos - 1] = dorsales[pos];
                dorsales[pos] = aux;
            }
        }

        //Expulsamos a los corredores que den positivo en drogas/dopaje
        System.out.println("Introduce los dorsales de los corredores que han dado positivo en el test antidopaje (-1 para finalizar):");
        do {
            System.out.print("Dorsal: ");
            dorsal = teclado.nextInt();
            if (dorsal != -1) {
                positivos[numPositivos] = dorsal;
                numPositivos++;
            }
        } while (dorsal != -1);

        for (int i = 0; i < numPositivos; i++) {
            int pos = buscarDorsal(dorsales, positivos[i], numCorredores);
            if (pos >= 0) {
                //Expulsamos a los corredores del array
                for (int j = pos; j < numCorredores - 1; j++) {
                    dorsales[j] = dorsales[j + 1];
                }
                numCorredores--;
            }
        }

        //Pasamos al final a los corredores que no han pagado
        System.out.println("Introduce los dorsales de los corredores que no han pagado su inscripción (-1 para finalizar):");
        do {
            System.out.print("Dorsal: ");
            dorsal = teclado.nextInt();
            if (dorsal != -1) {
                impagos[numImpagos] = dorsal;
                numImpagos++;
            }
        } while (dorsal != -1);
    
        for (int i = 0; i < numImpagos; i++) {
            int pos = buscarDorsal(dorsales, impagos[i], numCorredores);
            if (pos >= 0) {
                //Los mandamos al final del array
                for (int j = pos; j < numCorredores - 1; j++) {
                    dorsales[j] = dorsales[j + 1];
                }
                dorsales[numCorredores - 1] = impagos[i];
            }
        }

        //Mostramos las posiciones de Oro, Plata y Bronce
        if (numCorredores >= 3) {
            System.out.println("Medalla de oro: " + dorsales[0]);
            System.out.println("Medalla de plata: " + dorsales[1]);
            System.out.println("Medalla de bronce: " + dorsales[2]);
        } else if (numCorredores == 2) {
            System.out.println("Medalla de oro: " + dorsales[0]);
            System.out.println("Medalla de plata: " + dorsales[1]);
        } else if (numCorredores == 1) {
            System.out.println("Medalla de oro: " + dorsales[0]);
        } else {
            System.out.println("Todos han sido descalificados :/)");
        }
    }

    //Busca el dorsal en el array principal
    public static int buscarDorsal(int[] array, int dorsal, int numCorredores) {
        for (int i = 0; i < numCorredores; i++) {
            if (array[i] == dorsal) {
                return i;
            }
        }
        return -1;
    }

    /* Opción 2 y submétodos */
    public static void ejercicio2(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño del lado del array: ");
        int tamanoLado = teclado.nextInt();

        int[][] arrayBidimensional = new int[tamanoLado][tamanoLado];
        Random random = new Random();

        for (int i = 0; i < tamanoLado; i++) {
            for (int j = 0; j < tamanoLado; j++) {
                if (i == j) {
                    arrayBidimensional[i][j] = 1;
                } else {
                    arrayBidimensional[i][j] = random.nextInt(19) + 2;
                }
            }
        }

        for (int i = 0; i < tamanoLado; i++) {
            for (int j = 0; j < tamanoLado; j++) {
                System.out.print(arrayBidimensional[i][j] + " ");
            }
            System.out.println();
        }
    }
}