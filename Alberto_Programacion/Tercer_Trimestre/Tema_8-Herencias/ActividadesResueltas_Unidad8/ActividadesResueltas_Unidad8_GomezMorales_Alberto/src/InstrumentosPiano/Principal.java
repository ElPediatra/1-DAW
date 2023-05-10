/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InstrumentosPiano;

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Ejercicio Resuelto 8.5
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
public class Principal {
    public static void main(String[] args){
        Piano piano = new Piano();
        
        /* Añado las notas */
        piano.add(Nota.DO);
        piano.add(Nota.RE);
        piano.add(Nota.MI);
        
        /* Reproduzco la música del piano*/
        piano.interpretar();
    }
    
}
