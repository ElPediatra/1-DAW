/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author alber
 * 
 * //raza (defecto siames), sexo, sexo raza y tipo
 * // 5 métodos
 *  - toString(muestra los datos del gato - Puede usarlo Animales y Mamífero)
 *  - maullar(sonido meow meow)
 *  - ronronear(purrr purrr)
 *  - comida(string, si no es pescado no les gusta)
 *  - peleaCon(contrincante - solo pelean los Machos)
 */

public class Gatos extends Mamiferos {
    private String razaGatos;
    
    /* Constructores */
    public Gatos(){
        super(Sexo.Hembra);
        this.razaGatos = "siames";
    }
    
    public Gatos(Sexo sexo, String tipo, String tipoRaza){
        super(sexo, tipo);
        this.razaGatos = tipoRaza;
    }
    
    /* Métodos */
    public String toString(){
        return super.toString() + "Raza: "+ this.razaGatos+"\n********\n";
    }
    
    public void maullar(){
        System.out.println("Meow meow...");
    }
    
    public void ronronear(){
        System.out.println("Purrr purrr");
    }
    
    public void comidaGatos(String comida){
        comida.toLowerCase();
        
        if(comida!="pescado"){
            System.out.println("no quiero whiskas, deme pescado humano");
        } else {
            System.out.println("Que rico el pescadito meooooow");
        }
    }
    
    public void peleaCon(Gatos oponente) {
        if (this.sexo == Sexo.Macho && oponente.sexo == Sexo.Macho) {
            System.out.println("Los gatos se están peleando!");
        } else {
            System.out.println("No se pelean, estos gatos optan por la paz.");
        }
    }
}
