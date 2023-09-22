// Calificación con letra utilizando funciones 

import java.util.Scanner;

public class _p69_CalificacionLetra {
    public static char CalifLetra(float cal) {   // Funcion para dar el valor a una letra con pase de parametros 
        char letra=' ';        // Variable local
        // Condicion if para conparar el valor del parametro y asignar un valor
        if(cal>=90&&cal<=100)
            letra='A';
        else if(cal>=80&&cal<90)
            letra='B';
        else if(cal>=70&&cal<80)
            letra='C';
        else if(cal>=60&&cal<70)
            letra='D';
        else if(cal>=0&&cal<60)
            letra='F';
        return letra;   // Retornar 
    }
    public static void main(String[] args) {     // Funcion principal 
        float cal;  // Variable local
        char letra; // Variable local 
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        // Ciclo do while se repite hasta que el usuario ingrese los datos correctamente 
        do {
            System.out.print("Dame tu calificacion (0-100) ? ");  // Pedir y asignar los datos 
            cal = new Scanner(System.in).nextFloat();
        } while(cal<0 || cal>100);
        letra = CalifLetra(cal);    // Asignar valor a una variable local llamando una funcion
        System.out.printf("\nTu calificación de %.2f en letra es %c", cal,letra);  // Imprimir en consola 
        System.out.println("\nFin del programa.......");
    }
}
