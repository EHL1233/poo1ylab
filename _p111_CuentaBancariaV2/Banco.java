package _p111_CuentaBancariaV2;

import java.util.ArrayList;

public class Banco {     // Clase Banco
    // DEclara los atributos de la clase 
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;  // Atributo de tipo lista dinamica

    public Banco() {  // Constructor de la clase 
        Clientes = new ArrayList<>();  // Reserva el espacio en memora para lista
    }
    public Banco(String nombre, String domicilio) { // Constructor de la clase 
        this(); // Inicializa los atributos 
        Nombre = nombre;
        Domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente) {  // Metodo para agregar un cliente en la lista
        Clientes.add(cliente);  // Agrega un cliente a la lista
    }
    public ArrayList<Cliente> getClientes() {  // Obtiene la lista de clientes 
        return Clientes;  // REtorna la lista de los clientes 
    }
    public double getTotal() {  // Metodo para obetener el total de clientes 
        double total = 0;  // DEclara y inicializa una variable de esta funcion
        for (Cliente cliente : Clientes) { // Ciclo for-each para recorrer los objetos de la lista 
            total += cliente.getTotal();  // Se obtiene el total de los clientes 
        }
        return total;  // Retorna el valor 
    }
    public void reporte() {  // Metodo para saber datos del los clientes 
        for (Cliente cliente : Clientes) {   // Ciclo for-each para pasar por los objetos de la clase 
            System.out.println("> " + cliente);   // Imprime lo que retorna el objeto
        for (CuentaBancaria cuenta : cliente.getCuentas())  // Ciclo for-each para pasar por las cunetas de cada cliente
            System.out.println(cuenta);  // Imprime lo que retorna el objeto
            if(cliente.getCuentas().size()!=0) System.out.println();  // Condicion if de corto circuito para verificar que el numero de cunatas del usuario exite
        }
    }
    public void calcularInteres() {   // Metodo para calcular los intereces para del cliente
        for (Cliente cliente : Clientes) {  // Ciclo for-each para pasar por los objetos de la lista Clientes
            for (CuentaBancaria cuenta : cliente.getCuentas()) // Ciclo for-each para pasar por las cuentas de los clienes
                if(cuenta instanceof CuentaDeAhorro)   // If de corto circuito para verificar de tipo es la cuenta
                    ((CuentaDeAhorro)cuenta).calcularInteres();  // Si la cunta es de ahorros entonces se le calculan los intereces 
        }
    }
    @Override
    public String toString() {   // Metodo de la clase que retrona una cadena de texto 
        // SE utiliza  this.getTotal para llamar al meto de esta clase 
        return "Banco [Nombre = " + Nombre + ", Domicilio = " + Domicilio + ", Clientes = " + Clientes.size() + ", Total=" + this.getTotal() + "]";
    }
}
