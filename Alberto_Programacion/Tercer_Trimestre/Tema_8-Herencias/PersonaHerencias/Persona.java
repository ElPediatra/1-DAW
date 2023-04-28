/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Persona;

/**
 *
 * @author alber
 */
public class Persona {
    public static String nombre = "Alberto";
    int edad = 28;
    double estatura = 1.90;
    public static String dni = "54120738J";
    double incremento = 0.25;
    static String hoy = "Hoy no es jueves, hoy es viernes!";
    static int dia = 5;
    
    /* Constructores para la clase Persona */
    Persona() {
        //Sin acciones a realizar
    }
    
    Persona(String nombre, int edad, double estatura, String dni, double incremento){ //Todos los datos
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.dni = dni;
        this.incremento = incremento;
    }
    
    Persona(String nombre, int edad, double estatura){ //CONSTRUCTOR PARA LA CLASE EMPLEADO
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    
    Persona(String nombre, String dni){ //Nombre y dni
        this.nombre = nombre;
        this.dni = dni;
    }

    Persona(double estatura, String dni){ //Estatura y dni
        this.estatura = estatura;
        this.dni = dni;
    }
    
    Persona(double incremento) { //Incremento de altura
        this.incremento = incremento;
    }
    
    Persona(int edad, String dni) {
        this.edad = edad;
        this.dni = dni;
    }
       
    /**
     * @param args the command line arguments
     * INFORMACION DE NETBEANS
     */
        
    //Métodos
    void saludar(){
        System.out.println("Hola. Mi nombre es " + nombre);
        System.out.println("Encantado de conocerte, estos son mis datos: \n**************************");
    }
    
    /* Método de prueba, lo cambio por uno con this para practicar
    void cumplirAnos() {
        edad++; //incrementamos la edad en 1
        System.out.println("Felicidadoes, ahora tienes " + edad + " años!!");
    }
    */
    
    void cumplirAnos() {
        edad=20;
        this.edad=5;
        edad= (byte) (edad + this.edad); //Corrección automática de NetBeans
        System.out.println("Felicidadoes, ahora tienes " + edad + " años!!");
    }
    
    void crecer(double incremento) {
        estatura += incremento; //la estatura aumenta cierto incremento
        System.out.println("Has crecido y ahora mides: " + estatura + "m \n**************************");
    }
    
    static void hoyEs(int dia) {
        switch (dia){
            case 1:
                hoy = "Lunes";
            break;
            
            case 2:
                hoy = "Martes";
            break;
            
            case 3:
                hoy = "Miércoles";
            break;
            
            case 4:
                hoy = "Jueves";
            break;
            
            case 5:
                hoy = "Viernes";
            break;
            
            case 6:
                hoy = "Sábado";
            break;
            
            case 7:
                hoy = "Domingo";
            break;
            
            default:
                hoy = "Muchaho que día has puesto?";
        }
    }
}
