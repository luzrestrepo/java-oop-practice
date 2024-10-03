import miLibreria.Empleado;
import miLibreria.Empresa;

public class Main {
    public static void main(String[] args) {
        // Crear la empresa
        Empresa miEmpresa = new Empresa();
        
        // Crear empleados
        Empleado empleado1 = new Empleado("Juan Perez", 30, 35000, "Desarrollador");
        Empleado empleado2 = new Empleado("Ana Gomez", 28, 42000, "Gerente");
        
        // Agregar empleados a la empresa
        miEmpresa.agregarEmpleado(empleado1);
        miEmpresa.agregarEmpleado(empleado2);
        
        // Mostrar información de empleados
        miEmpresa.mostrarEmpleados();
        
        // Mostrar número total de empleados
        System.out.println("Total de empleados: " + miEmpresa.numeroEmpleados());
    }
}


    
