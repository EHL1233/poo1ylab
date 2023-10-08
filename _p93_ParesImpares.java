import java.util.Random;

public class _p93_ParesImpares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola
        Random rnd = new Random();   // Objeto para crear numeros random
        int maxsteel=100;  // Inicializar variable como maxsteel
        int par=0, impar=0;  // Declarar variables 
        // Declarar varibles como arreglos de tamaño maxsteel
        int[] a = new int[maxsteel];
        int[] b = new int[maxsteel];
        System.out.println("Esta es la lista de numeros del arreglo: ");
        for(int i=0; i<a.length;i++){   // Ciclo for para pasar por cada indice del arreglo
            a[i]=Math.abs(rnd.nextInt(20));  // Asignar valor a cada indice con un numero random del 0 al 20
            System.out.print(a[i]+" ");   // Imprimir el numero del indice
        }
        System.out.println("\n\nEsta es la lista de numeros pares del arreglo: ");
        for(int i=0;i<a.length;i++){  // Ciclo for para pasar por cada indice del arreglo
            if(a[i]%2==0){  // Si el numero es es divicible entre 2 el numeroves par 
                System.out.print(a[i]+" "); // Imprimir el numero
                par+=1; // Contar el numero de pares
            }
        }
        System.out.println("\nLa cantidad de numeros pares son: "+par);
        System.out.println("\nEsta es la lista de numeros impares del arreglo: ");
        for(int i=0;i<a.length;i++){  // Ciclo for para pasar por cada indice del arreglo
            if(a[i]%2!=0){ // Si el numero no es divicible entre 2 es impar
                System.out.print(a[i]+" "); // Imprimir numero
                impar+=1; // Contar el numero de impares 
            }
        }
        System.out.println("\nLa cantidad de numeros impares son: "+impar);
        System.out.println("\n\nFin del programa.......");
    }
}
