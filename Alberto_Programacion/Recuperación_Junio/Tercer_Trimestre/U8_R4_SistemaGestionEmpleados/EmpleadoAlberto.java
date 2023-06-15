public class EmpleadoAlberto {
    /* Atributos */
    protected String nombre;
    protected int edad;
    protected double salario;

    /* Constructor */
    public EmpleadoAlberto(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    /* Getters & Setters */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }
}
