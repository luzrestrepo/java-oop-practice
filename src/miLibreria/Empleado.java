package miLibreria;

public class Empleado extends Persona {
    // Atributos adicionales
    private double salario;
    private String puesto;

    // Constructor que llama al constructor de la superclase
    public Empleado(String nombre, int edad, double salario, String puesto) {
        super(nombre, edad);
        this.salario = salario;
        this.puesto = puesto;
    }

    // Getters y setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // Sobreescritura del método (polimorfismo)
    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre() + ", Edad: " + getEdad() + 
                           ", Puesto: " + puesto + ", Salario: " + salario);
    }
}