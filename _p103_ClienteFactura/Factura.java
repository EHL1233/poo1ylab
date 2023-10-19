package _p103_ClienteFactura;

public class Factura {  // Clase Factura 
    // Declara los atributos de la clase Factura 
    private int Id;
    private Cliente Cliente;
    private double Monto;

    public Factura(){} // Constructor de la clase 
    public Factura(int id, Cliente cliente, double monto) { // Inicializa los atributos de la clase 
        Id = id;
        Cliente = cliente;
        Monto = monto;
    }
    public int getId() { // Obtiene el id de la factura 
        return Id; // Retorna el id de la factura 
    }
    public void setId(int id) { // Esblese el id de la factura
        Id = id;
    }
    public Cliente getCliente() { // compocicon de la clase Cliente.... Factura tiene un Cliente
        return Cliente;  // Retorna lo que retorne la clase cliente
    }
    public void setCliente(Cliente cliente) { // Establese a cliente dentro de la clase libro 
        Cliente = cliente;
    }
    public double getMonto() {  // Obtine el monto de la factura 
        return Monto; // Retorna el monto
    }
    public void setMonto(double monto) {  // Establese el monto
        Monto = monto;
    }
    public double getMontoDespuesDeDescuento() {  // Metodo que calcula el monto despues del descuento
        Monto = Monto - Monto * Cliente.getDescuento() / 100.0; // Calculo del monto
        return Monto;  // Retorna el monto
    }
    @Override
    public String toString() {   // Metodo que retorna un cadena de texto
        return "Factura [Id=" + Id + ", Cliente=" + Cliente + ", Monto=" + Monto + "]";
    }
}
