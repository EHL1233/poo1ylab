// Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares.
import java.util.Scanner;
public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        // Declarar variables
        double pesos, dolares, cotizacion;

        // Definir entrada
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar datos de entrada
        System.out.println("Dame la cantidad de pesos: "); pesos = entrada.nextFloat();
        System.out.println("Dame la cotización: "); cotizacion = entrada.nextFloat();

        // Calculos
        dolares = pesos/cotizacion;

        // Imprimir datos en consola
        System.out.printf("El equivalente de pesos a dolares es : $ %.2f \n",dolares);
    }
}
