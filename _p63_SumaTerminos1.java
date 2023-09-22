// Imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma.

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int i,n; // Declarar variables
        double j;
        j=0; 
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        System.out.println("Imprimir la secuencia de términos armónicos de el número de renglones que el usuario desee y su suma.\n");
        System.out.print("¿Cuántos renglones quieres imprimir ? "); // Pedir informacion al usuario
        n = obj.nextInt();

        for(i=1; i<=n; i++){   // Ciclo for para los renglones 
            System.out.print("+ "+1+"/"+i);
            j+=(1.0/i);
        }
        System.out.printf("\n%.2f",j);
        System.out.println("\nFinalizar el programa............."); // Imprimir en consola
    }
}