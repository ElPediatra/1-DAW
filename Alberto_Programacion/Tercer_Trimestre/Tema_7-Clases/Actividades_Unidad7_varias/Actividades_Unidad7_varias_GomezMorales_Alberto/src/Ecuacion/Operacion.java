/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package Ecuacion;

public class Operacion {
    /* Atributos */
    private double a;
    private double b;
    private double c;
    
    /* Constructores */
    public Operacion(double a, double b, double c){ //Constructor para valores de la ecuación
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /* Getter y Setter */
    /*
    public void setA(){ //Asigno valor de A
        this.a = a;
    }    
    
    public double getA(){ //Devuelvo valor de A
        return a;
    }
    
    public void setB(){
        this.b = b;
    }
    
    public double getB(){
        return b;
    }
    
    public void setC(){
        this.c = c;
    }
    
    public double getC(){
        return c;
    }
    */
    /* Métodos */
    public void solucion(){ //Solución para suma de raíz
        /* variables */
        double discriminante;
        double raizDiscriminante;
        double solucion1;
        double solucion2;
        
        discriminante = b * b - 4 * a * c;
        
        if (discriminante < 0) { //Compruebo si el discriminante es negativo
            System.out.println("El discriminante es negativo.");
        } else { //Realizamos la operación y mostramos los resultados
            raizDiscriminante = Math.sqrt(discriminante);
            solucion1 = (-b + raizDiscriminante) / (2 * a);
            solucion2 = (-b - raizDiscriminante) / (2 * a);
            
            System.out.println("Soluciones de la ecuación: ");
            System.out.println("\t1º Discriminante positivo = " + solucion1);
            System.out.println("\t2º Discriminante negativo = " + solucion2);
        }
    }
}
