package _p111_CuentaBancariaV2;

public class CuentaDeCheques extends CuentaBancaria{  // Clase CuentaDeCheques que hereda de la clase CuentaBancaria
    // Declara atributos de la clase 
    private double Sobregiro;
    public CuentaDeCheques(double cantidad, double sobregiro) {  // Constructor de la clase 
        super(cantidad);   // LLAma al constructor de la clase padre 
        Sobregiro = sobregiro;
    }

    @Override  // Metodo que se sobrescribe de la clase padre 
    public boolean retira(double cantidad) {  // Metodo para calcular lo que se desea retirar 
        if( Saldo >= cantidad)   // Si el saldo del cliente es mayor a la cantidad 
            Saldo -= cantidad;  // Entonces se hace el retiro
        else {                   // Si el saldo es insuficiente entonces
            double requerida = cantidad - Saldo;  // DEclara variable de esta funcion
            if( Sobregiro >= requerida ) {  // Si el sobregiro es mayor a lo requerido 
                Saldo = 0;                  // El saldo del cliente se declara en cero
                Sobregiro -= requerida;     // Se realiza el sobregiro
            }
        }
        return true;  // Se retorna verdadero 
    }
    
    @Override
    public String toString() {   // Metodo de la clase que retorna una cadena de texto 
        // Se utiliza super.toString para llamar al metdo de la clase padre
        return "CuentaDeCheques [ " + super.toString() + ",Sobregiro = " + Sobregiro + " ]";
    }
}
