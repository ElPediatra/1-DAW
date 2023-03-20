import java.util.Scanner;
import java.util.Arrays;

public class Practico_9032023_AlbertoGomezMorales_Corregido {

    // Definimos los arrays de nombres y números
    private static String[] nombres = new String[300];
    private static String[] numeros = new String[300];
    private static int cantidadContactos = 0;

    public static void main(String[] args) {

        // Menú principal
        int opcion;
        do {
            System.out.println("\n-- Agenda Telefónica --");
            System.out.println("1. Mostrar agenda");
            System.out.println("2. Agregar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Editar o eliminar contacto");
            System.out.println("5. Salir");
            opcion = leerEntero("Ingrese una opción: ");

            switch (opcion) {
                case 1:
                    mostrarAgenda();
                    break;
                case 2:
                    agregarNuevoContacto();
                    break;
                case 3:
                    buscarContacto();
                    break;
                case 4:
                    editarEliminarContacto();
                    break;
                case 5:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 5);

    }

    // Método para mostrar la lista de contactos en orden alfabético
    private static void mostrarAgenda() {
        // Ordenamos el array de nombres
        Arrays.sort(nombres, 0, cantidadContactos);
        System.out.println("\n-- Lista de Contactos --");
        for (int i = 0; i < cantidadContactos; i++) {
            System.out.println(nombres[i] + " - " + numeros[i]);
        }
    }

    // Método para agregar un nuevo contacto a la agenda
    private static void agregarNuevoContacto() {
        String nombre = leerString("Ingrese el nombre del contacto: ");
        String numero = leerString("Ingrese el número de teléfono del contacto: ");
        agregarContacto(nombre, numero);
        System.out.println(nombre + " ha sido agregado a la agenda.");
    }

    // Método para agregar un contacto al array de nombres y números
    private static void agregarContacto(String nombre, String numero) {
        nombres[cantidadContactos] = nombre;
        numeros[cantidadContactos] = numero;
        cantidadContactos++;
    }

    // Método para buscar un contacto en la agenda y mostrar su número de teléfono
    private static void buscarContacto() {
        String nombre = leerString("Ingrese el nombre del contacto a buscar: ");
        // Ordenamos el array de nombres
        Arrays.sort(nombres, 0, cantidadContactos);
        // Buscamos el nombre usando el método binarySearch
        int indice = Arrays.binarySearch(nombres, 0, cantidadContactos, nombre);
        if (indice >= 0) {
            System.out.println(nombres[indice] + " - " + numeros[indice]);
        } else {
            System.out.println(nombre + " no se encontró en la agenda.");
        }
    }

    // Método para editar o eliminar un contacto de la agenda
    private static void editarEliminarContacto() {
        String nombre = leerString("Ingrese el nombre del contacto a editar o eliminar: ");

        // Ordenamos el array de nombres
        Arrays.sort(nombres, 0, cantidadContactos);

        // Buscamos el nombre usando el método binarySearch
        int indice = Arrays.binarySearch(nombres, 0, cantidadContactos, nombre);
        if (indice >= 0) {
            int opcion = leerEntero("¿Qué desea hacer con " + nombres[indice] + "?\n1. Editar número de teléfono\n2. Eliminar contacto\nIngrese una opción: ");
            switch (opcion) {
                case 1:
                    String nuevoNumero = leerString("Ingrese el nuevo número de teléfono: ");
                    numeros[indice] = nuevoNumero;
                    System.out.println(nombres[indice] + " ha sido actualizado con el nuevo número " + nuevoNumero);
                break;

                case 2:
                    for (int i = indice; i < cantidadContactos - 1; i++) {
                    nombres[i] = nombres[i + 1];
                    numeros[i] = numeros[i + 1];
                    }

                    cantidadContactos--;
                    System.out.println(nombres[indice] + " ha sido eliminado de la agenda.");
                break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                break;
            }
        } else {
            System.out.println(nombre + " no se encontró en la agenda.");
        }
    }

    // Método para leer un entero desde la consola
    private static int leerEntero(String mensaje) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(mensaje);
    while (!scanner.hasNextInt()) {
        System.out.print(mensaje);
        scanner.next();
    }
    int entero = scanner.nextInt();
    scanner.nextLine();
    return entero;
    }

    // Método para leer una cadena de caracteres desde la consola
    private static String leerString(String mensaje) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(mensaje);
    return scanner.nextLine();
    }
}    