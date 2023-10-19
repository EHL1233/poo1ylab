package _p101_TrabajoPersona;

public class Persona {  // Clase persona 
    // Declrara los atributos de la clase persona 
    private String Nombre;
    private Trabajo Trabajo;

    public Persona() {}  // Constructor de la clase 
    public Persona(String nombre, Trabajo trabajo) {  // Inicializa los atributos
        Nombre = nombre;
        Trabajo = trabajo;
    }
    public String getNombre() { // Obtener el nombre 
        return Nombre; // Retornar el nombre 
    }
    public void setNombre(String nombre) {  // Establece el nombre 
        Nombre = nombre;
    }
    public Trabajo getTrabajo() {  // Obtener el tipo de trabajo
        return Trabajo;  // Retonar el tipo de trabajo
    }
    public void setTrabajo(Trabajo trabajo) { // Establecer el trabajo
        Trabajo = trabajo;
    }
    @Override
    public String toString() {  // Metodo de la clase que retorna una cadena de texto
        return "Persona [Nombre=" + Nombre + ", Trabajo=" + Trabajo + "]";
    }
}
