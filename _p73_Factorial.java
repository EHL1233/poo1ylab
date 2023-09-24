// Calcula e imrime el factorial de un número con funciones 

import java.util.Scanner;

public class _p73_Factorial {
    public static double Factorial(int n) {   // Funcion para calcular el factorial
        double f=1;    // Varible local 
        for(int i=1; i <= n; i++)  // Ciclo for para calcular el factorial 
            f=f*i;
        return f;
    }
    public static void main(String[] args) {  // Funcion principal 
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        System.out.print("Dame un numero ? ");   // Pedir y asignar datos 
        int n = new Scanner(System.in).nextInt();
        // Imprimir en consola llamando una funcion con paso de parametro 
        System.out.printf("\nEl factorial de %d es %.0f", n, Factorial(n) ); 
    }
}
