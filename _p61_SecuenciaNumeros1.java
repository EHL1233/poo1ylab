// Imprimir la secuencia de números mostrados el número de renglones que el usuario desee.

import java.util.Scanner;

public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        int i,j,n; // Declarar variables 
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        System.out.println("Imprimir la secuencia de el mismo números mostrados el número de renglones que el usuario desee.\n");
        System.out.print("¿Cuántos renglones quieres imprimir ? "); // Pedir informacion al usuario
        n = obj.nextInt();

        for(i=1; i<=n; i++){     // Ciclo for para los renglones 
            for(j=1;j<=i;j++){   // Ciclo for para inprimir los numeros 
                System.out.print(i+" ");  // Imprimir los numeros 
            }
            System.out.println(""); // Salto de linea 
        }
        System.out.println("\nFinalizar el programa............."); // Imprimir en consola 
    }
}
