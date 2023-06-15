public class RectanguloAlberto {
    PuntoAlberto punto1;
    PuntoAlberto punto2;

    public RectanguloAlberto(PuntoAlberto punto1, PuntoAlberto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public int calcularArea() {
        int base = Math.abs(punto2.x - punto1.x);
        int altura = Math.abs(punto2.y - punto1.y);
        int area = base * altura;
        return area;
    }

    public String toString(){
        return "Punto 1: " + this.punto1 + "Punto 2: " + this.punto2;
    }
}
