//Alberto Gómez Morales - 1º DAW - Programación

/*
 * Crea un sistema de gestión de empleados que permita almacenar información sobre los empleados de una empresa. 
 * El sistema debe ser capaz de manejar diferentes tipos de empleados, como empleados regulares, gerentes y directores.
 * 
 * Crea una clase Empleado con los siguientes atributos:
 * 
 * Nombre: una cadena de caracteres que representa el nombre del empleado.
 * Edad: un número entero que indica la edad del empleado.
 * Salario: un número decimal que indica el salario mensual del empleado.
 * Crea una clase Gerente que herede de la clase Empleado y agregue un nuevo atributo:
 * 
 * Departamento: una cadena de caracteres que indica el departamento al que pertenece el gerente.
 * Crea una clase Director que herede de la clase Empleado y agregue dos nuevos atributos:
 * 
 * Departamento: una cadena de caracteres que indica el departamento al que pertenece el director.
 * Bonificación: un número decimal que indica la bonificación anual que recibe el director.
 * Crea una clase SistemaGestionEmpleados que contenga un ArrayList para almacenar objetos de tipo Empleado. La clase debe tener los siguientes métodos:
 * 
 * AgregarEmpleado: recibe un objeto de tipo Empleado y lo agrega al ArrayList.
 * CalcularSalarioTotal: calcula y devuelve el salario total mensual de todos los empleados en el sistema.
 * CalcularSalarioPromedio: calcula y devuelve el salario promedio mensual de todos los empleados en el sistema.
 * Implementa el sistema de gestión de empleados y realiza las siguientes acciones:
 * 
 * Crea algunos objetos de tipo Empleado, Gerente y Director, y agrégalos al sistema de gestión de empleados.
 * Muestra el salario total mensual de todos los empleados en el sistema.
 * Muestra el salario promedio mensual de todos los empleados en el sistema.
 * Recuerda utilizar clases, herencia y ArrayList para implementar el sistema de gestión de empleados de manera eficiente y estructurada.
 */

public class PrincipalAlberto{
    public static void main(String[] args) {
        SistemaGestionEmpleadosAlberto sistema = new SistemaGestionEmpleadosAlberto();

        // Crear empleados, gerentes y directores
        EmpleadoAlberto empleado1 = new EmpleadoAlberto("Empleado 1", 30, 2000);
        GerenteAlberto gerente1 = new GerenteAlberto("Gerente 1", 40, 3000, "Departamento 1");
        DirectorAlberto director1 = new DirectorAlberto("Director 1", 50, 5000, "Departamento 2", 1000);

        // Agregar empleados, gerentes y directores al sistema
        sistema.agregarEmpleado(empleado1);
        sistema.agregarEmpleado(gerente1);
        sistema.agregarEmpleado(director1);

        // Calcular y mostrar el salario total mensual
        double salarioTotal = sistema.calcularSalarioTotal();
        System.out.println("Salario total mensual: " + salarioTotal + "€.");

        // Calcular y mostrar el salario promedio mensual
        double salarioPromedio = sistema.calcularSalarioPromedio();
        System.out.println("Salario promedio mensual: " + salarioPromedio + "€.");
    }
}