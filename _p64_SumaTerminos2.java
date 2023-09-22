// Imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma.

import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int i,j,n,suma; // Declarar variables
        suma=0;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        System.out.println("Imprimir la secuencia de términos, el numero de reglones que el usuari desida\n");
        System.out.print("¿Cuántos renglones quieres imprimir ? "); // Pedir informacion al usuario
        n = obj.nextInt();

        for(i=1; i<=n; i++){   // Ciclo for para los renglones 
            System.out.print("+");
            suma=i+(suma*10);
            for(j=1; j<=i;j++){
                System.out.print(1);
            }
        }
        System.out.printf("\nel resultado es: "+suma);
        System.out.println("\nFinalizar el programa............."); // Imprimir en consola
    }
}