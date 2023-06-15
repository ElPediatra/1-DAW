/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquete */
package EjeXYAlberto;

class Punto {
    private double x = 1;
    private double y = 1;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx) {
        this.x += dx;
    }

    public void desplazaY(double dy) {
        this.y += dy;
    }

    public void desplaza(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distanciaEuclidea(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void muestra() {
        System.out.println("Coordenada x: " + this.x);
        System.out.println("Coordenada y: " + this.y);
    }
}