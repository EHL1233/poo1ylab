// Convertir temperatura de grados celcius a farenheit y viceversa
import java.io.Console;
import java.util.Scanner;

public class _p23_CovertirTemperaturas {
    public static void main(String[] args) {
        // Declar variables
        char op;
            float temp, res;
            Scanner entrada = new Scanner(System.in);

            // Pedir y asignar valores
            System.out.print("\n033[H\033[2J"); System.out.flush();
            System.out.println("Convertir de grados celcuis a farenheit y viceversa\n");
            System.out.println("[F]arenheit a centigrados");
            System.out.println("[C]entigrados a farenheit");
            System.out.println("Elije una opcion: "); op = entrada.next().charAt(0);
            op = Character.toUpperCase(op);

            // Ciclo
            if (op=='F'){
                System.out.println("\nConvertir de Farenheit a Centigrados\n");
                System.out.println("Dame los grados Farenheit: "); temp = entrada.nextFloat();
                res = (temp - 32) * (5/9);
                System.out.printf("%.2f Farenheit, equivale a %.2f Centigrados", temp, res);
            }
            else{
                System.out.println("\nConvertir de Centigrados a Farenheit\n");
                System.out.println("Dame los grados Centigrados: "); temp = entrada.nextFloat();
                res = (temp * 9/5) +32;
                System.out.printf("%.2f Centigrados, equivale a %.2f Farenheit", temp, res);
            }

            // Imprimir en consola
            System.out.println("\nGracias por utilizar este programa");
    }
}
