// Calcula opreaciones basicas
import java.util.Scanner;
public class _p05_OperacionesMatematicas {
    public static void main(String[] args) {
        // Declarar variables
        double x, y, suma, resta, mult, div, res, pot;

        // Definir entrada
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar datos de entrada
        System.out.println("valor de x :"); x = entrada.nextInt();
        System.out.println("valor de y :"); y = entrada.nextInt();

        // Calculos
        suma = x + y ;
        resta = x - y ;
        mult = x * y ;
        div = x / y ;
        res = x % y ;
        pot = Math.pow(x, y) ;

        // Imprimir en consola
        System.out.println(String.format("Los numeros son: %.2f, %.2f",x,y));
        System.out.println("\nEl resultado de las operaciones es el siguiente:\n");
        System.out.println(String.format("Suma: %.2f\nResta: %.2f",suma,resta));
        System.out.println(String.format("Multiplicacion: %.2f\nDivision: %.2f",mult,div));
        System.out.println(String.format("Residuo: %.2f\nPotencia: %.2f",res,pot));
    }
}