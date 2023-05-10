/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpresaTransporte;

/**
 *
 * @author alber
 */
public class Caja {
    private final double ancho;
    private final double alto;
    private final double fondo;
    private final Unidad unidad;
    private String etiqueta;
    
    public Caja(double ancho, double alto, double fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }
    
    public double getVolumen() {
        double factor = unidad == Unidad.CM ? 0.01 : 1.0;
        double volumen = factor * ancho * alto * fondo;
        return volumen;
    }
    
    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        } else {
            System.out.println("La etiqueta no puede ser mayor de 30 caracteres");
        }
    }
    
}
