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

public class Caja {
    private double largo;
    private double ancho;
    private double alto;

    public Caja(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getAncho() {
        return this.ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public double getVolumen() {
        return this.largo * this.ancho * this.alto;
    }
}
