/*
 * Alberto Gómez Morales -- Ejercicio 12 Libro Tema 4
 * Implementa la función 'static double distancia(double x1, double y1, double x2, double y2)' que
 * calcula y devuelve la distancia euclídea que separa los puntos (x1, y1) y (x2, y2). La formula
 * para calcular esta distancia es Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))).
 */

import java.util.Scanner; //Importación de paquetes

public class U4_R3_Ejercicios_4_12_Alberto {
        public static void main(String[] args) {

            // Declaro las variables que me pide el ejercicio
            Scanner teclado = new Scanner(System.in);
            double x1;
            double x2;
            double y1;
            double y2;

            // Desarrollamos el programa
            System.out.println("Con este programa calcularemos la distancia euclídea de 4 puntos (en par de 2).");
            System.out.println("Indica las coordenadas 'x' e 'y' del primer punto (primero una y luego otra):");
            x1 = teclado.nextDouble();
            y1 = teclado.nextDouble();
            System.out.println("Indica las coordenadas 'x' e 'y' del primer punto (primero una y luego otra):");
            x2 = teclado.nextDouble();
            y2 = teclado.nextDouble();
            System.out.println("La distancia entre los dos puntos es " + distancia(x1, y1, x2, y2));
        }
    
        //Declaramos la función que se solicitia
        public static double distancia(double x1, double y1, double x2, double y2) {
            return Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        }
    }