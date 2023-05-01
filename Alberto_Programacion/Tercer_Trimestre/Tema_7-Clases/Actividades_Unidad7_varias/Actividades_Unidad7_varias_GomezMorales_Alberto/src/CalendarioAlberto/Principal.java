/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * 
 * @author alber
 * 
 * Diseña la clase calendario que representa una fecha concreta (año, mes y día). La clase debe dispone de los métodos:
 *
 *  - constructor Calendario(int año, int mes, int dia): que crea un objeto con los datos pasados como parámetros, siempre y cuando, la fecha que representen sea correcta.
 *  - void incrementarDia(): que incrementa en un día la fecha del calendario.
 *  - void incrementarMes(): que incrementa en un mes la fecha del calendario.
 *  - void incrementarAño(int cantidad): que incrementa la fecha del calendario en el número de años especificados. Ten en cuanta que el año 0 no existió.
 *  - void mostrar(): muestar la fecha por consola.
 *  - boolean iguales(Calendario otraFecha): que determina si la fecha invocante y la que se pasa como parámetro son iguales o distintas.
 * 
 * Por simplicidad, solo tendremos en consideración que existen meses con distinto número de días, pero no tendremos en cuenta los años bisiestos.
 */

/* Paquetes */
package CalendarioAlberto;

/* Imports */
import java.util.Scanner;


public class Principal {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    private static void menu(){
        int opcion;
        Calendario fecha = crearFecha(teclado);
        
        do {
            opcion = textoMenu(teclado);
            switch (opcion) {
                case 1:
                    fecha.mostrar();
                    break;
                case 2:
                    fecha.incrementarDia();
                    break;
                case 3:
                    fecha.incrementarMes();
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de años a incrementar: ");
                    int cantidad = teclado.nextInt();
                    fecha.incrementarAño(cantidad);
                    break;
                case 5:
                    Calendario otraFecha = crearFecha(teclado);
                    if (fecha.iguales(otraFecha)) {
                        System.out.println("Las fechas son iguales.");
                    } else {
                        System.out.println("Las fechas son distintas.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);
    }

    private static Calendario crearFecha(Scanner teclado) {
        System.out.print("Ingrese el año: ");
        int año = teclado.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = teclado.nextInt();
        System.out.print("Ingrese el día: ");
        int dia = teclado.nextInt();
        return new Calendario(año, mes, dia);
    }

    private static int textoMenu(Scanner scanner) {
        System.out.println("***** CALENDARIO *****");
        System.out.println("1. Mostrar fecha actual");
        System.out.println("2. Incrementar día");
        System.out.println("3. Incrementar mes");
        System.out.println("4. Incrementar año");
        System.out.println("5. Comparar con otra fecha");
        System.out.println("0. Salir");
        System.out.println("**********************");
        System.out.print("Ingrese una opción: ");
        return teclado.nextInt();
    }
}
