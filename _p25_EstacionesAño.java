// Muestra la estación del año que corresponde al número introducido
import java.util.Scanner;

public class _p25_EstacionesAño {
    public static void main(String[] args) {
        // Borrar datos de la consola
        System.out.print("\033[H\033[2J"); System.out.flush();

        // Pedir y asignar datos de entrada
        System.out.println("Muestra la estacion del año en base al número:\n");
        System.out.print("Dame un numero (1..4) ? ");
        int entrada = new Scanner(System.in).nextInt();

        // Condiciones 
        if(entrada == 1)
            System.out.println("Primavera");
        if(entrada == 2) 
            System.out.println("Verano");
        if(entrada == 3) 
            System.out.println("Otoño");
        if(entrada == 4) 
            System.out.println("Invierno");
        if(entrada >= 5 || entrada <= 0)
            System.out.println("El numero ingresado no tiene una estacion asignada");

        // Imprimir en consola
        System.out.println("\nProceso terminado ....");
    }
}
