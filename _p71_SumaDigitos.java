// Suma los digitos de un numero entero con funciones 

import java.util.Scanner;

public class _p71_SumaDigitos {
    public static int SumaDigitos(int n) {    // Funcion para separar y sumar cada digito 
        int suma=0, digito;   // Variables locales 
        while( n!= 0) {       // Ciclo para serar digitos y sumarlos 
            digito = n % 10;
            n = n / 10 ;
            suma+=digito;
        }
        return suma;   // Retornar valor 
    }
    public static void main(String[] args) {   // Funcion principal  
        int numero; // Variable local 
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();   // Borrar datos de la consola 
        System.out.print("Dame un número ? "); numero = obj.nextInt();  // Pedir y asignar datos 
        // Imprimir en consola, llamando una funcion pasando para metros 
        System.out.printf("\nLa suma de digitos es : %d",SumaDigitos(numero));  
    }
}
