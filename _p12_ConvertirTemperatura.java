// Convertir una temperatura de grados fahrenheit a grados celsius
import java.util.Scanner;
public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        // Declarar variables
        double gradfahrenheit, gradcelsius = 0;

        // Definir entrada
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar datos
        System.out.println("Dame los grados Fahrenheit: "); gradfahrenheit = entrada.nextFloat();

        // Calculos
        gradcelsius = ((gradfahrenheit - 32.0)*(5.0/9.0));

        // Imprimir datos en consola
        System.out.printf("La transformacion de grados Fahrenheit a Celsius es: %.2f \n",gradcelsius);
    }
}
