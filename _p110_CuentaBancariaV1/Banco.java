package _p110_CuentaBancariaV1;

import java.util.ArrayList;

public class Banco { // Clase Banco
    // Declara atributos de la clase 
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Clientes; // Este atributo es de tipo lista dinamica

    public Banco() { // Constructor de la clase 
        Clientes = new ArrayList<>();  // Se reserva el espacio en memoria para la lista dinamica llamada Clientes
    }
    public Banco(String nombre, String domicilio) {  // Constructor para los demas atributos 
        this();
        Nombre = nombre;
        Domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente) { // se obtiene un cliente de tipo cliente
        Clientes.add(cliente); // Agrega el cliente a la lista 
    }
    public ArrayList<Cliente> getClientes() {  // Obtiene la lista dinamica con los clientes 
        return Clientes; // Retorna la lista con los cliente
    }
    @Override
    public String toString() { // Metodo de la clase que retorna una cadena de texto 
        // EL comando Cliente.size() cuenta cuantos objetos se encuentran en la lista dinamica Clientes
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Clientes=" + Clientes.size() + "]";
    }
}
