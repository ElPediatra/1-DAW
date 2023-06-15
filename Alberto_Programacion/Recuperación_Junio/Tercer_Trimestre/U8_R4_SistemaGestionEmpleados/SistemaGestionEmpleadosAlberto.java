/* Imports */
import java.util.ArrayList;

public class SistemaGestionEmpleadosAlberto {
    /* Atributos */
    private ArrayList<EmpleadoAlberto> empleados;

    /* Constructor */
    public SistemaGestionEmpleadosAlberto() {
        empleados = new ArrayList<>();
    }

    /* Métodos */
    public void agregarEmpleado(EmpleadoAlberto empleado) {
        empleados.add(empleado);
    }

    public double calcularSalarioTotal() {
        double salarioTotal = 0;
        for (EmpleadoAlberto empleado : empleados) {
            salarioTotal += empleado.getSalario();
        }
        return salarioTotal;
    }

    public double calcularSalarioPromedio() {
        if (empleados.isEmpty()) {
            return 0;
        } else {
            double salarioTotal = calcularSalarioTotal();
            return salarioTotal / empleados.size();
        }
    }
}
