/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package CalendarioAlberto;

public class Calendario {
    private int año;
    private int mes;
    private int dia;

    public Calendario(int año, int mes, int dia) {
        if (fechaEsCorrecta(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("La fecha escrita no es correcta.");
        }
    }

    public void incrementarDia() {
        int ultimoDiaDelMes = obtenerDiaMes(this.año, this.mes);
        if (this.dia < ultimoDiaDelMes) {
            this.dia++;
        } else {
            this.dia = 1;
            incrementarMes();
        }
    }

    public void incrementarMes() {
        if (this.mes < 12) {
            this.mes++;
        } else {
            this.mes = 1;
            incrementarAño(1);
        }
    }

    public void incrementarAño(int cantidad) {
        this.año += cantidad;
    }

    public void mostrar() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.año);
    }

    public boolean iguales(Calendario otraFecha) {
        return this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }

    private boolean fechaEsCorrecta(int año, int mes, int dia) {
        if (año < 0) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > obtenerDiaMes(año, mes)) {
            return false;
        }
        return true;
    }

    private int obtenerDiaMes(int año, int mes) {
        switch (mes) {
            case 2:
                if (año % 4 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}