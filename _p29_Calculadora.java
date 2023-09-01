// Efectua operaciones matemáticas báscias con dos números

import java.util.Scanner;

public class _p29_Calculadora {
    public static void main(String[] args) {
        // Definir variables
        double n1, n2;
        char op;
        Scanner obj = new Scanner(System.in);

        // Borrar datos de la consola
        System.out.print("\033[H\033[2J");System.out.flush();

        // Pedir y asignar datos 
        System.out.println("Efectua operaciones matemáticas básicas con 2 número\n");
        System.out.print("Dame número 1 ? ");
        n1 = obj.nextDouble();
        System.out.print("Dame número 2 ? ");
        n2 = obj.nextDouble();
        System.out.print("Operación ( + - * / ^ ) ? ");

        op = obj.next().charAt(0);

        // Condicion
        switch (op) {
        case '+':
            System.out.printf("n1 + n2 = %.2f", n1 + n2);
            break;
        case '-':
            System.out.printf("n1 - n2 = %.2f", n1 - n2);
            break;
        case '*':
            System.out.printf("n1 * n2 = %.2f", n1 * n2);
            break;
        case '/':
            System.out.printf("n1 / n2 = %.2f", n1 / n2);
            break;
        case '^':
            System.out.printf("n1 / n2 = %.2f", Math.pow(n1, n2));
            break;
        default:
            System.out.printf("\nOperación Inválida ...");
            break;

        }

        // Imprimir en consola
        System.out.println("\n\nProceso terminado ..."); 
    }
}
