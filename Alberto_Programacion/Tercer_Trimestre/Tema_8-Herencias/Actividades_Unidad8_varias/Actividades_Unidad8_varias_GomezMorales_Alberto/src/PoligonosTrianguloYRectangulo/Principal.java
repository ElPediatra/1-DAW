/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Página 275
 * Ejercicio 8.23
 * 
 * @author alber
 * 
 * Implementa la clase abstracta Poligono, con los atributos base y altura, de tipo double
 * y el método abstracto double area().
 */

/* Paquetes */
package PoligonosTrianguloYRectangulo;

/* Imports */
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Pedir datos del rectángulo
        System.out.println("Base del rectángulo:");
        double baseRectangulo = teclado.nextDouble();
        System.out.println("Altura del rectángulo:");
        double alturaRectangulo = teclado.nextDouble();
        
        // Crear objeto de la clase Rectangulo y calcular área
        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
        double areaRectangulo = rectangulo.area();
        
        // Resultado del área del rectángulo
        System.out.println("El área del rectángulo es: " + areaRectangulo);
        
        // Pedir datos del triángulo
        System.out.println("Base del triángulo:");
        double baseTriangulo = teclado.nextDouble();
        System.out.println("Altura del triángulo:");
        double alturaTriangulo = teclado.nextDouble();
        
        // Crear objeto de la clase Triangulo y calcular área
        Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
        double areaTriangulo = triangulo.area();
        
        // Resultado del área del triángulo
        System.out.println("El área del triángulo es: " + areaTriangulo);
    }
}
