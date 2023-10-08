package _p96_Empleado03;

public class Empleado {    // Clase 
    // Las propiedades de la clase permanecen ocultas 
    private String Nombre;
    private int Edad;

    public Empleado() {};  // Constructor por defecto de la clase Empleado
    public Empleado(String nombre,int edad) {  // Inicializa los valores de la clase
        this.Nombre = nombre;
        this.Edad = edad;
    }
    public String getNombre() {  // Obtine el nombre 
        return Nombre;  // Retorna el nombre 
    }
    public void setNombre(String nombre) {  // Establese el nombre 
        Nombre = nombre;
    }
    public int getEdad() {  // Obtiene la edad 
        return Edad;  // Retorna la edad
    }
    public void setEdad(int edad) {  // Establese la edad
        Edad = edad;
    }
    public String toString() {  // Regresa una cadena de texto
        return String.format("Nombre: %s, Edad: %d",Nombre,Edad);
    }
}
