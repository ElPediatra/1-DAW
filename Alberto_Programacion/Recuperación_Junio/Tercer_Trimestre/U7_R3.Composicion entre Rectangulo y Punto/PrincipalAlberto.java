public class PrincipalAlberto{
    public static void main(String[] args) {
        PuntoAlberto punto1 = new PuntoAlberto(1, 3);
        PuntoAlberto punto2 = new PuntoAlberto(5, 7);

        RectanguloAlberto rectangulo = new RectanguloAlberto(punto1, punto2);
        int area = rectangulo.calcularArea();

        System.out.println("El área del rectángulo es: " + area);
    }
}