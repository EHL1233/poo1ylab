// calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo
import java.util.Scanner;
public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        // Declarar variables
        double ang1, ang2, ang3;

        // Definir entrada
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar datos
        System.out.println("Dame la primer angulo: "); ang1 = entrada.nextFloat();
        System.out.println("Dame la segundo angulo: "); ang2 = entrada.nextFloat();

        // Calculos
        ang3 = 180 - (ang1+ang2);

        // Imprimir datos en consola
        System.out.printf("El valor del tercer angulo es : %.2f \n",ang3);
    }
}
