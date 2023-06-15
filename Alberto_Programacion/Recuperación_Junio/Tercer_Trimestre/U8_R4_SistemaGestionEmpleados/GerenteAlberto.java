public class GerenteAlberto extends EmpleadoAlberto {
    /* Atributos */
    protected String departamento;

    /* Constructor */
    public GerenteAlberto(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    /* Getter */
    public String getDepartamento() {
        return departamento;
    }
}