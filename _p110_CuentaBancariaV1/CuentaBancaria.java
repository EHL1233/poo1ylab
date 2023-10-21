package _p110_CuentaBancariaV1;

public class CuentaBancaria {  // Clase de Cuenta Bancaria 
    // Declara atributos de la clase 
    private double Saldo;

    public CuentaBancaria(double cantidad) {  // Constructor de la clase, asigna el valor al atributo 
        Saldo = cantidad;
    }
    public void deposita(double cantidad) {  // Metodo de la clase que resibe cantidad y la suma al Saldo existente
        Saldo += cantidad;
    }
    public double getSaldo() {  // Metodo de la clase para obetener el saldo 
        return Saldo;  // Retorna el valor del Saldo
    }
    // Metodo de la clase que resibe cantidad y Realiza la resta de cantidad a Saldo. Este metodo solo retorna un boolean
    public boolean retira(double cantidad) {
        if( Saldo >= cantidad) {  // Si el Saldo es mayor a la cantidad pedida se realizara la resta
            Saldo -= cantidad;
        return true; // Solo retorna true si la condicion cumple
        }
        else
        return false;  // Retor falso si la condicion no cumple
    }
}
