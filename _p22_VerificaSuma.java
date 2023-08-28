// Verifica si la suma de dos numeros es igual a un tercero
import java.util.Scanner;

public class _p22_VerificaSuma {
    public static void main(String[] args) {
        // Declarar variables
        int n1, n2, n3;
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar datos
        System.out.print("\033[H\33[2J"); System.out.flush();
        System.out.println("Verifica si la suma de dos numeros es igual a un tercero\n");
        System.out.println("Dame el primer numero?"); n1 = entrada.nextInt();
        System.out.println("Dame el segundo numero?"); n2 = entrada.nextInt();
        System.out.println("Dame el tercer numero?"); n3 = entrada.nextInt();

        // Ciclo
        if(n1+n2 == n3)
            System.out.println("\nSon iguales");
        else
            System.out.println("\nSon distintos");

        // Imprimir en consola
        System.out.println("\n Gracias por utilizar este programa");
    }
}
