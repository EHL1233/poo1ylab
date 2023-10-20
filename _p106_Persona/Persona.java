package _p106_Persona;

public class Persona {   // Clase persona
    // Atributos de la clase Persona
    protected String Nombre;
    protected String Direccion;

    public Persona() {} // Constructor de la clase padre 
    public Persona(String nombre, String direccion) {  // Encapsula los atributos de la clase 
        Nombre = nombre;
        Direccion = direccion;
    }
    public String getNombre() {  // Obtiene un valor 
        return Nombre; // REtorna un valor 
    }
    public void setNombre(String nombre) { // Establese el valor 
        Nombre = nombre;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    @Override
    public String toString() { // Metodo que retorna una cadena de texto
        return "Nombre=" + Nombre + ", Direccion=" + Direccion ;
    }
}
