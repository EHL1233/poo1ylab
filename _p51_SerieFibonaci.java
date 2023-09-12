// Imprimir los primeros n números de la será de fibbonaci. El proceso debe de poder repetirse hasta que
// el usuario lo decida.

import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        // Declarar variables 
        int a,b,c,i,num;
        char resp;
        Scanner entrada = new Scanner(System.in);
        do{
            // Borrar datos de la consola 
            System.out.print("\033[H\033[2J");System.out.flush();

            // Pedir y asignar datos 
            System.out.println("Dime hasta que numero de la serie quieres que te represente: ");
            num = entrada.nextInt();
            // Inicializar variables 
            a=0;
            b=1;
            c=0;

            for(i=0; i <= num; i++){   // Ciclo iterativo para realizar el calculo
                System.out.printf("%d  ",a);
                c= a+b;
                a = b;
                b = c;
            }
            // Imprimir en consola 
            System.out.println("\nDesea continuar con el programa? (S/N)");
            resp = Character.toUpperCase(entrada.next().charAt(0));
        }while(resp != 'N'); // Finalizacion del ciclo
        System.out.println("\nFinalizacion del programa....");  // Imprimir en cosola

    }
}
