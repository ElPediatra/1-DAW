/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Ejercicio 8.13
 * Página 274
 * 
 * @author alber
 * 
 * La empresa de mensajería BiciExpress, que reparte en bicicleta, para disminuir
 * el peso que transportan sus empleados solo utiliza cajas de cartón. El volumen
 * de estas se calcula como el 80% del volumen real, con el fin de evitar que se
 * deformen y se rompan. Otra característica de las cajas de cartón es que sus
 * medidas siempre están en centímetros. Por último, la empresa, para controlar
 * costes, necesita saber cuál es la superficie total de cartón utilizado para
 * construir todas las cajas.
 * 
 * Escribe la clase CajaCarton heredando de la clase Caja.
 */

/* Paquetes */
package BiciExpress;

public class Principal {
    public static void main(String[] args) {
        double superficieCarton;
        int cantidadCajas;
        CajaCarton caja = new CajaCarton(20, 10, 15);

        
        superficieCarton = caja.getSuperficieCarton();
        System.out.println("Superficie de cartón utilizado por la caja: " + superficieCarton);

        cantidadCajas = 10; // ejemplo de 10 cajas
        double superficieTotal = superficieCarton * cantidadCajas;
        System.out.println("Superficie total de cartón utilizado para construir " + cantidadCajas + " cajas: " + superficieTotal);
    }  
}
