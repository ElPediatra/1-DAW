public class PuntoAlberto {
    /* Variables */
    protected int x;
    protected int y;

    /* Constructores */
    public PuntoAlberto() {
        this.x = 1;
        this.y = 1;
    }

    public PuntoAlberto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PuntoAlberto(PuntoAlberto punto) {
        this.x = punto.x;
        this.y = punto.y;
    }

    /* Setter y Getter */
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    /* Métodos */
    public String toStrinng(){
        return "Coordenada X: " + this.x + "\nCoordenada Y: " + this.y;
    }
}