// Calcula funciones trigonometricas de un angulo en radianas
import java.util.Scanner;

public class _p08_FuncionesTrigonometricas {
    public static void main(String[] args) {
         // Borrar pantalla de la consola
        System.out.print("\033[H\033[2J"); System.out.flush();

        // Pedir datos de entrada y asignarlo a una variable 
        System.out.print("Dame un angulo en Grados: ");
        double angulog = new Scanner(System.in).nextDouble();

        // Calculos
        double angulor = Math.toRadians(angulog);
        double sen = Math.sin(angulor);
        double cos = Math.cos(angulor);
        double tan = Math.tan(angulor);

        // Imprimir en consola 
        System.out.println(String.format("El angulo es: %.2f, Seno: %.2f, Coseno: %.2f, Tangente: %.2f",angulor,sen,cos,tan));
    }
}
