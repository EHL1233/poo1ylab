// Programa con una función que reciba tres parámetros: dos números que corresponden a un rango (ini,
// fin), otro número constante que es 3 o 4 regrese la suma de números múltiplos de 3 o múltiplos de 4 en el rango
// de números especificados. Deberá́ mostrar un menú́ con las opciones correspondientes.

import java.util.Scanner;

public class _p78_SumaMultiplos {
    public static int sumamultiplos(int ini,int fin,int n) {   // Funcion para sumar los multiplos 
        int suma=0,i=0;   // Variables locales 
        for(i=ini; i<=fin;i++){   // Ciclo for para recorer el rango, tomar los multiplos, imprimirlos y sumarlos 
            if(i%n==0){           // Seleccionar los multiplos 
                System.out.printf("+%d",i);
                suma=suma+i;
            }
        }
        return suma; // Retornar la suma de los multiplos 
    }
    public static void main(String[] args) {   // Funcion principal 
        int ini,fin,n;   // Variables locales
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola

        do{   // Ciclo do while para optener los valores correctos 
            System.out.print("Introduce el numero de inicio ");  // Pedir y asignar valores 
            ini = obj.nextInt();
            System.out.print("\nIntroduce el numero final ");
            fin = obj.nextInt();
            System.out.print("\nIntroduce que multiplo deseas (3 ó 4) ");
            n = obj.nextInt();

            if(ini<fin && (n==3 || n==4)){   // Condicion if para verificar los valores correctos 
                System.out.printf("\nLa suma es: %d ",sumamultiplos(ini, fin, n));  // Imprimir llamando una funcion con paso de parametros 
            }
            else{
                System.out.println("Los rangos introducidos no son los adecuados ");
            }
        }while(ini>=fin && (n!=3 || n!=4));  // Repetir hata que los valores sean los correctos 
        System.out.println("\nFin del programa..........");
    }
}
