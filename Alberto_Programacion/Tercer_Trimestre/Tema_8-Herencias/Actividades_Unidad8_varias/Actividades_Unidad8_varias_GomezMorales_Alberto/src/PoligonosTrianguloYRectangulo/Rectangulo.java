/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package PoligonosTrianguloYRectangulo;

public class Rectangulo extends Poligono {
    
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }
    
    public double area() {
        return base * altura;
    }
}