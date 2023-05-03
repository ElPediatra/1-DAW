/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * @author alber
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
    
    public boolean comparar(HoraExacta otraHora) {
        if (this.horas == otraHora.horas &&
                this.minutos == otraHora.minutos &&
                this.segundos == otraHora.segundos) {
            return true;
        } else {
        return false;
        }
    }
}
