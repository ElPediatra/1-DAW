/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Página 275
 * Ejercicio 8.22
 * 
 * @author alber
 * 
 * La clase Object dispone del método finalize(), que se ejecuta justo antes de que el
 * recolector de basura destruya un objeto. Escribe un programa que, mediante la creación
 * masiva de objetos no referenciados y el overriding del método finalize(), compruebe
 * el funcionamiento del recolector de basura.
 */

/* Paquetes */
package RecolectorBasura;

public class Principal {
    public static void main(String[] args) {
        // Crear un gran número de objetos no referenciados
        for (int i = 0; i < 1000000; i++) {
            new Basura();
        }
    }
}
