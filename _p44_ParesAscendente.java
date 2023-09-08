// Imprime numeros pares ascendente

import java.util.Scanner;

public class _p44_ParesAscendente {
    public static void main(String[] args) {
        // Declar variables 
        int n,c,s;
        char resp;
        Scanner obj = new Scanner(System.in);

        // Ciclo 
        do {

            // Borrar datos de la consola 
            System.out.print("\033[H\033[2J");System.out.flush();

            // Pedir y asignar datos 
            System.out.println("Imprime números pares de forma ascendente hasta donde el usuario eliga\n");
            System.out.print("Hasta donde ? "); 
            n = obj.nextInt();
            s=0;
            c=2;

            // Ciclo de verificacion 
            while( c<=n ) {
            System.out.printf("%d ",c);
            s += c;
            c +=2;
        }
            // Imprimir datos en consola 
            System.out.printf("\nLa suma es %d",s);
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
            // Cerrar el ciclo con una condicion
        } while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
    }
}
