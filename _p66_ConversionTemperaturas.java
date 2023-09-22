// Conversion de temperaturas usando funciones

import java.util.Scanner;

public class _p66_ConversionTemperaturas {
    public static float Farenheit(float t) {    // Funcion para convertir grados celsius a farenheit 
        return (t*9/5)+32;                     //  retornar Operacion con paso de parametro 
    }
    public static float Celcius(float t) {     // Funcion para convertir grados farenheit a celsius 
        return (t-32)*5/9;                    // retornar Operacion con paso de parametro
    }
    public static void main(String[] args) {    // Funacion principal
        // Variables locales 
        int op;
        float temp, res;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        // Pedir y asignar datos 
        System.out.print("[1] farenheit\n[2] celcius\nElige ? "); 
        op = obj.nextInt();

        // Concional dependiendo los datos ingresados por el usuario
        if(op == 1) {
            // Pedir datos al usuario
            System.out.print("Dame la temperatura ? "); 
            temp = obj.nextFloat();
            res = Farenheit(temp);   // Asignar valor a una variable local llamando a una funcion
            System.out.printf("\n%.2f grados celcius equivale a %.2f grandos farenheit ", temp, res); // Imprimir en consola 
        }
        else if(op == 2) {
            // Pedir datos al usuario
            System.out.print("Dame la temperatura ? "); 
            temp = obj.nextFloat();
            res = Celcius(temp);    // Asignar valor a una variable local llamando a una funcion
            System.out.printf("\n%.2f grados farenheit equivale a %.2f grandos celcius ", temp, res);  // Imprimir en consola
        }
        else 
            System.out.println("Opción inválida"); // Imprimir en consola
        
        System.out.println("\nFin del proceso.............");  // Imprimir en consola 
    }
}