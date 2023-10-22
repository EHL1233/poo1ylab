package _p111_CuentaBancariaV2;

public abstract class CuentaBancaria {  // Clase de tipo abstract 
    // Declara atributos de la clase con modificador protected para que clase heredadas puedan acceder a el 
    protected double Saldo;

    public CuentaBancaria(double cantidad) {  // constructor de la clase 
        Saldo = cantidad;
    }
    public void deposita(double cantidad) { // Metodo de la clase para realizar un deposito 
        Saldo += cantidad;
    }
    public double getSaldo() { // Obtiene el Saldo
        return Saldo; // REtorna el saldo
    }

    public abstract boolean retira(double cantidad); // Metodo de la clase que puede ser sobrescrito por clases heredadas

    @Override
    public String toString() { // Metodo de la clase que retorna una cadena de texto
        return "CuentaBancaria [ Saldo = " + Saldo + " ]";
    }
}
