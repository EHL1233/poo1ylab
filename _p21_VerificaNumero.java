// Verifica si un numero es positivo, negativo o cero
import java.util.Scanner;
public class _p21_VerificaNumero {
    public static void main(String[] args) {
        // Declarar variables
        int n;

        // Pedir y asignar valores de la variable
        System.out.println("Verifica si un mero es positivo, negativo o cero\n");
        System.out.println("Dame un numero");
        n = new Scanner(System.in).nextInt();

        // ciclo
        if (n>0)
            System.out.println("El número es POSITIVO");
        if (n<0)
            System.out.println("El número es NEGATIVO");
        if (n==0)
            System.out.println("El número es CERO");
        
            // Imprimir en consola
        System.out.println("\n Gracias por utilizar este progama\n");
    }
}
