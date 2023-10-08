// Calificaciones en un arreglo
import java.util.Scanner;

public class _p91_MayoresPromedio {
    public static void Mostrar(float[] n){   // Funcion que muestra los valores de un arreglo con paso de parametro
        System.out.println("\nEstos son los datos introducidos: ");
        for(int i=0;i<n.length;i++){   // Ciclo for que permite pasar por los indices de un arreglo
            System.out.print(n[i]+" ");
        }
    }
    public static double Calculo(float[] n){ // Funcion para calcular cual es la duma de un arreglo
        double suma=0.0;
        for(int i=0;i<n.length;i++){ // Ciclo fo que permite pasar por los indices de un arreglo
            suma=suma+n[i];
        }
        return suma;  // Retornar el valor de suma 
    }
    public static void mayorprome(float[] m,double n){   // Funcion para calcular el si el valor del indice de un arreglo es mayor al promedio de este 
        int total=0; // Declarar variable 
        System.out.print("\nEstas son las calificaciones mayores al promedio:");
        for(int i=0; i<m.length;i++){  // Ciclo for que permite pasar por los indices de un arreglo 
            if(m[i]>(n/m.length)){  // Condicion if para determinar si el valor del indice es mayor al promedio
                System.out.print(m[i]+" ");  // Imprime los que son mayores 
                total=total+1;  // Suma el total de numeros mayores  
            }
        }
        System.out.println("\nEl total mayor al promedio es: "+total);  // Imprime total
    }
    public static void main(String[] args) {   // Funcion principal 
        Scanner entrada = new Scanner(System.in);  // Objeto para leer datos 
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola

        // Pedir informascion al usuario
        System.out.print("Introduce el numero de calificaciones que quieres introducir: ");
        float[] califi = new float[entrada.nextInt()]; // Declarar un arreglo con el valor que el usuario introducio
        for(int i=0;i<califi.length;i++){  // Ciclo for que permite pasar por los indices de un arreglo
            System.out.printf("\nDame la calificacion %d: ",i+1); // Pedir datos al usuario
            califi[i]=entrada.nextFloat(); // Colocar valor en el indice del arreglo con el valor introducido
        } 
        Mostrar(califi);  // LLamar funcion pasando parametros 
        double suma=Calculo(califi);  // Declarar variable con el valor que retorna la funcion pasando parametro
        System.out.printf("\nLa suma de las calificaciones es: %.2f y el promedio es %.2f ",suma,suma/califi.length); // Imprimir en consola
        mayorprome(califi, suma);  // LLamando una funcion con paso de parametro
        System.out.println("\n\nFin del programa.............. ");
    }
}
