// Dados tres números enteros, verificar cual es el mayor.

import java.util.Scanner;

public class _p34_NumeroMayor {
    public static void main(String[] args) {
        // Borrar datos de la consola
        System.out.print("\033[H\033[2J");System.out.flush();

        // Declarar variables
        int n1=0, n2=0, n3=0;
        Scanner entrada = new Scanner(System.in);
        
        // Pedir y asignar valores
        System.out.println("Dame tres valores y te dire cual es el mayor (solo puedes introducir número enteros)");
        System.out.println("NOTA: no importa en que orden igreses los numeros");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Dame el primer valor : ");
        n1 =entrada.nextInt();
        System.out.println("Dame el segundo valor : ");
        n2 =entrada.nextInt();
        System.out.println("Dame el tercer valor : ");
        n3 =entrada.nextInt();

        // Condicones
        if (n2<n1 && n3<n1){
            System.out.print("EL numero mayor es : "+n1);
        }
        if(n1<n2 && n3<n2){
            System.out.print("EL numero mayor es : "+n2);
        }
        if (n2<n3 && n1<n3){
            System.out.print("EL numero mayor es : "+n3);
        }
        // Imprimir en consola 
        System.out.println("\nFinalizacon del programa.......");
    }
}
