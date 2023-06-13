import java.io.*;

public class Calendario implements Serializable {
    private int dia;
    private int mes;
    private int anio;

    public Calendario(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Dia: " + this.dia + ", Mes: " + this.mes + ", Año: " + this.anio;
    }
}