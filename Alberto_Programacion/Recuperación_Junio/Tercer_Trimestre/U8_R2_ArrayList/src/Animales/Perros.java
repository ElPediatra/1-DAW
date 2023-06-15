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

/* Imports */
import java.util.ArrayList;

public class Perros extends Mamiferos {
    private String razaPerros;
    private String nombre;
    public ArrayList<Perros> nombresPerros2 = new ArrayList<Perros>();
    
    /* Constructores */
    public Perros(){
        super(Sexo.Macho);
        this.razaPerros = "Labrador";
        this.nombre = "Firulais";
    }
    
    public Perros(Sexo sexo, String tipo, String tipoRaza, String nombre){
        super(sexo, tipo);
        this.razaPerros = tipoRaza;
        this.nombre = nombre;
    }
    
    /* Métodos */
    @Override
    public String toString(){
        return super.toString() + "Raza: "+ this.razaPerros+ "\n Nombre: "+ this.nombre + "\n********\n";
    }
    
    public void aullar(){
        System.out.println("Auuuuuuuuuuu...");
    }
    
    public void ladrar(){
        System.out.println("Wooof wooof");
    }
    
    public void comidaPerros(String comida){
        comida = comida.toLowerCase();
        
        if(comida!="sobras"){
            System.out.println("no quiero pienso, dame lo que te ha sobrado");
        } else {
            System.out.println("Que ricas las sobras jefe");
        }
    }
    
    public void juegaCon(Perros oponente) {
        if (this.sexo == Sexo.Macho && oponente.sexo == Sexo.Macho) {
            System.out.println("Los perros están jugando!");
        } else {
            System.out.println("No juegan, estos perros optan por dormir.");
        }
    }
    
    /* Método para crear Perros por un ArrayList */
    public static ArrayList<Perros> crearPerros() {
        ArrayList<Perros> perros = new ArrayList<>();
        perros.add(new Perros(Sexo.Macho, "de tierra", "Labrador", "Firulais"));
        perros.add(new Perros(Sexo.Hembra, "de tierra", "Bulldog", "Quiara"));
        perros.add(new Perros(Sexo.Macho, "de tierra", "Husky", "Tao"));
        return perros;
    }

    /* Método para mostrar los Perros del ArrayList */
    public static void mostrarPerros(ArrayList<Perros> perros) {
        for (Perros p : perros) {
            System.out.println(p.toString());
        }
    }

    /* Método para modificar el nombre de un Perro del ArrayList */
    public static void modificarPerro(ArrayList<Perros> perros, int indice, String nombre) {
        perros.get(indice).nombre = nombre;
    }
}