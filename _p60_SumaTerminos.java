// Suma de n términos de factorial

import java.util.Scanner;

public class _p60_SumaTerminos {
    public static void main(String[] args) {
        int i,j,n; // Declarar variables 
        float f, r;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
            System.out.println("Suma de 1/factorial hasta el numero que el usuario decida\n");
            r=0;
            System.out.print("Cuantos números ? "); n = obj.nextInt(); // Pedir y asignar datos de la pantalla 
            // Ciclo anidado for 
            for(i=1; i<=n; i++) {
                f=1;
                for(j=1; j<=i; j++) {
                    f *= j;
                }
                System.out.printf(" 1 / %,.2f +",f);
                r += (1 / f);
            }
            System.out.printf("= %,.2f\n",r); // Imprimir en consola 
            System.out.print("\nDeseas continuar (S/N) ? "); // Pedir informacion al usuario
            resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N'); // Terminar el ciclo do while si se cumlpe la condicion
        System.out.println("\nProceso terminado .."); // Imprimir en consola 
    }
}
