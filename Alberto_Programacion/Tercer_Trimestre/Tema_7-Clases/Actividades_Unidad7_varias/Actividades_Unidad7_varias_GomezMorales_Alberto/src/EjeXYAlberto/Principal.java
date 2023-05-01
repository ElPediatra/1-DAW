/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * 
 * @author alber
 * 
 * Escribe la clase Punto que representa un punto en el plano (con un componente x y un componente y), con los métodos:
 *  - Constructor Punto(double x, double y): construye un objeto con los datos pasados como parámetros.
 *  - void desplazaX(double dx): incrementa el componente x en la cantidad dx.
 *  - void desplazaY(double dy): incrementa el componente y en la cantidad dy.
 *  - void desplaza(double dx, double dy): desplaza ambos componentes según las cantidades dx (en el eje x) y dy (en el componente y).
 *  - double distanciaEuclidea(Punto otro): calcula y devuelve la distancia euclídea entre el punto invocante y el punto otro.
 *  - void muestra(): muestra por consola la información relativa al punto.
 */

/* Paquetes */
package EjeXYAlberto;

/* Imports */
import java.util.Scanner;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    private static void menu(){
            double x;
            double y;
            double x2;
            double y2;
            double dx;
            double dy;
            int opcion = 0;

            System.out.println("Ingrese la coordenada x del punto:");
            x = teclado.nextDouble();
            System.out.println("Ingrese la coordenada y del punto:");
            y = teclado.nextDouble();
                    
            Punto punto = new Punto(x, y);
                                                           
            System.out.println("Punto creado con éxito.");
            punto.muestra();
            
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Desplazar un punto");
            System.out.println("2. Calcular la distancia entre dos puntos");
            System.out.println("3. Mostrar información de un punto");
            System.out.println("0. Salir");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la coordenada x del desplazamiento:");
                    dx = teclado.nextDouble();
                    System.out.println("Ingrese la coordenada y del desplazamiento:");
                    dy = teclado.nextDouble();
                    
                    punto.desplaza(dx, dy);
                    
                    System.out.println("Punto desplazado con éxito.");
                    punto.muestra();
                    break;
                case 2:
                    System.out.println("Ingrese la coordenada x del segundo punto:");
                    x2 = teclado.nextDouble();
                    System.out.println("Ingrese la coordenada y del segundo punto:");
                    y2 = teclado.nextDouble();
                    
                    Punto otroPunto = new Punto(x2, y2);
                    double distancia = punto.distanciaEuclidea(otroPunto);
                    System.out.println("La distancia euclídea entre los puntos es: " + distancia);
                    break;
                case 3:
                    punto.muestra();
                    break;
                case 0:
                    System.out.println("¿Está seguro que desea salir? (S/N)");
                    String confirmacion = teclado.next();
                    
                    if (confirmacion.equalsIgnoreCase("S")) {
                        System.out.println("¡Hasta luego!");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }
}
    

