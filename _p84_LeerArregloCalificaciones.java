// Lee un arreglo de n calificaciones, calcula al suma y el promedio

import java.util.Scanner;

public class _p84_LeerArregloCalificaciones {
    public static void main(String[] args) {
        // Declarar variables 
        int n=0;
        float suma=0, promedio=0;
        Scanner obj = new Scanner(System.in); // Objeto para leer datos 
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 

        // Pedir datos al usuario 
        System.out.print("Cuantos calificaciones deseas procesar ? ");
        n = obj.nextInt();
        float[] califs = new float[n];  // Declarar un arreglo del tamaño que el usuario indica tipo flotante

        // Pedir al usuario que intrudusca datos 
        System.out.printf("Introduce las %d calificaciones \n", n);
        for(int i=0; i < califs.length; i++) {  // Ciclo for para pasar cada indice del arreglo 
        System.out.printf("Calificacion %d : ",i+1);
        califs[i] = obj.nextFloat();  // Asignar valor a cada indice del arreglo con el dato que intrudusca el usuario
        }
        // Imprime las calificaciones qu el usuario introducio y realiza la suma de todas estas
        System.out.println("\nEl arreglo de calificaciones capturadas es :");
        for(float cal : califs) {  // Ciclo for-each para pasar porcada indice del arreglo
            System.out.printf("%.2f ", cal);
            suma = suma + cal;  // Calculo de la sumas del arreglo
        }
        promedio = suma / califs.length; // Calculo del promedio de la suma entre el tamaño del arreglo
        // Imprime en consola
        System.out.printf("\nLa suma de las calificaciones es %.2f", suma);
        System.out.printf("\nEl promedio de las calificaciones es %.2f", promedio);
        System.out.println("\nFin del programa.....");
    }
}
