// Imprmir los numeros del 100 al 1 usando ciclo while el usuario decide hasta cuando se detiene y en cuanto decrementa
import java.util.Scanner;

public class _p40_Numeros100a1 {
    public static void main(String[] args) {
        // Declarar variables
        int c,n,b;
        System.out.println("Dime hata donde quieres que decremente");
        n = new Scanner(System.in).nextInt();
        System.out.println("Dime en cuanto quieres decrementar");
        b = new Scanner(System.in).nextInt();
        c=n;

        // Ciclo
        while( c >= 1 ) {
                System.out.print(c+" ");
                c=c-b;
        }

        // Imprimir en consola
        System.out.println("\nProceso terminado ...");
        System.out.println(c);
    }
}
