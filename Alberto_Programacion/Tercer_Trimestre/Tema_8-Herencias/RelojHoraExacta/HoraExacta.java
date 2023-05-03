/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * 
 * @author alber
 * 
 * A partir de la clase Hora implementar la clase HoraExacta, que incluye en
 * la hora los segundos. Además de los métodos heredados de Hora, dispondrá de:
 * 
 *  - Constructor HoraExacta(hora, minuto, segundo), que construye un objeto con
 * los datos pasados como parámetros.
 * 
 *  - setSegundos(valor), que asigna, si está comprendido entre 0 y 59, el valor
 * indicado a los segundos.
 * 
 *  - inc(), que incrementa la hora en un segundo.
 */

/* Paquetes */
package Tiempo;

public class HoraExacta extends Hora {
/* Atributos */
    private int segundos;

    /* Constructor */
    HoraExacta(int horas, int minutos, int segundos) {
        super(horas, minutos);
        setSegundos(segundos);
    }

    /* Getter y Setter */
    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if(segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        }
        else {
            System.out.println("Los segundos no son correctos.");
        }
    }

    /* Métodos */
    @Override
    void inc() {
        segundos++;
        if(segundos > 59) {
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        String hora = super.toString() + ":" + segundos;
        return hora;
    }
}