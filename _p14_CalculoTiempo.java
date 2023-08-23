// Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos
import java.util.Scanner;
public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        // Declarar variables
        double horas, dias, minutos, segundos;

        // Definir entrada
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar datos
        System.out.println("Dame las horas: "); horas = entrada.nextDouble();

        // Calculos
        dias = horas/24.0;
        minutos = horas*60.0;
        segundos = horas*3600.0;

        // Imprimir en pantalla
        System.out.printf("El equivalente en días es : %.0f días\n",dias);
        System.out.printf("El equivalente en minutos es : %.0f minutos \n",minutos);
        System.out.printf("El equivalente en segundos es : %.0f segundos\n",segundos);
    }
}
