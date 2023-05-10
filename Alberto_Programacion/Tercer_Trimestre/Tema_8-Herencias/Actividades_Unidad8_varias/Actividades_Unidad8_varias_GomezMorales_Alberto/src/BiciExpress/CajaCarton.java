/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package BiciExpress;

public class CajaCarton extends Caja {
    private double superficieCarton;

    public CajaCarton(double largo, double ancho, double alto) {
        super(largo, ancho, alto);
        this.superficieCarton = calcularSuperficieCarton();
    }

    public double getSuperficieCarton() {
        return this.superficieCarton;
    }

    private double calcularSuperficieCarton() {
        double volumenReal = super.getVolumen();
        double volumenUtilizado = volumenReal * 0.8;
        double lado = Math.cbrt(volumenUtilizado);
        double superficie = 6 * lado * lado;
        return superficie;
    }
}
