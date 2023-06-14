/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package cofradiamurgi_alberto;

/**
 *
 * @author alberto
 */

/* Import */
import java.util.Scanner;
import java.util.ArrayList;

public class CofradiaMurgi_Alberto {
    /* Teclado para las gestiones de la apliación */
    static Scanner teclado = new Scanner(System.in);
    
    /* ArrayLists para almacenar los objetos */
    static ArrayList<Costalero> costaleros = new ArrayList<>();
    static ArrayList<Penitente> penitentes = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    
    /* Métodos */
    public static void menu(){
        /* Variables */
        boolean salida = false;
        int opcion;
        char letra;
        
        do{
            System.out.println("Menú de la Cofradia Murgi:");
            System.out.println("1.Dar de alta un penitente.");
            System.out.println("2.Dar de alta un costalero.");
            System.out.println("3.Elimiar un penitente.");
            System.out.println("4.Eliminar un costalero.");
            System.out.println("5.Mostrar los penitentes.");
            System.out.println("6.Mostrar los costaleros");
            System.out.println("7.Mostrar toda la cofradía");
            System.out.println("0.Salir");
            System.out.println("Selecciona una opción");
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:
                    altaPenitente();
                    break;
                    
                case 2:
                    altaCostalero();
                    break;
                    
                case 3:
                    eliminarPenitente();
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    mostrarArrayPenitentes();
                    break;
                    
                case 6:
                    mostrarArrayCostaleros();
                    break;
                    
                case 7:
                    mostrarArrayCostaleros();
                    mostrarArrayPenitentes();
                    break;

                case 0:
                    System.out.println("¿Seguro que quieres salir? (s/n)");
                    letra = teclado.next().charAt(0);
                    
                    if(letra == 's' || letra == 'S'){
                        salida = true;
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(!salida);
    }
    
    public static void altaPenitente(){
        /* Variables */
        String nombre;
        double estatura;
        int talla;
        
        System.out.println("Indica el nombre del penitente: ");
        nombre = teclado.nextLine();
        System.out.println("Indica su estatura: ");
        estatura = teclado.nextDouble();
        System.out.println("Indica la talla del penitente: ");
        talla = teclado.nextInt();
        
        Penitente penitente = new Penitente(nombre, estatura, talla);
        penitentes.add(penitente);
    }
    
    public static void altaCostalero(){
        /* Variables */
        String nombre;
        double estatura;
        String posicion;
        double peso;
        
        System.out.println("Indica el nombre del costalero: ");
        nombre = teclado.nextLine();
        System.out.println("Indica su estatura: ");
        estatura = teclado.nextDouble();
        System.out.println("Indica su posición para ver si está disponible, de no se así pasará a ser un costalero corriente: ");
        posicion = teclado.nextLine();
        System.out.println("Indica su peso: ");
        peso = teclado.nextDouble();
        
        posicion = posicion.toLowerCase();
        
        Costalero costalero = new Costalero(nombre, estatura, posicion, peso);
        
        costaleros.add(costalero);
    }
    
    public static void mostrarArrayCostaleros(){
        int contador = 0;
        
        if(costaleros.isEmpty()){
            System.out.println("No hay costaleros dados de alta");
        } else {
            Costalero.costalerosTotales();
            for(Costalero costalero : costaleros){
                System.out.println(contador + ". Costalero:\n" + costalero);
                contador++;
            }
        }
    }
    
    public static void mostrarArrayPenitentes(){
        int contador = 0;
        
        if(penitentes.isEmpty()){
            System.out.println("No hay costaleros dados de alta");
        } else {
            Penitente.penitentesTotales();
            for(Penitente penitente : penitentes){
                System.out.println(contador + ". Costalero:\n" + penitente);
                contador++;
            }
        }
    }
    
    public static void eliminarPenitente(){
        int opcionEliminar;
        mostrarArrayPenitentes();
        System.out.println("Selecciona el Penitente que deseas eliminar: ");
        opcionEliminar = teclado.nextInt();
        
        penitentes.remove(opcionEliminar);
        Penitente.penitenteEliminado();
        System.out.println("Penitente eliminado");
    }
    
    public void eliminarCostalero(){
        int opcionEliminar2;
        mostrarArrayCostaleros();
        System.out.println("Selecciona el Costalero que desea eliminar");
        opcionEliminar2 = teclado.nextInt();
        
        costaleros.get(opcionEliminar2).costaleroEliminado();
        costaleros.remove(opcionEliminar2);
        System.out.println("Costalero eliminado");
    }
}
