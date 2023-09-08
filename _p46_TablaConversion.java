// Imprime tabla de conversión de peso a dolar en un rango de valores

import java.util.Scanner;

public class _p46_TablaConversion {
    public static void main(String[] args) {
        // Declarar variables 
        float c,ini, fin,tc = 19.99f;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            // Borrar datos de la consola 
            System.out.print("\033[H\033[2J");System.out.flush();
            // Imprimir en consla 
            System.out.println("Imprime tabla de conversion de peso a dolar en un rango de valores");
            
            do {
                // Pedir y asignar datos 
                System.out.print("Inicio : "); 
                ini = obj.nextFloat();
                System.out.print("Fin : "); 
                fin = obj.nextFloat();
                // Ciclo de verificacion
            } while( fin < ini );
                c=ini;
                System.out.println("Peso\tDolar");
                while( c<=fin ) {
                    // Imprimir datos en cosola 
                    System.out.printf("%d\t%.2f\n",c,c/tc);
                    c++;
                }
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
            // Cerrar el ciclo con una condicion 
        } while( resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
