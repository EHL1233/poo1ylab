// Calcular la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados
import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        // Declarar variables
        double hipo, long1, long2;

        // Definir entrada
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar datos
        System.out.println("Dame la primera longitud: "); long1 = entrada.nextFloat();
        System.out.println("Dame la segunda longitud: "); long2 = entrada.nextFloat();

        // Calculos
        hipo = Math.sqrt((long1*long1)+(long2*long2));

        // Imprimir datos en consola
        System.out.printf("La hipotenusa del triangulo es : %.2f \n",hipo);
    }
}
