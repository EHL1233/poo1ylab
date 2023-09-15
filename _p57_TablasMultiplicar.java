// Tablas de multiplicar con de 1 a n hasta la del n

import java.util.Scanner;

public class _p57_TablasMultiplicar {
    public static void main(String[] args) {
        int i,j,n,m;  // Declarar variables 
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
            System.out.println("Mustra las tablas de multiplicar de 1 hasta donde desida el usuario\n");
            System.out.print("Hasta que tabla ? "); n = obj.nextInt();  // Pedir unformacion al usuario
            System.out.print("Hasta donde ? "); m = obj.nextInt();
            // Ciclo anidado for
            for(i=1; i<=n; i++) {
                System.out.printf("Tabla del %d\n",i);
                for(j=1; j<=m; j++) {

                System.out.printf("%d x %d = %d\n",i,j,i*j);

                }
            }
            System.out.print("\nDeseas continuar (S/N) ? ");   // Imprimir en consola
            resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');  // Terminar el ciclo do while si se cumple la condicion 
        System.out.println("\nProceso terminado ..");  // Imprimir en consola
    }
}