/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author alber
 */

/* Paquetes */
package Animales;

public class Animales implements Cloneable{
    /* Atributos */
    Sexo sexo; //El Atributo es una relación de composición entre el valor del atributo y la clase Sexo.java
    private static int contadorAnimales = 0;
    
    /* Constructor */
    Animales(Sexo s){
        sexo = s;
        this.contadorAnimales++;
    }
    
    /* Getter & Setter */
    public Sexo getSexo(){
        return sexo;
    }
    
    public int getCantidadAnimales(){
        return this.contadorAnimales;
    }
    
    /* Métodos */
    public void dormir(){
        System.out.println("zZzZzZz");
    }

    @Override
    public String toString(){
        return "Sexo: "+this.sexo;
    }

    @Override
    public Animales clone() {
        try {
            return (Animales) super.clone();
        } catch (CloneNotSupportedException e) {
            // Manejar la excepción de clonación si es necesario
            return null;
        }
    }
}