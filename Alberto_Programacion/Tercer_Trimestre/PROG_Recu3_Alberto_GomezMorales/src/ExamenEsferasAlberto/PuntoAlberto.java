/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW
 * @author alber
 * 
 * Clase PuntoAlberto - Gestión de atributos/métodos de los Puntos
 * 
 * Relación de herencia (CLASE PADRE/SUPER CLASE) con EsferaAlberto - utiliza el punto definido como centro de la esfera.
 */

/* Paquetes */
package ExamenEsferasAlberto;

/* Clase */
public class PuntoAlberto {

    /* Atributos */
    protected int x;
    protected int y;
    
    /* Constructores */
    
    //Por defecto
    PuntoAlberto(){
        this.x=1;
        this.y=1;
        
        validarPunto();
    }
    
    //Genérico
    PuntoAlberto(int x, int y){
        this.x=x;
        this.y=y;
        
        validarPunto();
    }
    
    //Copia
    PuntoAlberto(PuntoAlberto punto){
        this.x=punto.x;
        this.y=punto.y;
        
        validarPunto();
    }
    
    /* Getter y Setter */
    
    //Damos valor a X
    public void setX(int x){
        this.x=x;
    }
    
    //Mostramos valor de X
    public int getX(){
        return this.x;
    }
    
    //Damos valor a Y
    public void setY(int y){
        this.y=y;
    }
    
    //Mostramos valor de Y
    public int getY(int y){
        return this.y;
    }
    
    //Validamos los datos de punto, si no cumple los requisitos, se asignarán por defecto
    protected void validarPunto(){
        
        //Si indica una cantidad menor que 0
        if(this.x<0){
            this.x=0;
            System.out.println("Valor mínimo no válido, se asigna el valor '0' a X.");
        }
        
        //Si indica una cantidad mayor que 30
        if (this.x>30) {
            this.x=30;
            System.out.println("Valor máximo superado, se asigna el valor '30' a X.");
        }
        
        //Si indica una cantidad menor que 0
        if(this.y<0){
            this.y=0;
            System.out.println("Valor mínimo no válido, se asigna el valor '0' a Y.");
        }
        
        //Si indica una cantidad mayor que 30
        if (this.y>30) {
            this.y=30;
            System.out.println("Valor máximo superado, se asigna el valor '30' a Y.");
        }
    }

    //toString de punto
    @Override
    public String toString(){
        return "Coordenadas: (" + x + "," + y + ")";
    }
}
