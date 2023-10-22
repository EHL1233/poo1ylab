package _p111_CuentaBancariaV2;

public class CuentaDeAhorro extends CuentaBancaria {  // Clase CuaentaDeAhorro que hereda de CauntaBancaria
    // DEclara atributos de la clase 
    private double TasaInteres;

    public CuentaDeAhorro(double cantidad, double tasaintres) { // Constructor de la clase 
        super(cantidad); // LLAma al constructor de la clase padre 
        TasaInteres = tasaintres;
    }
    public void calcularInteres() { // Metodo que calcula los intereses 
        Saldo += Saldo * TasaInteres;
    }

    @Override  // Metodo que se sobrescribe de la clase padre 
    public boolean retira(double cantidad) { // Metodo para retirar de cuenta
        if( Saldo >= cantidad) { // Si el saldo en la cuenta es el suficiente en tonces se podra realizar el retiro 
            Saldo -= cantidad;

            return true; // Retorna si es verdadero 
        }
        else
            return false; // Retorna falso si la condicion no se cumple 

    }
    
    @Override
    public String toString() {  // Metodo de la clase que retorna una cadena de texto 
        // El metodo super.toString () se utiliza para llamarlo a la clase padre 
        return "CuentaDeAhorro [ " + super.toString() + ", TasaInteres = " + TasaInteres + " ]";
    }
}
