// Calcula la paga de un trabajador
import java.util.Scanner;

public class _p04_PagaTrabajo {
    public static void main(String[] args) {
        // Declarar variables
        String nombre;
        int horas;
        float paga, pagabruta, tasa, impuesto, paganeta;
        Scanner entrada = new Scanner(System.in);

       // Entrada de datos
       System.out.println("Nombre           :"); nombre = entrada.nextLine();
       System.out.println("Horas de trabajo :"); horas = entrada.nextInt();
       System.out.println("Paga por hora    :"); paga = entrada.nextFloat();
       tasa = 0.3f;

       // Calculos 
       pagabruta = horas*paga;
       impuesto = pagabruta*tasa;
       paganeta = pagabruta-impuesto;

       // Imprimir en consola
       System.out.println("Resumen de pagos \n");
       System.out.println(String.format("El trabajador %s, trabajo %d horas, con una paga de %.2f pesos la hora, se asume una tasa de impuesto de %.2f ", nombre, horas, paga, tasa));
       System.out.println(String.format("Paga bruta: %.2f", pagabruta));
       System.out.println(String.format("Impuesto: %.2f", impuesto));
       System.out.println(String.format("Paga neta: %.2f", paganeta));

    }
}
