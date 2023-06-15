/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package MarcaPaginas;

public class MarcaPagina {
    private int paginaActual;
    private int ultimaPaginaLeida;

    /* Constructor*/
    public MarcaPagina() {
        this.paginaActual = 1;
        this.ultimaPaginaLeida = 0;
    }
    
    /* Getters y Setters */
    public int getPaginaActual() {
        return this.paginaActual;
    }

    public int getUltimaPaginaLeida() {
        return this.ultimaPaginaLeida;
    }

    /* Métodos */
    public void avanzarPagina() {
        this.ultimaPaginaLeida = this.paginaActual;
        this.paginaActual++;
    }

    public void reiniciarLibro() {
        this.paginaActual = 1;
        this.ultimaPaginaLeida = 0;
    }
}
