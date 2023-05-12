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

public class CalendarioExactoAlberto extends CalendarioAlberto {
    /* Colores */
    static final String rojo = "\033[31m"; //Texto color rojo
    static final String verde = "\033[32m"; //Texto color verde
    static final String reset = "\033[0m";  //Texto color por defecto
    
    /* Atributos */
    private int hora;
    private int minutos;
    
    /* Constructores */
    
    CalendarioExactoAlberto(){
        this.hora = 00;
        this.minutos = 00;
    }
    
    CalendarioExactoAlberto(int dia, int mes, int anio, int hora, int minutos){
        super(dia, mes, anio);
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
        this.minutos = minutos;
    }
    
    /* Métodos */
    //Se aumenta el día actual
    @Override
    public int incrementarDia(){
        this.dia = dia + 1;
        
        comprobarFecha();
        
        return dia;
    }
        
    //Se aumenta el mes actual
    @Override
    public int incrementarMes(){
        this.mes = mes + 1;
        
        comprobarFecha();
        
        return mes;
    }
    
    //Se aumenta el año en la cantidad indicada
    @Override
    public int incrementarAnio(int n){
        this.anio = anio + n;
        return anio;
    }
    
    //Se aumentan los minutos
    public int incrementarMinutos(int n){
        this.minutos = minutos + n;
        
        comprobarHora();
        
        return minutos;
    }
    
    //Se aumentan las horas
    public int incrementarHora(int n){
        this.hora = hora + n;
        
        comprobarHora();
        
        return hora;
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
    
    private void comprobarHora(){
        if (this.minutos > 59){
            this.minutos = 00;
            this.hora = hora + 1;
        }
        
        if (this.hora > 23) {
            this.hora = 00;
        }
    }
   
    //Método para mostrar los objetos CalendarioExactoAlberto
    @Override
    public String toString(){
        return verde + "Fecha: " + reset + dia + rojo + "/" + reset + mes + rojo + "/" + reset + anio + verde + "\n Hora: " + reset + hora + rojo + ":" + reset + minutos;
    }
    
}
