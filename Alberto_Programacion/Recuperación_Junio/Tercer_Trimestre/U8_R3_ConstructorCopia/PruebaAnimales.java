/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 * 
 * Crea un constructor copia sobre la clase Mamiferos. Haz la siguiente simulación:
 * 1. Crea un objeto de la clase Mamifero y usa .clone() para obtener una copia. Modifica los atributos en ambos observa lo que pasa.
 * 2.Crea un objeto de la clase Mamifero y usa el constructor copia para obtener una copia del objeto. Modifica los atributos en ambos, observa lo que pasa.
 */

/* Paquetes */
package Animales;

/* Imports */
import java.util.ArrayList;

public class PruebaAnimales {
    public static void main(String[] args) {
        /* Objetos */
        Mamiferos mamifero1 = new Mamiferos(Sexo.Macho, "de tierra");

        System.out.println(mamifero1);
        
        Mamiferos mamifero2 = mamifero1.clone();

        System.out.println(mamifero1);
        System.out.println(mamifero2);
    }
}
