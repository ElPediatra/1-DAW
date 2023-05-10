/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package InstrumentosCampana;

/* Imports */
import java.util.ArrayList;

public abstract class Instrumento {
    
    /* Creo una lista para guardar las notas */
    protected ArrayList<Nota> notas;
    
    /* Constructor para añadir notas */
    public Instrumento() {
        notas = new ArrayList<Nota>();
    }
    
    /* Método para añadir las notas */
    public void add(Nota nota){
        notas.add(nota);
    }
    
    public abstract void interpretar();
}