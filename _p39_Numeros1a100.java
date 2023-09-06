// Imprime los números del 1 al 100 usando ciclo while el usuario decide hasta cuando y que incremento
import java.util.Scanner;

public class _p39_Numeros1a100 {
    public static void main(String[] args) {
        // Declarar variables 
        int c,n,b;
        c=1;
        System.out.println("Dime hasta donde quieres que llege: ");
        n = new Scanner(System.in).nextInt();
        System.out.println("Dame en cuanto quieres que se incremente: ");
        b = new Scanner(System.in).nextInt();

        // Ciclo 
        while( c <= n ) {
            System.out.printf("%d ",c);
            c= c+b;
        }

        // Imprimir en cosola
        System.out.println("\nProceso terminado ...");
        System.out.println(c);
    }
}
