public class RadioFMAlberto {
    private double frecuencia;

    public RadioFMAlberto(double frecuencia) {
        this.frecuencia=frecuencia;
        comprobarFrecuencia();
    }

    /* Métodos */
    public void up() {
        frecuencia += 0.5;
        if (frecuencia > 108) {
            frecuencia = 80;
        }
    }

    public void down() {
        frecuencia -= 0.5;
        if (frecuencia < 80) {
            frecuencia = 108;
        }
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    private void comprobarFrecuencia(){
        if (this.frecuencia < 80 || this.frecuencia > 108) {
            this.frecuencia = 80;
        }
    }
}