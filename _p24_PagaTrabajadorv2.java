// Calcular la paga de un trabajador, las horas extra se pagan al doble
import java.util.Scanner;

public class _p24_PagaTrabajadorv2 {
    public static void main(String[] args) {
        // Declarar variables
        int horas, extra;
        float paga, total;
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar variables
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calculndo la paga de un trabajador \n");
        System.out.println("Dame las horas: "); horas = entrada.nextInt();
        System.out.println("Dame la paga: "); paga = entrada.nextFloat();

        // Ciclos
        if (horas>40){
            extra = horas - 40;
            total = (40*paga) + (extra*paga*2);
            System.out.printf("\nHoras extra: %d", extra);
        }
        else
            total = horas * paga;
        
        // Imprimir en consola
        System.out.printf("\n Pago total: %.2f", total);
    }
}
