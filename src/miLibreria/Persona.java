package miLibreria;

public class Persona {
    //atributos encapsulados 
    private String nombre;
    private int edad;

    //Constructor 
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters and setters 
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    //Metodo que sera sobrescrito en la subclase (polimorfismo)
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + ", Edad" + edad);
    }
    }