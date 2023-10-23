package _p112_ControlVentas;

import java.util.ArrayList;

public class Cliente {    // Clase cliente
    // Atributos de la clase 
    private String Nombre;
    private String Domicilio;
    private String Correo;
    private ArrayList<Venta> Ventas;

    public Cliente(){  // Constructor de la clase 
        Ventas = new ArrayList<>();
    }

    public Cliente(String nombre, String domicilio, String correo) { // Constrictor de la clase 
        this(); // Inicializa variables 
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
    }

    // Metodos gets y sets para cada atributo 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
    public ArrayList<Venta> getVentas() {  // Obtiene la lista de las ventas
        return Ventas;  // REtorna la lista de las ventas
    }
    public void agregarVentas(Venta ventas) {  // Metodo para agregar un venta
        Ventas.add(ventas);  // Agrega una venta a la lista
    }

    public double getTotal(){   // Obtine el total de ventas de cada cliente
        double total=0.0;
        for(Venta ventas: Ventas){
            total += ventas.getTotalVenta();
        }
        return total; // Retorna el total
    }

    public String toString(){ // Metodo que retorna una cadena de texto
        return ">> Cliente [ Nombre= "+Nombre+", Domicilio= "+Domicilio+", Correo= "+Correo+", Ventas= "+Ventas.size()+", Total="+this.getTotal()+" ]";
    }
}
