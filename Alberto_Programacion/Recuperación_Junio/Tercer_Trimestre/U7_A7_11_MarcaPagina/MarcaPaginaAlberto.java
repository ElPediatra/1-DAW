public class MarcaPaginaAlberto {
    private int paginaActual;
    private int ultimaPaginaLeida;

    public MarcaPaginaAlberto() {
        paginaActual = 1;
        ultimaPaginaLeida = 0;
    }

    public void incrementarPagina() {
        ultimaPaginaLeida = paginaActual;
        paginaActual++;
    }

    public int getUltimaPaginaLeida() {
        return ultimaPaginaLeida;
    }

    public void reiniciarLectura() {
        paginaActual = 1;
        ultimaPaginaLeida = 0;
    }
}
