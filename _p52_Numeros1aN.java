// Numeros de 1 a n con paso de p

import java.util.Scanner;

public class _p52_Numeros1aN {
    public static void main(String[] args) {
        // Borrar datos de la consola
        System.out.print("\033[H\033[2J");System.out.flush();
        int n,p; // Declarar variable
        Scanner obj = new Scanner(System.in);
        // Pedir y asignar datos 
        System.out.println("Numeros de 1 a n con paso de p");
        System.out.print("Hasta donde ? "); n = obj.nextInt();
        System.out.print("Paso ? "); p = obj.nextInt();

        // Ciclo iterativo 
        for(int i=1; i<=n; i+=p) {

            System.out.printf("%d ",i); // Imprimir en cosola 
        }

        System.out.println("\nFin del programa............");
    }
}
