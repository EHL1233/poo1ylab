// Acepta a un estudiante en base a su edad y sus calificaciones
import java.util.Scanner;

public class _p27_AceptarEstudiante {
    public static void main(String[] args) {
        // Borrar datos de la consola
        System.out.print("\033[H\033[2J"); System.out.flush();

        // Declarar variables 
        String nombre;
        int edad;
        float c1,c2;
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar valores 
        System.out.println("Acepta a un estudiante en base a su edad y sus calificaciones\n");
        System.out.print("Dame tu nombre ? "); nombre = entrada.nextLine();
        System.out.print("Dame la edad ? "); edad = entrada.nextInt();

        // Condiciones
        if( edad >= 18 ) {
            System.out.println("Eres mayor de edad, continuamos ");
            System.out.println("Dame dos calificaciones separadas por Enter:");
            c1 = entrada.nextFloat();
            c2 = entrada.nextFloat();
            if( c1 >= 8 && c2 >= 8)
                System.out.printf("\nBIENVENIDO %s tienes %d y calificaciones %.2f,%.2f ... ACEPTADO\n",nombre,edad,c1,c2);
            else
                System.out.println("\nSolo aceptamos estudiantes con calificaciones de 8 en adelante");

        }
        else
            System.out.println("Solo aceptamos estudiantes mayores de edad");

        // Imprimir en consola
        System.out.println("\nProceso terminado ...");
    }
}
