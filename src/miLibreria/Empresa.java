package miLibreria;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    // Lista de empleados
    private List<Empleado> empleados;

    // Constructor
    public Empresa() {
        empleados = new ArrayList<>();
    }

    // Método para agregar un empleado a la lista
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para mostrar la información de todos los empleados
    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
        }
    }

    // Método para obtener el número total de empleados
    public int numeroEmpleados() {
        return empleados.size();
    }
}