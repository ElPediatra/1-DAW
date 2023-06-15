public class DirectorAlberto extends EmpleadoAlberto {
    /* Atributos */
    protected String departamento;
    protected double bonificacion;

    /* Constructor */
    public DirectorAlberto(String nombre, int edad, double salario, String departamento, double bonificacion) {
        super(nombre, edad, salario);
        this.departamento = departamento;
        this.bonificacion = bonificacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getBonificacion() {
        return bonificacion;
    }
}