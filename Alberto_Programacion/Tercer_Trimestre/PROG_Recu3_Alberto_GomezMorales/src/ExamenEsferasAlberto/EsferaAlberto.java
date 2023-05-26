/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW
 * @author alber
 * 
 * Clase EsferaAlberto - Todo lo relacionado con la creación/gestión de esfera
 * 
 * Relación de herencia (CLASE HIJA) con PuntoAlberto - utilizo el punto definido como centro de mi esfera y añado el radio.
 */

/* Paquetes */
package ExamenEsferasAlberto;

/* Imports */
import java.lang.Math;
//Math.sqrt(); Lo pongo aquí para no olvidarme

/* Clase */
public class EsferaAlberto extends PuntoAlberto{
    
    /* Atributos */
    private double radio;
    
    /* Atributo General */
    public static int contadorEsferas=0;
    
    /* Constructores */
    //Por defecto
    EsferaAlberto(){
        super();
        this.radio=10;
        
        contadorEsferas++;
        validarPunto();
        validarRadio();
    }
    
    //General
    EsferaAlberto(int x, int y, double radio){
        super(x,y);
        this.radio=radio;
        
        contadorEsferas++;
        validarPunto();
        validarRadio();
    }
    
    //Copia
    EsferaAlberto(EsferaAlberto esfera){
        super(esfera);
        this.radio=esfera.radio;
        
        contadorEsferas++;
        validarPunto();
        validarRadio();
    }
    
    /* Getters y Setters */
    //Damos valor a radio
    public void setRadio(double radio){
        this.radio=radio;
    }
    
    //Mostramos el valor de radio
    public double getRadio(){
        return radio;
    }
    
    /* Métodos */
    //validar radio
    private void validarRadio(){
        if(this.radio<0){
            this.radio=0;
            System.out.println("Valor mínimo no válido, se asigna el valor '0' al radio.");
        }
        
        if(this.radio>12){
            this.radio=12;
            System.out.println("Valor máximo superado, se asigna el valor '12' al radio");
        }
    }
    
    //Calcular Area
    public double area(double r){
        /* Variables */
        double area;
        double numPi = 3.1416;
        
        area = 4 * numPi * (r*r);
        
        return area;
    }
    
    //Calcular perímetro
    public double perimetro(double r){
        /* Variables */
        double perimetro;
        double numPi = 3.1416;
        
        perimetro = 2 * numPi * r;
        
        return perimetro;
    }
    
    //Comprobar si 2 esferas se cruzan
    public void compararEsferas(EsferaAlberto esfera){
        double d; //Diametro de la esfera
        
        //Uso el import Math para calcular la raíz cuadrada de la operación
        d = Math.sqrt(((this.x-esfera.x)*(this.x-esfera.x))+((this.y-esfera.y)*(this.y-esfera.y)));
        
        //Diferentes comparaciones con diferente resultado
        if(d==this.radio+esfera.radio){
            System.out.println("Las esferas se cortan en un punto.");
        }
        
        if(d<this.radio+esfera.radio){
            System.out.println("Las esferas se cortan en 2 puntos.");
        }
        
        if(d>this.radio+esfera.radio){
            System.out.println("Las esferas no se cortan en ningún punto.");
        }
    }
    
    //Indica el total de esferas creadas
    public static void totalEsferas(){
        System.out.println("El total de esferas es: " + contadorEsferas);
    }
    
    //toString de esfera
    @Override
    public String toString(){
        return super.toString() + "\nRadio: " + this.radio + ".";
    }
}
