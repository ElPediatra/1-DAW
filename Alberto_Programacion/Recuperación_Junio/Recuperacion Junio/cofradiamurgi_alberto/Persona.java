/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package cofradiamurgi_alberto;

/**
 *
 * @author alberto
 */

/* Creo una clase Principal persona, de la cual heredaran los penitentes y los costaleros*/
public class Persona {
    /* Atributos */
    protected String nombre;
    protected double estatura;
    
    /* Consructores */
    
    public Persona(){ //Constructor por defecto
        this.nombre = "Alberto";
        this.estatura = 1.30;
    }
    
    public Persona(String nombre, double estatura){ //Constructor general
        this.nombre = nombre;
        this.estatura = estatura;
    }
    
    public Persona(Persona persona){ //Constructor copia
        this.nombre = persona.nombre;
        this.estatura = persona.estatura;
    }
    
    /* Getter y Setter */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEstatura(double estatura){
        this.estatura=estatura;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getEstatura(){
        return this.estatura;
    }
    
    /* Métodos */
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\nEstatura: " + this.estatura;
    }
}
