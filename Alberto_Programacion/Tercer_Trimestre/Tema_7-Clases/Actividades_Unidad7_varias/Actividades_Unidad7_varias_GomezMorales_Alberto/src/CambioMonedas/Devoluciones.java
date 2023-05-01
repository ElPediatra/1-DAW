/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package CambioMonedas;

public class Devoluciones {
    /* Atributos */
    private double precio;
    private double entregado;
    
    /* Constructores */
    public Devoluciones (double totalCompra, double importeEntregado){
        this.precio = totalCompra;
        this.entregado = importeEntregado;
    }
    
    /* Métodos */
    public String calcularCambio() {
        /* Atributos */
        double cambio = entregado - precio;
        
        //Voy calculando la cantidad de billetes de cada tipo
        int billetes200 = (int) (cambio / 200);
        cambio = cambio % 200;
        int billetes100 = (int) (cambio / 100);
        cambio = cambio % 100;
        int billetes50 = (int) (cambio / 50);
        cambio = cambio % 50;
        int billetes20 = (int) (cambio / 20);
        cambio = cambio % 20;
        int billetes10 = (int) (cambio / 10);
        cambio = cambio % 10;
        int billetes5 = (int) (cambio / 5);
        cambio = cambio % 5;
        int monedas2 = (int) (cambio / 2);
        cambio = cambio % 2;
        int monedas1 = (int) (cambio / 1);
        cambio = cambio % 1;
        int monedas50 = (int) (cambio / 0.50);
        cambio = cambio % 0.50;
        int monedas20 = (int) (cambio / 0.20);
        cambio = cambio % 0.20;
        int monedas10 = (int) (cambio / 0.10);
        cambio = cambio % 0.10;
        int monedas5 = (int) (cambio / 0.05);
        cambio = cambio % 0.05;
        int monedas02 = (int) (cambio / 0.02);
        cambio = cambio % 0.02;
        int monedas01 = (int) (cambio / 0.01);
        cambio = cambio % 0.01;
        
        String resultado = billetes200 + " billetes de 200€.\n"
                + billetes100 + " billetes de 100€.\n"
                + billetes50 + " billetes de 50€.\n"
                + billetes20 + " billetes de 20€.\n"
                + billetes10 + " billetes de 10€.\n"
                + billetes5 + " billetes de 5€.\n"
                + monedas2 + " monedas de 2€.\n"
                + monedas1 + " monedas de 1€.\n"
                + monedas50 + " monedas de 50 centimos de €.\n"
                + monedas20 + " monedas de 20 centimos de €.\n"
                + monedas10 + " monedas de 10 centimos de €.\n"
                + monedas5 + " monedas de 5 centimos de €.\n"
                + monedas02 + " monedas de 2 centimos de €.\n"
                + monedas01 + " monedas de 1 centimo de €.\n";
        
        return resultado;
    }        
}
