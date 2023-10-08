// Leer un arreglo de n nombres y edades, calcula el promedio de edades

import java.util.Scanner;

public class _p85_NombresEdades {
    public static void main(String[] args) {
        int n, s=0,p=0; // Declarar variables 
        Scanner obj = new Scanner(System.in);  // Objeto para leer datos 
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola 
        // Pedir datos al usuario
        System.out.print("Cuantos nombres deseas procesar ? ");
        n = obj.nextInt();
        // Declarar arreglos del tamaño que el usuario introducio
        String[] nombres = new String[n];
        int[] edades = new int[n];

        // Pedir al usuario introducir datos para el arreglo
        System.out.printf("Dame los %d nombres: \n",n);
        for(int i=0; i < nombres.length ; i++) {  // Ciclo for para pasar por cada unos de los indices del arreglo
            obj.nextLine(); // Para que siga pidiendo datos 
            // Pedir datos dl asuario y asignar el dato al indice correspondiente 
            System.out.printf("Dame el nombre %d ? ", i+1); 
            nombres[i] = obj.nextLine(); 
            System.out.printf("Dame su edad ? ", i+1); 
            edades[i] = obj.nextInt();
        }
        // Imprimir datos en la consola 
        System.out.println("Los nombres capturados son:\n");
        System.out.printf("Nombre\tEdad\n");
        for(int i=0; i<nombres.length; i++) { // Ciclo for para mostrar informacion del arreglo
            System.out.printf("%s\t%d\n",nombres[i], edades[i]);
            s += edades[i]; // Calcula la suma de los datos de un arreglo
        }
        p = s / edades.length;  // Calcula el promedio de la suma entre el tamaño de un arreglo
        System.out.printf("\nEl promedio de edades es %d", p); // Imprime el resultado
        System.out.println("\nFin del programa.....");
    }
}
