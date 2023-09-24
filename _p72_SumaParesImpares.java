// Imprime pares o impares y su suma con funciones 

import java.util.Scanner;

public class _p72_SumaParesImpares {
    public static int SumaParImpar(int ini, int fin, char letra) {   // Funcion para definir la suma y de los impares o pares
        int suma=0;   // Variable local 
        for(int i=ini; i <= fin; i++) {      // Ciclo for para hacer la suma de terminos
            if( letra=='P' && i%2==0 ) {     // Condicion if para numeros pares y hacer la suma e imprimir en consola 
                System.out.printf("%d ",i);
                suma+=i;
            }
            else if( letra=='I' && i%2!=0 ) {  // Condicion if para numeros impares y hacer la suma e imprimir en consola 
                System.out.printf("%d ",i);
                suma+=i;
            }
        }
        return suma;  // Retornar valor 
    }
    public static void main(String[] args) {    // Funcion principal
        int ini,fin,suma;   // Variables locales     
        char poi;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola 
        // Pedir y asignar datos 
        System.out.print("Valor incial ? "); ini = obj.nextInt();
        System.out.print("Valor final ? "); fin = obj.nextInt();
        System.out.print("\n[P]ares \n[I]Impares ? ");
        poi = Character.toUpperCase(obj.next().charAt(0));
        suma = poi=='P' ? SumaParImpar(ini,fin,'P') : SumaParImpar(ini,fin,'I');   // Asinar valor llamando una funcion con paso de variable 
        System.out.printf("\nLa suma es : %d", suma);    // Imprimir en consola 
        System.out.println("\nFin del programa.............");
    }
}
