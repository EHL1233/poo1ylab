// Factorial de n números

import java.util.Scanner;

public class _p59_FactorialNumeros {
    public static void main(String[] args) {
        int i,j,n,f;  // Declarar variables 
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
            System.out.println("Calcula el factorial de un hasta el numero que el usuario decida\n");
            System.out.print("Cuantos números ? "); n = obj.nextInt(); // Pedir datos al usuario
            // Ciclo anidado for 
            for(i=1; i<=n; i++) {
                System.out.printf("%d!=",i);
                f=1;
                for(j=1; j<=i; j++) {
                    f *= j;
                }
                System.out.println(f);
            }
            System.out.print("\nDeseas continuar (S/N) ?");  // Pedir informacion al usuario
            resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N'); // Terminar el ciclo do while si se cumple la condicion 
        System.out.println("\nProceso terminado .."); // imprimir datos en la consola
    } 
}
