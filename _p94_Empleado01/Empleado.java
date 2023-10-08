package _p94_Empleado01;

public class Empleado {    // Clase
    // Propiedades de esta clase
    public String Nombre;
    public int Edad;
    // Metodo de la clase que solo regresa una cadena de texto
    public String toString() {
    return String.format("Nombre: %s, Edad: %d",Nombre,Edad);
    }
}
