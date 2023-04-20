/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW
 * @author alber
 */

/* Paquetes */
package RedElectrica;

/* Clase */
public class Bombilla {
    /* Atributos */
    public static boolean interruptorGeneral = true; //General de la casa
    private boolean interruptor; //Individual bombillas

    /* Constructores */
    public Bombilla(){
        this.interruptor = false; //Comienza apagada
    }
    
    /* Métodos */
    public void encender(){
        this.interruptor = true; //Encendemos la bombilla
    }
    
    public void apagar(){
        this.interruptor = false; //Apagamos la bombilla
    }
    
    public boolean estado(){
        return interruptorGeneral && interruptor; //Comprueba si la bombilla tiene luz (general y exclusivo)
    }
    
    public String estadoBombilla() {
        return estado() ? "Encendida" : "Apagada"; //Muestra el resultado en texto
    }
}