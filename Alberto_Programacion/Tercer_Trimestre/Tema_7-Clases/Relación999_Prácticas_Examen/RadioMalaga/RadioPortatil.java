/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/* Paquetes */
package Radio;

/**
 *
 * @author alber
 */
public class RadioPortatil {
    /* Atributos */
    private double frecuencia;
    
    /* Constructores */
    public RadioPortatil(){ //Constructor por defecto
        this.frecuencia = 80.0;
    }
    
    public RadioPortatil(double frecuencia){ //Constructor para radio inicial
        this.frecuencia = frecuencia;
    }
    
    /* Getter y Setter */
    public double getFrecuencia(){ //Muestra la frecuencia
        return this.frecuencia;
    }
    
    public void setFrecuencia(double frecuencia){ //Modifica la frecuencia
        this.frecuencia = frecuencia;
    }
    
    /* Métodos */
    public void subir(){ //Subir la frecuencia de la radio
        this.frecuencia+=0.5;
        rango();
    }
    
    public void bajar(){ //Bajar la frecuencia de la radio
        this.frecuencia-=0.5;
        rango();
    }
    
    private void rango(){ //Comparar la frecuencia, private ya que se accede desde los métodos de esta clase no desde fuera
        this.frecuencia=this.frecuencia>108 ? 80: this.frecuencia;
        this.frecuencia=this.frecuencia<80 ? 108: this.frecuencia;
    }
    
    public void mostrar(){ //Mostrar la frecuencia actual modificada
        System.out.println("Frecuencia actual: " +getFrecuencia() + "MHz.");
    }
    
    public boolean iguales(RadioPortatil radio){
        return(this.frecuencia == radio.getFrecuencia());
    }
}
