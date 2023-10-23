package _p112_ControlVentas;

import java.util.ArrayList;

public class Tienda {    // Calse Tienda
    // DEclara Atributos de la clase 
    private String Nombre;
    private String Propietario;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;

    public Tienda(){  // Constructor de la clase
        Clientes = new ArrayList<>();
    }

    public Tienda(String nombre, String propietario, String domicilio) {  // Constructor de la clase 
        this();  // Inicializa variables 
        Nombre = nombre;
        Propietario = propietario;
        Domicilio = domicilio;
    }

    // Metodos gets y sets para cada atributo 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public void agregarCliente(Cliente clientes) {  // Metodo para agregar un cliente en la lista
        Clientes.add(clientes);  // Agrega un cliente a la lista
    }
    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }
    
    public double getTotal(){   // Metodo que obtiene el total de las vetas de los clientes 
        double total = 0.0;
        for(Cliente clientes : Clientes){
            total += clientes.getTotal();
        }
        return total;  // Retorna el total
    }

    public void reporte(){    // Metodo que entrega un reporte de las ventas y el total de ventas de cada cliente 
        for(Cliente clientes : Clientes){
            if(clientes.getVentas().size() == 0){
                System.out.println(clientes);
            }
            else if(clientes.getVentas().size() != 0){
                System.out.println(clientes);
                for(Venta vetas : clientes.getVentas()){
                    System.out.println(vetas);
                }
            }
            System.out.println("");
        }
    }

    public String toString(){  // Metodo que retorna una cadena de texto
        return "Tienda "+Nombre+" [Propietario= "+Propietario+", Domicilio= "+Domicilio+", Clientes= "+Clientes.size()+", Total= "+this.getTotal()+"]";
    }
}
