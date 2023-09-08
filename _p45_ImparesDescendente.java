// Imprime numeros impares descendente

import java.util.Scanner;

public class _p45_ImparesDescendente {
    public static void main(String[] args) {

        // Declar variables 
        int n,c,s;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            // Borrar datos de la consola 
            System.out.print("\033[H\033[2J");System.out.flush();

            // Pedir y asignar datos 
            System.out.println("Imprime números impares descendente tanto como el usuario elija\n");
            System.out.print("Desde donde ? ");
            n = obj.nextInt();
            s=0;
            c=( n%2==0 ? --n : n); // "if de corto circuito" evalua la condicion y toma una decision 
            // Ciclo de verificacion 
            while( c>=1 ) {
                System.out.printf("%d ",c);
                s += c;
                c -= 2;
            }
            // Imprimir datos en cosola 
            System.out.printf("\nLa suma es %d",s);
            System.out.print("\nDeseas continuar (S/N) ? "); resp =
            Character.toUpperCase(obj.next().charAt(0));
            // Cerrar ciclo con una condicion 
        } while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
    }
}
