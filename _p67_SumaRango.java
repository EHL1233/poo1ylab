// Suma de un rango de numeros

import java.util.Scanner;

public class _p67_SumaRango {
    public static float SumaRango(float ini, float fin) {    // Funcion para la suma de rango
        float s=0;                         // Variable local inicializada 
        for(float i=ini; i <= fin ;i++)    // Ciclo for para generar la suma con paso de parametros 
            s+=i;    // Suma de digitos 
        return s;   // Retornar el valor 
    }
    public static void main(String[] args) {  // Funcion principal 
        float i, f, res;     // Variables locales 
        Scanner obj = new Scanner(System.in); 
        System.out.print("\033[H\033[2J");System.out.flush();   // Borrar datos de la consola 
        // Ciclo do while pide los datos y se repite hasta que estos son correctos 
        do {
            System.out.print("Dame inicio : "); i = obj.nextFloat(); // Pedir y asignar datos 
            System.out.print("Dame fin : "); f = obj.nextFloat();
        } while( i > f);
        res = SumaRango(i, f);   // Asignar valor a una variable local llamando una funcion
        System.out.printf("\nLa suma del rango es %.2f",res);  // Imprimir en consola 
        System.out.println("\nFin del programa.........");
    }
}