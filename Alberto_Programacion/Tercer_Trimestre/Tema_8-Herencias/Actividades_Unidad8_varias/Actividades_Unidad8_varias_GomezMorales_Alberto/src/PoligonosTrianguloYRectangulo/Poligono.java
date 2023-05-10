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

public abstract class Poligono {
    protected double base;
    protected double altura;
    
    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public abstract double area();
}
