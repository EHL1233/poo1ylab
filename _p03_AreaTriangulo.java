// Programa para encontar el area de un triangulo
import java.util.Scanner;

public class _p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame la base: ");
        base = entrada.nextInt();
        System.out.println("Dame la altura: ");
        altura = entrada.nextInt();

        area = (base * altura)/2;

        System.out.println(String.format("Un triangulo de base %d y altura %d tiene un area de %f", base, altura, area));
        
    }
}
