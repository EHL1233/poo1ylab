// Tabla de multiplicar utilizando funciones 

import java.util.Scanner;

public class _p68_TablaMultiplicar {
    public static void Tabla(int t, int n) {   // Funcion para realizar y mostrar las multiplicaciones 
        System.out.printf("\nTabla del %d\n",t);  // Imprmir en consola que tabla es 
        // Ciclo for par mostrar las multiplicaiones utilizando paso de parametros 
        for(int i=1; i <= n; i++) 
            System.out.printf("%d x %d = %d\n",t,i,t*i);
    }
    public static void main(String[] args) {    // Funcion principal 
        int t,n;    // Variables locales 
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        // Pedir y asignar datos 
        System.out.print("Que tabla quieres ? "); t = obj.nextInt();
        System.out.print("Hata donde la quieres ? "); n = obj.nextInt();
        Tabla(t,n); // LLamando a una funcion pasandole para metros 
        System.out.println("\nFin del programa.......");
    }
}