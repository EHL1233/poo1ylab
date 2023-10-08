import java.util.Scanner;

public class _p92_MayorMenor {
    public static void mayorymenor(int[] k){  // Funcion para determinar cual numero dentro de un arreglo es el mayor y el menor 
        // Declarar varibles y inicializar con el primer valor de el arreglo
        int mayor=k[0];
        int menor=k[0];
        for(int i=0;i<k.length;i++){  // Ciclo for para pasar por cada indice del arreglo 
            if(mayor<k[i]){  // Condicion if para deteminar si el numero qu esta en el indice es mayor que el de la variable 
                mayor=k[i];
            }
            if(menor>k[i]){  // Condicion if para deteminar si el numero qu esta en el indice es menor que el de la variable
                menor=k[i];
            }
        }
        // Imprmir los valores 
        System.out.println("\nEL valor mayor introducido es: "+mayor);
        System.out.println("EL valor menor introducido es: "+menor);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  // Objeto para leer datos 
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola

        // Pedir informascion al usuario
        System.out.print("Introduce el numero de valores que quieres introducir: ");
        int[] n = new int[entrada.nextInt()]; // Declarar un arreglo con el valor que el usuario introducio
        for(int i=0;i<n.length;i++){  // Ciclo for que permite pasar por los indices de un arreglo
            System.out.printf("\nDame el valor  %d: ",i+1); // Pedir datos al usuario
            n[i]=entrada.nextInt(); // Colocar valor en el indice del arreglo con el valor introducido
        }
        mayorymenor(n);  // LLamar a la funcion pasando parametros
        System.out.println("\nFin del programa.......");
    }
}
