/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW
 * @author alber
 * 
 * Crea una clase que sea capaz de mostrar el importe de un cambio, por ejemplo,
 * al realizar una compra, con el menor número de monedas y billetes posibles.
 */

/* Paquetes */
package Transacciones;

/* Imports*/
import java.util.Scanner;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        compra();
    }
    
    public static void compra(){
        /* Atributos */
        double precio;
        double entregado;
        
        //Pido los datos al cliente
        System.out.println("Indica el total de la compra: ");
        precio = teclado.nextDouble();
        System.out.println("Indica el importe entregado por el cliente: ");
        entregado = teclado.nextDouble();
        
        //Mando la petición para mostrar la vuelta de la commpra
        Devoluciones devolucion = new Devoluciones(precio, entregado);
        
        System.out.println("El cambio es:\n" + devolucion.calcularCambio());
    }
    
}
