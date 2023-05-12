/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package Alberto;

public class CalendarioAlberto {
    /* Colores */
    static final String rojo = "\033[31m"; //Texto color rojo
    static final String verde = "\033[32m"; //Texto color verde
    static final String reset = "\033[0m";  //Texto color por defecto
    
    /* Atributos */
    protected int dia;
    protected int mes;
    protected int anio;
    
    /* Constructores */
    
    CalendarioAlberto(){
        this.dia=1;
        this.mes=1;
        this.anio=2000;
    }
    
    CalendarioAlberto(int dia, int mes, int anio){ //Para pedir las fechas a los usuarios
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
        
        //31 Dias = Meses 1, 3, 5, 7, 8, 10, 12
        //30 Dias = Meses 4, 6, 9, 11
        //28 Dias = Mes 2
        
        //Dia > 28/30/31 --> Dia=1 y Mes++
        //Mes > 12 --> Mes = 1 y Anio++
    
    /* Getters y Setter */
    
    /* Métodos*/

    //Se aumenta el día actual
    public int incrementarDia(){
        this.dia = dia + 1;
        
        comprobarFecha();
        
        return dia;
    }
        
    //Se aumenta el mes actual
    public int incrementarMes(){
        this.mes = mes + 1;
        
        comprobarFecha();
        
        return mes;
    }
    
    //Se aumenta el año en la cantidad indicada
    public int incrementarAnio(int n){
        this.anio = anio + n;
        return anio;
    }
    
    //Método para comprobar las fechas tras modificarlas
    private void comprobarFecha(){
        
        //Comparación meses con 31 días
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if (this.dia > 31) {
                this.dia = 1;
                this.mes = mes + 1;
            }        
            if (this.mes > 12) {
                this.mes = 1;
                this.anio = anio + 1;
            }
        }
        
        //Comparación meses con 30 días
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
           if (this.dia > 30) {
                this.dia = 1;
                this.mes = mes + 1;
            }        
            if (this.mes > 12) {
                this.mes = 1;
                this.anio = anio + 1;
            } 
        }
        
        //Comparación meses con 28 días (febrero)
        if (mes == 2){
            
            /* Año bisiesto */
            if (anio%4==0) {
                if (this.dia > 29) {
                    this.dia = 1;
                    this.mes = mes + 1;
                }
            }
            
            /* Año no bisiesto*/
            if (this.dia > 28) {
               this.dia = 1;
                this.mes = mes + 1;
            }        
            if (this.mes > 12) {
                this.mes = 1;
                this.anio = anio + 1;
            }
        }
        
        //Comprobación de año
        if (this.mes > 12) {
            this.mes = 1;
            this.anio = anio + 1;
        }
    }

    //Comparo las fechas
    public void iguales(CalendarioAlberto otraFecha){
        if (this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.anio == otraFecha.anio){
            System.out.println("\tLas fechas son " + verde + "iguales" + reset);
        } else {
            System.out.println("\tLas fechas " + rojo + "no" + reset + " son " + rojo + "iguales" + reset);
        }
    }            
    
    //Método para mostrar los objetos CalendarioAlberto
    @Override
    public String toString(){
        return dia + verde + "/" + reset + mes + verde + "/" + reset + anio;
    }
}
