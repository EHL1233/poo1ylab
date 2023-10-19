package _p102_AutorLibro;

public class Autor {    // Clase autor 
    // Declara los atributos de la clase autor 
    private String Nombre;
    private String Correo;

    public Autor(){}  // Constructor de la clase 
    public Autor(String nombre, String correo) {  // Inicializa los atributoss 
        Nombre = nombre;
        Correo = correo;
    }
    public String getNombre() {  // Obtener el nombre
        return Nombre;  // Retornar el nombre 
    }
    public void setNombre(String nombre) {  // Establece el nombre 
        Nombre = nombre;
    }
    public String getCorreo() {  // Obtener el correo 
        return Correo;   // Retorna el correo 
    }
    public void setCorreo(String correo) { // Estables el correo 
        Correo = correo;
    }
    @Override
    public String toString() {  // Metodo de la clse que retorna una cadena de texto 
        return "Autor [Nombre=" + Nombre + ", Correo=" + Correo + "]";
    }
}
