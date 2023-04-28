/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tiempo;

/**
 *
 * @author alber
 */
public class Hora {
    /* Atributos */
    protected int horas; //Se usa protected para marcarlos como atributos protegidos, ya que están pensados para heredar a una subclase
    protected int minutos;
    
    /* Constructor */
    Hora(int horas, int minutos){
        this.horas = 0;
        this.minutos = 0;
        if(!setHora(horas)) { //Llamo a los métodos setHora y setMinutos para comprobar que la hora es correcta
            System.out.println("La hora no es correcta.");
        }
        if(!setMinutos(minutos)) {
            System.out.println("Los minutos no son correctos.");
        }
    }
    
    /* Getter y setter */
    //No son necesarios en este ejercicio, no se solicta menú de petición a usuario
    //Se usan los nombres setHora y setMinutos para las clases booleanas de confirmación de datos

    /*
    public void setHoras(int nHoras){
        this.horas = nHoras;
    }
    
    public void setMinutos(int nMinutos){
        this.minutos = nMinutos;
    }
    
    */
    
    /* Métodos */
    void inc(){ //Aumento la hora1
        minutos++; //aumento los minutos en 1
        if(minutos > 59){ //Comprobante de minutos
            minutos = 0;
            horas++;
        }
        if(horas > 23){ //Comprobante de horas
            horas = 0;
        }
    }
    
    boolean setMinutos(int minutos){ //Compruebo los minutos
        boolean correcto = false;
        if(minutos >= 0 && minutos <= 59){ //Compruebo si los minutos son correctos
            this.minutos = minutos;
            correcto = true;
        }
        return correcto;
    }
    
    boolean setHora(int horas){ //Compruebo las horas
        boolean correcto = false;
        if(horas < 23 && horas > 0){ //Compruebo si las horas son correctas
            this.horas = horas;
            correcto = true;
        }
        return true;
    }
    
    @Override //Superpone a la clase principal (superclase)
    public String toString(){
        String hora = horas + ":" + minutos;
        return hora;
    }
}
