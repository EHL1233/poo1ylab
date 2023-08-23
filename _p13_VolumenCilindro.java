// Calcular el volumen de un cilindro dado su radio y altura
import java.util.Scanner;
public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        // Declarar variables
        double volumen, radio, altura;

        // Definir entrada
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar datos
        System.out.println("Dame el radio del circulo: "); radio = entrada.nextFloat();
        System.out.println("Dame la altura del circulo: "); altura = entrada.nextFloat();
        
        // Calculos
        volumen = Math.PI*(radio*radio)*altura;

        // Imprimir en pantalla
        System.out.printf("El volumen del circulo es : %.2f m3\n",volumen);
    }
}
