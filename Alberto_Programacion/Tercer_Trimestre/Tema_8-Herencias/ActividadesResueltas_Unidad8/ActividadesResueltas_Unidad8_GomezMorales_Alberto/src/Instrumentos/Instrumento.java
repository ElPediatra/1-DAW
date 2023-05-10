/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Ejercicio Resuelto 8.4
 * Página 270
 * 
 * @author alber
 * 
 * Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de
 * una melodía (dentro de una misma octava). El método add() añade nuevas notas musicales.
 * La clase también dispone del método abstracto interpretar() que, en cada subclase que
 * herede de Instrumento, mostrará por consola las notas musicales según las interprete.
 * Utilizar enumerados para definir las notas musicales.
 */

/* Paquetes */
package Instrumentos;

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
