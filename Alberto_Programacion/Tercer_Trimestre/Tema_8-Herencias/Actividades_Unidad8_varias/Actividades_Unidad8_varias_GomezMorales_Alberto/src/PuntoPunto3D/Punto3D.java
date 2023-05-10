/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package PuntoPunto3D;

public class Punto3D extends Punto {
    private int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public double distancia(Punto3D otroPunto) {
        int dx = getX() - otroPunto.getX();
        int dy = getY() - otroPunto.getY();
        int dz = z - otroPunto.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
