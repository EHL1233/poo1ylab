package _p103_ClienteFactura;

public class Cliente {  // Clase Cliente
    // Declara los atributos para la clase cliente
    private int Id;
    private String Nombre;
    private int Descuento;

    public Cliente(){} // Constructor para la clase 
    public Cliente(int id, String nombre, int descuento) { // Inicializa los atributos 
        Id = id;
        Nombre = nombre;
        Descuento = descuento;
    }
    public int getId() { // Obtiene el id del cliente 
        return Id;  // Retorna el id del cliente
    }
    public String getNombre() { // Obtiene el nombre del cliente 
        return Nombre; // Retorna el nombre del cliente 
    }
    public int getDescuento() { // Obtiene el descuento del cliente 
        return Descuento;  // Retorna el descuneto 
    }
    public void setDescuento(int descuento) { // Establese el decuento 
        Descuento = descuento;
    }
    @Override
    public String toString() {  // Metodo que retorna una cadena de texto 
        return "Cliente [Id=" + Id + ", Nombre=" + Nombre + ", Descuento=" + Descuento + "]";
    }
}
