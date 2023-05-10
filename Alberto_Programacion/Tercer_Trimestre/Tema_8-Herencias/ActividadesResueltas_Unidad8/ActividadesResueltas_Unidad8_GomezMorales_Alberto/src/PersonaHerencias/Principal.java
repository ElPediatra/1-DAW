/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package PersonaHerencias;

import static PersonaHerencias.Persona.hoyEs;

/*
 * Alberto Gómez Morales
 * @author alber
 */
public class Principal {
        //Objetos
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TEMA OBJETOS
        
        /* Persona 1 */
        Persona persona1 = new Persona();
            persona1.nombre = "Juan Pablo";
            persona1.edad = 19;
            persona1.estatura = 1.87;
            persona1.dni = "Y77182725";
            persona1.incremento = 0.12;
        
        /* Persona 2 */
        Persona persona2 = new Persona(); /* Si no asigno new Persona(), el programa
                                           * no compilará ya que al objeto no se le
                                           * ha asignado la clase y al no seleccionar datos
                                           * me mantendrá los que se pusieron por defecto en
                                           * la class principal.
                                           */
        
        /* Persona 3 */
        Persona persona3 = new Persona(1.80,"55112288B"); //Constructor estatura y dni
            persona3.nombre = "Jose María";
        
        /* Persona 4 */
        Persona persona4 = new Persona(1.91); //Constructor incremento
            persona4.nombre = "Armando";
            persona4.estatura = 1.60;
            
        /* Persona 5 */
        Persona persona5 = new Persona("Antonio","11111111Q"); //Constructor nombre y dni
        
        /* *************************************************** */
        
        //TEMA HERENCIAS
        
        /* Empleado 1 */
        Empleado empleado1 = new Empleado("Juanpisito", 19, 1.88, "11111111A", 2500);
        
        /* Empleado 2 */
        Empleado empleado2 = new Empleado("Pablo el follones", 23, 1.85,"22222222B", 500);
        
        /* Empleado 3*/
        Empleado empleado3 = new Empleado("Víctor el coletas", 19, 1.80, "33333333C", 600);
        
        /* *************************************************** */
        
        /* Print datos persona 1 */
        // Muestra los datos que se han asignado para esta persona
        persona1.saludar();
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);
        System.out.println("Estatura: " + persona1.estatura + "m");
        System.out.println("DNI/NIE: " + persona1.dni + "\n**************************");
        persona1.cumplirAnos();
        persona1.crecer(persona1.incremento);
        
        System.out.println(); //Espacio en blanco
        
        /* Print del atributo estático (stactic + atributo) */
        System.out.println(Persona.hoy);
        hoyEs(Persona.dia); //Aplicamos método para cambiar el valor Persona.hoy
        System.out.println("Se ha actualizado el día a: " + Persona.hoy);
        
        /* *************************************************** */
        
        /* Print datos empleado 1 */
        // Muestra los datos que se han asignado para esta persona
        empleado1.saludar();
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Edad: " + empleado1.edad);
        System.out.println("Estatura: " + empleado1.estatura + "m");
        System.out.println("DNI/NIE: " + empleado1.dni + "\n**************************");
        
        System.out.println("Salario actual: " + empleado1.salario + "€.");
        empleado1.cumplirAnos();
        empleado1.crecer(empleado1.incremento);
        empleado1.incrementarSalario();
        
        System.out.println(); //Espacio en blanco
    }
}