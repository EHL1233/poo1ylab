// Programa con una función que pida un número entero entre 1 y 7 y devuelva el día de la semana con
// letra. Deberá validar que el número está en el rango adecuado.

import java.util.Scanner;

public class _p76_DiaSemana {
    public static void diasemana(int n) {  // Funcion para determinar que dia de la semana es, e imprimirlo 
        if (n<8 && n>0){ // Condicion para verificar que esta dentro del rango permitido
            switch (n) {  // Condicion switch para eligir la opcion correcta e imprimir
                case 1 : 
                    System.out.println("Es domingo");
                    break;
                case 2 : 
                    System.out.println("Es lunes");
                    break;
                case 3 :
                    System.out.println("Es martes");
                    break;
                case 4 :
                    System.out.println("Es miercoles");
                    break;
                case 5 :
                    System.out.println("Es jueves");
                    break;
                case 6 :
                    System.out.println("Es viernes");
                    break;
                case 7 :
                    System.out.println("Es sabado");
                    break;
            }
        }
        else{
            System.out.println("El numero introducido no esta dentro de los valores 1 a 7 ");
        }
    }
    public static void main(String[] args) {   // Funcion principal
        int n;  // Variables locales 
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola 

        // Pedir y asignar valor
        System.out.println("Este programa imprime un dia de la semana segun el numero que introduscas entre 1 y 7 (como en calendarios)\n");
        System.out.print("Dame un numero entero ");
        n = obj.nextInt();
        diasemana(n);   // LLamar a la funcion con paso de parametros 
        System.out.println("\nFin del programa..........");
    }
}
