/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package Animales;

public class Mamiferos extends Animales {
    private String tipo;
    
    //Constructor por defecto crea un animal Macho y de Tierra
    public Mamiferos(){ //constructor por defecto
        super(Sexo.Macho);
        this.tipo="de tierra";
    }
    
    public Mamiferos(Sexo sexo, String tipoMamifero){
        super(sexo);
        this.tipo=tipoMamifero;
    }
    
    public Mamiferos(Sexo sexo){
        super(sexo);
        this.tipo="de tierra";
    }
        
    /* Métodos */
    public void nadar(){ //Averigua si es acuático o no
        if(this.tipo=="de mar"){
            System.out.println("A nadar");
        } else {
            System.out.println("Si nada se ahoga");
        }
    }
    
    public void correr(){//Averisua si correo o no corre
        if(this.tipo=="de tierra"){
            System.out.println("Corre Forest corre");
        } else {
            System.out.println("Si correo se ahoga");
        }
    }
    
    public void dormir(){
        super.dormir();
    }
    
    public void comer(String comida){
        //Recibe el tipo de comida que va a comer
        //Si es acuatico y come algas le encanta, si no, no le gusta
        
        comida.toLowerCase();
        if(this.tipo!="de mar" && comida!="algas"){
            System.out.println("ta bueno jefe, que rico");
        } else {
            if(this.tipo=="de mar" && comida=="algas"){
                System.out.println("patron, que ricas las algas");
            } else {
                System.out.println("yo no me como eso, daselo a otro");
            }
        }
    }
}