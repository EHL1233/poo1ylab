// Suma de pares e impares

import java.util.Scanner;

public class _p55_SumaParesImpares {
    public static void main(String[] args) {
        // Declarar variables
        int n, s, op;
        Scanner obj = new Scanner(System.in);
        do {
            // Borrar datos de la consola
            System.out.print("\033[H\033[2J");System.out.flush();
            // Opciones para el usuario
            System.out.println("Impares ascendente .... [ 1 ]");
            System.out.println("Pares descentente...... [ 2 ]");
            System.out.println("Salir ................. [ 3 ]");
            // Pedir y asignar datos 
            System.out.print("Elije ? "); op = obj.nextInt();

            switch(op) {
                case 1:
                    s = 0; // Icinializar variables
                    System.out.println("\nImpares ascendenbte y su suma:"); // Imprimir variables
                    System.out.print("Hasta donde ? "); // Pedir datos al usuarios 
                    n = obj.nextInt();
                    for(int i=1; i<=n; i+=2) {  // Ciclo iteracion
                        System.out.printf("%d ",i); // Imprimir en consola 
                        s += i;
                    }
                    System.out.printf("\nLa suma de impares es: %d", s);  // Imprimir en consola 
                    break;
                case 2:
                    s = 0; // Icinializar variable
                    System.out.println("\nPares descendente y su suma:"); // Imprimir en consola
                    System.out.print("Hasta donde ? ");  // Pedir datos al usuario
                    n = obj.nextInt();
                    n = ( n%2==0 ? n : --n); // "if de corto circuito"
                    for(int i=n; i>=1; i-=2) {
                        System.out.printf("%d ",i); // Imprimir en consola 
                        s += i;
                    }
                    System.out.printf("\nLa suma de impares es: %d", s); // imprimir en consola
                    break;
                case 3:

                    System.out.println("\nHasta la proxima........");break; // imprimir en consola

                default:

                System.out.println("\nOpcion Invalida");break; // imprimir en cosola

            }
            System.out.println("\nPresiona <Enter> para continuar"); // Imprimir en consola
            obj.nextLine();obj.nextLine();
        } while( op != 3);
        System.out.println("\nProceso Terminado ...."); // Imprimir en consola
    }
}
