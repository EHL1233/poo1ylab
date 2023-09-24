// Calcula e imprime el mayor de tres numeros con funciones 

import java.util.Scanner;

public class _p70_MayorTresNumeros {
    public static float Mayor(float n1,float n2,float n3) {  // Funcion para comparar cual numero es el mayor 
        float may=0;   // Variable local 
        // Condion if para hacer la comparacin de numeros 
        if( n1>n2 && n1>n3 ) may=n1;
        else if( n2>n1 && n2>n3 ) may=n2;
        else if( n3>n1 && n3>n2 ) may=n3;
        return may;   // Retornar valor 
    }
    public static void main(String[] args) {    // Funcion principal 
        float n1,n2,n3;   // Variables locales 
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        // Pedir y asingnar datos 
        System.out.print("Dame tres numeros separados por espacio ? ");
        n1 = obj.nextFloat(); n2 = obj.nextFloat(); n3 = obj.nextFloat();
        // Imprimir en consola y llamar a la funcion pasando parametros 
        System.out.printf("\nEl mayor de los tres números es : %.2f",Mayor(n1,n2,n3));
    }
}
