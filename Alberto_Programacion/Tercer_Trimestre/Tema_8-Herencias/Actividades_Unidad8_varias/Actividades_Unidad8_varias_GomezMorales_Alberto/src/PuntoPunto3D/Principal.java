/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Página 275
 * Ejercicio 8.25
 * 
 * @author alber
 * 
 * Define la clase Punto, que tiene como atributos las coordenadas "x" e "y", de tipo entero, que
 * lo sitúan en el plano. Además del constructor, implementa el método
 *  - double distancia(Punto otroPunto),
 * que devuelve la distancia a otro punto que se le pasa como parámetro.
 * 
 * A partir de Punto, por herencia, implementa la clase Punto3D, que representa un punto en tres
 * dimensiones y necesita una coordenada adicional "z". Reimplementa el método distancia() para
 * puntos 3D.
 */

/* Paquetes */
package PuntoPunto3D;

/* Imports */
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x del primer punto: ");
        int x1 = teclado.nextInt();
        System.out.print("Ingrese la coordenada y del primer punto: ");
        int y1 = teclado.nextInt();
        Punto punto1 = new Punto(x1, y1);

        System.out.print("Ingrese la coordenada x del segundo punto: ");
        int x2 = teclado.nextInt();
        System.out.print("Ingrese la coordenada y del segundo punto: ");
        int y2 = teclado.nextInt();
        Punto punto2 = new Punto(x2, y2);

        System.out.print("La distancia entre los puntos en el plano es: ");
        System.out.println(punto1.distancia(punto2));

        System.out.print("Ingrese la coordenada x del primer punto 3D: ");
        int x3 = teclado.nextInt();
        System.out.print("Ingrese la coordenada y del primer punto 3D: ");
        int y3 = teclado.nextInt();
        System.out.print("Ingrese la coordenada z del primer punto 3D: ");
        int z3 = teclado.nextInt();
        Punto3D punto3D1 = new Punto3D(x3, y3, z3);

        System.out.print("Ingrese la coordenada x del segundo punto 3D: ");
        int x4 = teclado.nextInt();
        System.out.print("Ingrese la coordenada y del segundo punto 3D: ");
        int y4 = teclado.nextInt();
        System.out.print("Ingrese la coordenada z del segundo punto 3D: ");
        int z4 = teclado.nextInt();
        Punto3D punto3D2 = new Punto3D(x4, y4, z4);

        System.out.print("La distancia entre los puntos en el espacio tridimensional es: ");
        System.out.println(punto3D1.distancia(punto3D2));
    }
}
