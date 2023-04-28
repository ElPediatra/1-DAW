/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author alber
 */
public class Empleado extends Persona {
        double salario;
        Empleado(String nombre, int edad, double estatura, String dni, double salario){
            super(nombre, edad, estatura);
            this.salario = salario;
        }
        
        
    void incrementarSalario(){
        this.salario = salario+200;
        System.out.println("Su salario ha aumentado a: " + salario + "€.");
    }
}
