package _p111_CuentaBancariaV2;

import java.util.ArrayList;

public class Cliente {    // Clase Cliente
    // DEclara los atributos de la clase  
    private String Nombre;
    private ArrayList<CuentaBancaria> Cuentas;  // Es de tipo lista dinamica

    public Cliente() {  // Constructor de la clase 
        Cuentas = new ArrayList<>();  // Reserva espacio en memoria para lista 
    }
    public Cliente(String nombre) {  // Cosntructor de la clase 
        this();  // Inicializa los atributos 
        Nombre = nombre;
    }
    public String getNombre() {  // Obtiene el mobre del clienete 
        return Nombre;  // Retorna el nombre 
    }
    public void setNombre(String nombre) {  // Establese el nombre 
        Nombre = nombre;
    }
    public ArrayList<CuentaBancaria> getCuentas() {   // Obtiene la lista de objetos 
        return Cuentas; //  REtorna la lista 

    }
    public void agregarCuenta(CuentaBancaria cuenta) {  // Metodo para añadir cuantas 
        Cuentas.add(cuenta);  // Añade un objeto ala lista
    }
    public double getTotal() {  // Metodo para obtener la cantidad de money de todos los clientes
        double total = 0;  // Declara y inicializa una variable 
        for (CuentaBancaria cuenta : Cuentas)  // Ciclo for-each para pasar por cada objeto de la lista
            total += cuenta.getSaldo();  // REaliza la suma llamando al metodo del objeto

        return total;  // REtorna el valor 
    }
    @Override
    public String toString() {  // Metodo de la clase que retorna una cadena de texto 
        // Se utiliza this.getTotal() para hacer referencia al metodo de esta clase
        return "Cliente [ Nombre = " + Nombre + ", Cuentas = " + Cuentas.size() + ", Total = " + this.getTotal() + " ]";
    }
}
