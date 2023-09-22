// Calcula el promedio de tres números usando una función.

import java.util.Scanner;

public class _p65_PromedioNumeros {
    public static float promedio(float n1, float n2, float n3) {  // Función de promedio
        float suma;            // Variable local 
        suma = n1 + n2 + n3;   // Operacion paso de parametros 
        return suma/3;         // Retornar valor 
    }
    public static void main(String[] args) {    // Funcion principal
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la pantalla 
        float n1, n2, n3, prom;       // Variables locales 
        Scanner obj = new Scanner(System.in);

        // Pedir y asignar datos al usuario
        System.out.print("Dame número 1 : "); 
        n1 = obj.nextFloat();
        System.out.print("Dame número 2 : "); 
        n2 = obj.nextFloat();
        System.out.print("Dame número 3 : "); 
        n3 = obj.nextFloat();

        prom = promedio(n1, n2, n3); // Asignar valor a una variable local con paso de parametros llamandola 
        System.out.printf("\nEl promedio es %.2f", prom);  // Imprimir en la consola 
        System.out.println("\nFin del proceso..........");
    }
}
