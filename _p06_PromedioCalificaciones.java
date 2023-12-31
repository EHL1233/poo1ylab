// Calcula el promedio de tres calificaciones, calcula también la mayor y la menor
import java.util.Scanner;
public class _p06_PromedioCalificaciones {
    public static void main(String[] args) {
        // Declarar variables y inicializando variables
        float cal1, cal2, cal3, suma, prom, min, max;
        cal1 = cal2 = cal3 = 0;

        // Definir entrada 
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar datos de entrada
        System.out.println("Calculando el promedio de tres calificaciones, calculando tambien la mayor y la menor:\n");
        System.out.println("Dame calificacion 1: "); cal1 = entrada.nextFloat();
        System.out.println("Dame calificacion 2: "); cal2 = entrada.nextFloat();
        System.out.println("Dame calificacion 3: "); cal3 = entrada.nextFloat();

        // Calculos
        suma = cal1 + cal2 + cal3;
        prom = suma / 3;
        min = Math.min(Math.min(cal1,cal2), cal3);
        max = Math.max(Math.max(cal1,cal2), cal3);

        // Imprimir en consola
        System.out.printf("\nLas calificaciones introducidas son: %.2f, %.2f, %.2f\n",cal1,cal2,cal3);
        System.out.printf("La suma : %.2f \n",suma);
        System.out.printf("El promedio : %.2f \n",prom);
        System.out.printf("La menor : %.2f \n",min);
        System.out.printf("La mayor : %.2f \n",max);    
    }
}
