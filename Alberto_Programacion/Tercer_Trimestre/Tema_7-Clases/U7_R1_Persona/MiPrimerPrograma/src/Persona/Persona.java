/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * INFORMACION DE NETBEANS
 */
package Persona;

/**
 *
 * @author alber
 * INFORMACION DE NETBEANS
 */
public class Persona {
    String nombre = "Alberto";
    byte edad = 28;
    double estatura = 1.90;
    String dni = "54120738J";
    double incremento = 0.25;
    static String hoy = "Hoy no es jueves, hoy es viernes!";
    static int dia = 5;
    
    /* Constructores para la clase Persona */
    Persona() { //Sin acciones a realizar
        
    }
    
    Persona(String nombre, byte edad, double estatura, String dni, double incremento){ //Todos los datos
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.dni = dni;
        this.incremento = incremento;
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
    
    Persona(byte edad, String dni) {
        this.edad = edad;
        this.dni = dni;
    }
       
    /**
     * @param args the command line arguments
     * INFORMACION DE NETBEANS
     */
    
    //Objetos
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Persona 1 */
        Persona persona1 = new Persona();
            persona1.nombre = "Juan Pablo";
            persona1.edad = 19;
            persona1.estatura = 1.87;
            persona1.dni = "Y77182725";
            persona1.incremento = 0.12;
        
        /* Persona 2 */
        Persona persona2 = new Persona(); //Si no asigno new Persona(), el programa
                                          //no compilará ya que al objeto no se le
                                          //ha asignado la clase
        
        /* Persona 3 */
        Persona persona3 = new Persona(1.80,"55112288B"); //Constructor estatura y dni
            persona3.nombre = "Jose María";
        
        /* Persona 4 */
        Persona persona4 = new Persona(1.91); //Constructor incremento
            persona4.nombre = "Armando";
            persona4.estatura = 1.60;
            
        /* Persona 5*/
        Persona persona5 = new Persona("Antonio","11111111Q"); //Constructor nombre y dni
        
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
        
        /* Print datos persona 2*/
        //Muestra los datos de Persona (Objeto/Clase)
        persona2.saludar();
        System.out.println("Nombre: " + persona2.nombre);
        System.out.println("Edad: " + persona2.edad);
        System.out.println("Estatura: " + persona2.estatura + "m");
        System.out.println("DNI/NIE: " + persona2.dni + "\n**************************");
        persona2.cumplirAnos();
        persona1.crecer(persona2.incremento);
        
        System.out.println(); //Espacio en blanco
        
        /* Print datos persona 3*/
        persona3.saludar();
        System.out.println("Nombre: " + persona3.nombre);
        System.out.println("Estatura: " + persona3.estatura + "m");
        System.out.println("DNI/NIE: " + persona3.dni + "\n**************************");
        
        System.out.println(); //Espacio en blanco
        
        /* Print datos persona 4*/
        persona4.saludar();
        System.out.println("Nombre: " + persona4.nombre);
        System.out.println("Estatura: " + persona4.estatura + "m\n**************************");
        
        persona4.crecer(persona4.incremento);
        
        System.out.println(); //Espacio en blanco
        
        /* Print datos persona 5*/
        persona5.saludar();
        System.out.println("Nombre: " + persona5.nombre);
        System.out.println("DNI/NIE: " + persona5.dni + "\n**************************");
        
        System.out.println(); //Espacio en blanco
        
        /* Print del atributo estático (stactic + atributo) */
        System.out.println(Persona.hoy);
        hoyEs(Persona.dia); //Aplicamos método para cambiar el valor Persona.hoy
        System.out.println("Se ha actualizado el día a: " + Persona.hoy);
    }
    
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