/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author alber
 */
public class Perros extends Mamiferos {
    private String razaPerros;
    
    /* Constructores */
    public Perros(){
        super(Sexo.Macho);
        this.razaPerros = "Labrador";
    }
    
    public Perros(Sexo sexo, String tipo, String tipoRaza){
        super(sexo, tipo);
        this.razaPerros = tipoRaza;
    }
    
    /* Métodos */
    public String toString(){
        return super.toString() + "Raza: "+ this.razaPerros+"\n********\n";
    }
    
    public void aullar(){
        System.out.println("Auuuuuuuuuuu...");
    }
    
    public void ladrar(){
        System.out.println("Wooof wooof");
    }
    
    public void comidaPerros(String comida){
        comida.toLowerCase();
        
        if(comida!="sobras"){
            System.out.println("no quiero pienso, dame lo que te ha sobrado");
        } else {
            System.out.println("Que ricas las sobras jefe");
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
