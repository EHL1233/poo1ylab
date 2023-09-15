// Imprime una pirámide del caracter

import java.util.Scanner;

public class _p58_Piramide {
    public static void main(String[] args) {
        int i,j,n;  // Declarar variables 
        char car, resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola
            System.out.println("Imprime una piramide, la altura y el caracter con la que es creada lo decide el usuario\n");
            System.out.print("Cuantos renglones ? "); n = obj.nextInt();  // Pedir y asignar datos 
            System.out.print("De que caracter ? "); car = obj.next().charAt(0);
            // Ciclo anidado 
            for(i=1; i<=n; i++) {
                for(j=1; j<=i; j++) {

                System.out.print(car);

                }
                System.out.println();
            }
            System.out.print("\nDeseas continuar (S/N) ?");   // Imprimir en consola
            resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');  // Terminar el ciclo do while si se cumple la condicion 
        System.out.println("\nProceso terminado .."); // Imprimir en cosola 
    }
}
