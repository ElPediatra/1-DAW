/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package PaletaColores;

/* Imports */
import java.util.Random;

public class Colores {
    /* Atributos */
    private static final String[] ColoresDefecto = {"rojo", "azul", "amarillo", "verde", "blanco", "negro", "gris"}; //Colores por defecto
    private String[] colores; //Lista para añadir colores y modificar la original
    
    /* Constructores */
    public Colores() { //Constructor por defecto
        colores = ColoresDefecto;
    }
    
    public Colores(String[] colores){ //Seleccionar colores
        this.colores = colores;
    }
    
    /* Métodos */
    public void incluirColor(String color) { //Añadir un color a la "cadena"
        String[] nuevoColor = new String[colores.length + 1]; //Nueva lista que luego copiare en la de colores
        
        for (int i = 0; i < colores.length; i++){ //Copio los colores hasta la posición final y 
            nuevoColor[i]=colores[i];
        }
        
        nuevoColor[colores.length] = color; //Agregamos el nuevo color a la lista
        colores = nuevoColor;
    }
    
    public String[] seleccionarColores(int n) {
        String[] coloresSeleccionados = new String[n]; //Nueva lista para los colores seleccionados
        Random random = new Random(); //Random para elegir el color final
        int aux;
        
        for (int i = 0; i < n; i++) { //Elegimos un color al azar
            aux = random.nextInt(colores.length);
            
            while(colorYaSeleccionado(colores[aux], coloresSeleccionados)){ //Si es un color que ya está, busca otro
                aux = random.nextInt(colores.length);
            }
            
            coloresSeleccionados[i] = colores[aux]; //Agrego el color a la lista
        }
        
        return coloresSeleccionados; //Devuelvo la lista de colores
    }
    
    private boolean colorYaSeleccionado(String color, String[] coloresSeleccionados){ //Compruebo si el color ya se ha seleccinado
        for (int i = 0; i < coloresSeleccionados.length; i++){
            if (color.equals(coloresSeleccionados[i])){
                return true;
            }
        }
        return false;
    }
}
