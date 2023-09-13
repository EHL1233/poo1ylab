// De 1 a n y de n a 1, según el usuario lo decida

import java.util.Scanner;

public class _p54_ArribaAbajo {
    public static void main(String[] args) {
        // Declarar variables
        int n, op;
        Scanner obj = new Scanner(System.in);
        do {
            // Borrar datos de la consola 
            System.out.print("\033[H\033[2J");System.out.flush();

            // Opciones para el usuario
            System.out.println("Numeros de 1 a n .... [ 1 ]");
            System.out.println("Numeros de n a 1 .... [ 2 ]");
            System.out.println("Salir ............... [ 3 ]");
            // Pedir y asignar datos 
            System.out.print("Elije ? "); op = obj.nextInt();

            switch(op) { 
                case 1:
                    System.out.print("Hasta donde ? "); n = obj.nextInt(); // Pedir y signar datos
                    for(int i=1; i<=n; i++)  // Ciclo iterativo
                    System.out.printf("%d ",i); // imprimir en consola 
                    break;
                case 2:
                    System.out.print("Desde donde ? "); n = obj.nextInt(); // Pedir y asignar datos
                    for(int i=n; i>=1; i--) // Ciclo iterativo
                    System.out.printf("%d ",i); // imprimir en consola
                    break;
                case 3:
                    System.out.println("\nHasta la proxima...."); // Imprimir en consola 
                    break;
                default:
                    System.out.println("\nOpcion Invalida"); // Imprimir en consola
                    break;

            }
            System.out.println("\nPresiona <Enter> para continuar"); 
            obj.nextLine();obj.nextLine();
        } while( op != 3);
            System.out.println("\nProceso Terminado ...."); // imprimir en consola
    }
}
