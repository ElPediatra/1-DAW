/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package cofradiamurgi_alberto;

/**
 *
 * @author alberto
 */

/*
 * Puede haber:
 *  1 capataz
 *  1 segundoCapataz
 *  2 contraguias
 *  4 pateros
 *  4 fiadores
 *  4 costeros
 *  Infinitos costaleros
 */

/* Clase Costalero que hereda de Persona */
public class Costalero extends Persona {
    /* Atributos */
    protected String posicion;
    protected double peso;
    
    /* Atributos Generales */
    private static int contadorCostaleros=0;
    
    private int contadorCapataz=0;
    private int contadorSegundoCapataz=0;
    private int contadorContraguia=0;
    private int contadorPateros=0;
    private int contadorFiadores=0;
    private int contadorCosteros=0;
    
    Costalero(){ //Constructor por defecto
        super();
        this.posicion = "Costalero corriente";
        this.peso = 80.5;
        
        validarPosicion();
        contadorCostaleros++;
    }
    
    Costalero(String nombre, double estatura, String posicion, double peso){ //Constructor general
        super(nombre, estatura);
        this.posicion = posicion;
        this.peso = peso;
        
        validarPosicion();
        contadorCostaleros++;
    }
    
    Costalero(Costalero costalero){ //Constructor copia
        super(costalero);
        this.posicion = costalero.posicion;
        this.peso = costalero.peso;
        
        validarPosicion();
        contadorCostaleros++;
    }
    
    /* Métodos */
    private void validarPosicion(){
        switch(this.posicion){
            case "capataz":
                    if(contadorCapataz == 1){
                        System.out.println("Ya tenemos un Capataz, se le asigna posición de costalero.");
                        this.posicion="costalero";
                    } else {
                        System.out.println("Capataz validado y registrado.");
                        contadorCapataz++;
                    }
                break;
                
            case "segundoCapataz":
                    if(contadorSegundoCapataz == 1){
                        System.out.println("Ya tenemos un segundo capataz, se le asigna posición de costalero.");
                        this.posicion="costalero";
                    } else {
                        System.out.println("Segundo Capataz validado y registrado.");
                        contadorSegundoCapataz++;
                    }
                break;
            
            case "contraguia":
                    if(contadorContraguia == 2){
                        System.out.println("Ya tenemos contraguías suficientes, se le asigna posición de costalero.");
                        this.posicion="costalero";
                    } else {
                        System.out.println("Contraguía validado y registrado.");
                        contadorContraguia++;
                    }
                break;
                
            case "patero":
                    if(contadorPateros == 4){
                        System.out.println("Ya tenemos pateros suficientes, se le asigna posición de costalero.");
                        this.posicion="costalero";
                    } else {
                        System.out.println("Patero validado y registrado.");
                        contadorPateros++;
                    }
                break;
            
            case "fiador":
                    if(contadorFiadores == 4){
                        System.out.println("Ya tenemos fiadores suficientes, se le asigna posición de costalero.");
                        this.posicion="costalero";
                    } else {
                        System.out.println("Fiador validado y registrado.");
                        contadorFiadores++;
                    }
                break;
            
            case "costero":
                    if(contadorCosteros == 4){
                        System.out.println("Ya tenemos costeros suficientes, se le asigna posición de costalero.");
                        this.posicion="costalero";
                    } else {
                        System.out.println("Costero validado y registrado.");
                        contadorCosteros++;
                    }
                break;
            
            default:
                System.out.println("Costalero validado y registrado.");
        }
    }
    
    public static void costalerosTotales(){
        System.out.println("En total hay " + contadorCostaleros + " costaleros.");
    }
    
    public void costaleroEliminado(){ //Método para eliminar 1 contador en el caso de quitar un penitente
        switch(this.posicion){
            case "capataz":
                        contadorCapataz++;
                        contadorCostaleros--;
                break;
                
            case "segundoCapataz":
                        contadorSegundoCapataz++;
                        contadorCostaleros--;
                break;
            
            case "contraguia":
                        contadorContraguia++;
                        contadorCostaleros--;
                break;
                
            case "patero":
                        contadorPateros++;
                        contadorCostaleros--;
                break;
            
            case "fiador":
                        contadorFiadores++;
                        contadorCostaleros--;
                break;
            
            case "costero":
                        contadorCosteros--;
                        contadorCostaleros--;
                break;
            
            default:
                contadorCostaleros--;
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nPosición: " + this.posicion + "\nPeso: " + this.peso;
    }
}
