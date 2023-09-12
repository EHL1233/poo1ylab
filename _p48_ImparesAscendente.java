// Imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n),
// además deberá imprimirse la suma y el promedio de esos números impares. El proceso debe de poder repetirse
// hasta que el usuario lo decida.

import java.util.Scanner;

public class _p48_ImparesAscendente   {
    public static void main(String[] args) {
        // Declarar variables 
        int n,i,c,suma,k;
        float prome;
        char resp;
        Scanner entrada = new Scanner(System.in);

        // Ciclo pricipal
        do{
            // Inicializar en cero cadaves que se ejecute 
            n=i=c=suma=k=0;
            // Borrar datos de la consola 
            System.out.print("\033[H\033[2J");System.out.flush();

            // Imprimir en consola
            System.out.println("Imprime los numeros impares la suma y el promedio hasta donde el usuario decida"); 
            // Ciclo de verificacion de valores 
            do {
                // Pedir y asignar datos 
                System.out.print("\nHasta donde quieres que avance el programa (Solo numeros positivos) \n");
                n = entrada.nextInt();
            } while( n <= 0);

            c=(n%2==0 ? --n : n); // "if de corto circuito" evalua la condicion y toma una decision

            // Ciclo 
            for(i=1; i<=c; i+=2){
                System.out.print(i+" ");
                suma =suma +i;
                k+=1;
            }
            // Calculo
            prome=suma/k;
            // Imprimir en consola 
            System.out.printf("\nLa suma es: %d y el promedio es: %.2f",suma,prome);
            System.out.println("\nDesea continuar con el programa? (S/N)");
            resp = Character.toUpperCase(entrada.next().charAt(0));

        }while( resp != 'N' ); // Finalizacion del ciclo 
        System.out.println("\nFinalizacion del programa....");  // Imprimir en cosola 
    }
}
