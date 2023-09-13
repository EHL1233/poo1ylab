// Suma y promedio de n calificaciones

import java.util.Scanner;

public class _p56_SumaPromedio {
    public static void main(String[] args) {
        // Declar variables
        int n;
        float cal, suma, prom;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola
            suma=prom=0;  // Inicilizar variable
            System.out.println("Suma y promedio de n calificaciones: \n");  // Iformacion para el usuario
            System.out.print("Cuantas calificaciones ? "); n = obj.nextInt(); // Pedir y asignar datos 
            for(int i=1; i<=n; i++) {
                System.out.printf("Calificacion %d ? ",i); // Imprimir en consola
                cal=obj.nextFloat();
                suma+=cal;
            }
            // Calculo
            prom=suma/n;
            System.out.printf("\nSuma es %.2f y el promedio es %.2f\n\n",suma,prom); // Imprimir datos 
            System.out.print("Deseas continuar (S/N) ? ");   // Opcion para el uauario
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N');
        System.out.println("\nProceso Terminado ..."); // Imprimir en consola
    }
}
