/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Paquetes */
package NumerosSuma;

/* Imports */
import static NumerosSuma.Suma.sumar;

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Página 275
 * Ejercicio 8.21
 * 
 * @author alber
 * 
 * Implementa los siguientes métodos:
 *  - static boolean esNumero(Object ob), que nos dice si su parámetro de entrada es tipo numérico (Integer, Double, Long, Float...).
 *  - boolean sumar(Object a, Object b), que muestra por consola la concatenación de los parámetros de entrada, si ambos son cadenas,
 * o muesta su suma convertida al tipo Double, si ambos son de tio numérico. En cualquier otro caso, muestra el mensaje "No sumables".
 */
public class Principal {
    public static void main(String[] args) {
        Object a = 5;
        Object b = 3.14;
        Object c = "Hola";
        Object d = new Object();
        
        sumar(a, b); // debería imprimir 8.14
        sumar(c, d); // debería imprimir "No sumables"
        sumar(c, " Mundo"); // debería imprimir "Hola Mundo"
    }
}
