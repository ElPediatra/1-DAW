/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package cofradiamurgi_alberto;

/**
 *
 * @author alberto
 */

/* Clase Penitente que hereda de Persona */
public class Penitente extends Persona {
    /* Atributos */
    protected int talla;
    protected double estatura;
    
    /* Atributo general */
    private static int contadorPenitentes = 0; //Contador para saber la cantidad total de Penitentes
    
    /* Constructores */
    
    public Penitente(){ //Constructor por defecto
        super();
        this.talla=38;
        
        contadorPenitentes++;
    }
    
    public Penitente(String nombre, double estatura, int talla){ //Constructor general
        super(nombre, estatura);
        this.talla = talla;
        
        contadorPenitentes++;
    }
    
    public Penitente(Penitente penitente){ //Constructor copia
        super(penitente);
        this.talla = penitente.talla;
        
        contadorPenitentes++;
    }
    
    /* Getter y Setter */
    public void setTalla(int talla){
        this.talla=talla;
    }
    
    public int getTalla(){
        return this.talla;
    }
    
    /* Métodos */
    public static void penitentesTotales(){
        System.out.println("En total hay " + contadorPenitentes + " costaleros.");
    }
    
    public static void penitenteEliminado(){ //Método para eliminar 1 contador en el caso de quitar un penitente
        contadorPenitentes--;
    }
    @Override
    public String toString(){
        return super.toString() + "\nTalla: " + this.talla;
    }
}
