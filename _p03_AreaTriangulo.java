// Programa para encontar el area de un triangulo
import java.util.Scanner;

public class _p03_AreaTriangulo {
    public static void main(String[] args) {
        // Declarar variables
        int base, altura;
        double area;

        // Definir entrada
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar datos de entrada
        System.out.println("Dame la base: ");
        base = entrada.nextInt();
        System.out.println("Dame la altura: ");
        altura = entrada.nextInt();

        // Calculos
        area = (base * altura)/2;

        // Imprimir en consola
        System.out.println(String.format("Un triangulo de base %d y altura %d tiene un area de %f", base, altura, area));
        
    }
}
