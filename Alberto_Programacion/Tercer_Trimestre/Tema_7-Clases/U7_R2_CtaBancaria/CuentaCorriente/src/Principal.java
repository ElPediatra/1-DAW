/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alber
 * Alberto Gómez Morales - 1º DAW
 */

/*
 * Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el saldo. Las operaciones típicas
 * con una cuenta corriente son:
 *  - Crear una cuenta: Se necesita el DNI y nombre del titular. El saldo inicial será 0.
 *  - Sacar dinero: El método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
 *  - Ingresar dinero: se incrementa el saldo.
 *  - Mostrar información: Muestra la información disponible de la cuenta corriente.
 */

//IMPORTANTE: Hecho por Pedro, me lo ha estado explicando hoy al haber faltado el viernes a clase.

import java.util.Scanner;

class CuentaCorriente {
    String dni;
    String nombre;
    int saldo;
    
    CuentaCorriente(String dni, String nombre, int saldo){
        this.dni=dni;
        this.nombre=nombre;
        saldo=0;
    }
    
   
    void mostrarinformacion(){
        System.out.println(this.nombre);
        System.out.println(this.dni);
        System.out.println(this.saldo);
    }
    
    void meterdinero(int cantidad){
        this.saldo=this.saldo+cantidad;
    }
    void sacardinero(int cantidad){
       if(this.saldo-cantidad<=0){
           System.out.println("No puede retirar dinero porque no tiene");
       }else{
         this.saldo=this.saldo-cantidad;
       }
    }
}

public class Principal{
public static void main(String[]args){
    menu();
    }

 public static void menu(){
        CuentaCorriente c;
        c = new CuentaCorriente("11122233A","Esteban Julio Ricardo Montoya de la Rosa Ramírez",0);
        int cantidad;
    boolean salir = false;
    byte menu;
    char letra='n';
    Scanner teclado=new Scanner(System.in);
     
        do{
               System.out.println("Bienvenido al Banco TeRobamos, también conocido como O.D.L, qué desea hacer?\nOpción 1: Sacar dinero\nOpción 2: Ingresar dinero\nOpción 3: Mostrar información sobre tu cuenta\nOpción 4:Salir del banco");
        menu=teclado.nextByte();
          switch(menu){
     
            case 1:
                 System.out.println("¿Cuánto dinero quiere usted retirar?");
                 cantidad=teclado.nextInt();
                c.sacardinero(cantidad);
              
            break;
            case 2:
                 System.out.println("¿Cuánto dinero quiere usted ingresar?");
                 cantidad=teclado.nextInt();
                c.meterdinero(cantidad);
                break;
                
            case 3:
                c.mostrarinformacion();
                break;
            case 4:
                do{
                     System.out.println("¿Desea usted salir?\nPulse s para salir\nPulse n para quedarse");
               letra=teclado.next().charAt(0);
               if(letra=='s'){
               System.out.print("Tenga usted un buen día");
               salir=true;
               break;
               
               }else if(letra=='n'){
                   System.out.println("Revise las opciones: ");
                   System.out.println();
               }
               if(letra!='s' && letra!='n'){
                   System.out.println("Error, ingrese de nuevo la opción");
                   System.out.println();
               }
                }while(letra!='n');
               break;
               
            default:
                System.out.println("Opción no válida");
               
        }
        }while (!salir && letra != 's');
      
    }
}