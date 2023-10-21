package _p110_CuentaBancariaV1;

public class Cliente {   // Clase Cliente
    // Declara los atributos de la clase 
    private String Nombre;
    private CuentaBancaria Cuenta;  // Este atributo es de tipo CuntaBancaria
    public Cliente(String nombre, CuentaBancaria cuenta){ // Contructro de la clase 
        Nombre = nombre;
        Cuenta = cuenta;
    }
    public String getNombre() {  // Obtiene el nombre
        return Nombre; // REtorna el nombre 
    }
    public void setNombre(String nombre) {  // Establese el nombre 
        Nombre = nombre;
    }
    public CuentaBancaria getCuenta() {  // Obtiene la cuneta
        return Cuenta; // REtorna la cuenta
    }
    public void setCuenta(CuentaBancaria cuenta) {  // Establese la cunata
        Cuenta = cuenta;
    }
    @Override 
    public String toString() {  // Metodo de la clase que retorna una cadena de texto
        // Se utiliza el metodo Cuenta.getSaldo() para obtener el saldo del cliente
        return "Cliente [ Nombre= " + Nombre + ", CuentaSaldo = " + Cuenta.getSaldo() + "]";
    }
}
