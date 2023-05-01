/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW
 * 
 * @author alber
 * 
 * Implementa una clase que permita resolver ecuaciones de segundo grado. Los
 * coeficientes pueden indicarse en el constructor y modificarse a posteriori.
 * Es fundamental que la clase disponga de un método que devuelva las distintas
 * soluciones y de un método que nos informe si el discriminante es positivo.
 */

/* Paquetes */
package Ecuacion;

/* Imports */
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        /* Variables */
        double a;
        double b;
        double c;
        double solucion1;
        double solucion2;
        Scanner teclado = new Scanner(System.in);
        
        /* Desarrollamos el programa */
        System.out.println("Indica el valor de a: ");
        a = new Scanner(System.in).nextDouble();
        
        System.out.println("Indica el valor de b: ");
        b = new Scanner(System.in).nextDouble();
        
        System.out.println("Indica el valor de c: ");
        c = new Scanner(System.in).nextDouble();
        
        //Asigno los valores al constructor
        Operacion ecuacion = new Operacion(a, b, c);
        
        //Llamamos a la clase Operacion para que muestre el resultado
        ecuacion.solucion();
    }
}
