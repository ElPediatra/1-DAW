import java.util.Scanner;

public class U5_EjercicioDNI_NIE_Alberto{
    public static void main(String[] args){
        byte opcion;
        char confirmacion;
        boolean salir=false;
        Scanner teclado = new Scanner(System.in);

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

                    if(confirmacion=='s' || confirmacion=='S'){
                        System.out.println("\t\t\t Confirmada su salida. ¡Hasta la próxima!");
                        salir=true;
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (!salir);
    }

    public static void mostrar(){
        System.out.println("\t\t Menú Lista de Nombres Alberto");
        System.out.println("1.Insertar 3 nombres y ordenarlos");
        System.out.println("0.Salir.");
        System.out.println("\t\tSeleccione una opción por favor.");
    }

    public static void nombres(){
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[3];
        int n = nombres.length;
        String auxiliar;

        for (int i = 0; i < 3; i++){
            System.out.println("Inserta el "+ (i+1) + "º nombre por favor:");
            nombres[i] = teclado.nextLine();
        }

        //Comparo las posiciones 0 y 1 e intercambio los nombres si no están en orden
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                    auxiliar = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = auxiliar;
                }
            }
        }

        System.out.println("Los nombres ordenados son:");
        System.out.println("\t1º - " + nombres[0] + ".");
        System.out.println("\t2º - " + nombres[1] + ".");
        System.out.println("\t3º - " + nombres[2] + ".");
    }
}