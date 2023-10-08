package _p95_Empleado02;

public class Empleado {    // Clase 
    private String Nombre; // Propiedades de la clase
    private int Edad;

    public int getEdad() {  // Metodo para obtener la edad 
        return Edad;        // Retorna la edad
    }
    public void setEdad(int edad) {  // Define la edad 
        Edad = edad;
    }
    public String getNombre() { // Metodo para obtener el nombre del cliente
        return Nombre;   // Retorna el nombre
    }
    public void setNombre(String nombre) {  // Define el nombre 
        Nombre = nombre;
    }
    public String toString() {  // Metodo para regresar una cadena de texto
        return String.format("Nombre: %s, Edad: %d",Nombre,Edad);
    }
}