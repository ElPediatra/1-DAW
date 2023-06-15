public class PrincipalAlberto {
    public static void main(String[] args) {
        MarcaPaginaAlberto marcaPagina = new MarcaPaginaAlberto();

        marcaPagina.incrementarPagina();
        System.out.println("Última página leída: " + marcaPagina.getUltimaPaginaLeida());

        marcaPagina.incrementarPagina();
        marcaPagina.incrementarPagina();
        System.out.println("Última página leída: " + marcaPagina.getUltimaPaginaLeida());

        marcaPagina.reiniciarLectura();
        System.out.println("Última página leída después de reiniciar: " + marcaPagina.getUltimaPaginaLeida());
    }
}