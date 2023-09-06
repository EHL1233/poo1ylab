// Imprime la tabla de multiplicar que el usuario pida, desde 1 hasta n

import java.util.Scanner;

public class _p42_TablaMultiplicar {
    public static void main(String[] args) {
        // Declarar variables 
        int c,t,n;
        Scanner obj = new Scanner(System.in);

        // Borrar datos de la consola
        System.out.print("\033[H\033[2J");System.out.flush();

        // Pedir y asignar datos 
        System.out.println("Imprimir la tabla deseada de 1 a 10\n");
        System.out.print("Que tabla quieres ? ");
        t = obj.nextInt();
        System.out.print("Hasta donde ? ");
        n = obj.nextInt();
        c = 1;

        // Ciclo 
        while( c <= n ) {
            System.out.printf("%d x %d = %d\n", c, t, c*t);
            c++;
        }

        // Imprimir en consola 
        System.out.println("\nProceso terminado ...");
        
    }
}
