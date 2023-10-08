// Genera dos arreglos de números aleatorios y los suma en un tercer arreglo
import java.util.Random;

public class _p89_ArregloAleatorios {
    public static void Mostrar(float[] nums) {  // Funcion que permite imprimir arreglos con paso de parametro
        for(float n : nums){   // Ciclo for para pasar por cada indice de un arreglo
            System.out.printf("%.2f ",n);
        }
        System.out.println("\n");
    }
    public static void GeneraAleatorio(float[] nums) {   // Funcion para generar los numeros aleatorios 
        float min=10.5f, max=41.5f;  // Declarar variables 
        Random rnd = new Random();  // Declarar objeto como tipo ramdon
        for(int i=0; i < nums.length; i++){  // Ciclo for para llenar de valores los arreglos 
            nums[i] = Math.abs(rnd.nextFloat(max - min)) + min;  // Asignar valor a cada indice del arrglo con un numero random tipo flotante
        }
    }
    public static void SumaArreglos(float[] a1, float[] a2, float[] a3) {  // Funcion para sumar los indices de 2 arreglos y colocarlos en un tercero
        for(int i=0; i < a1.length; i++){  // Ciclo for para recorer el tamaño de los arreglos 
            a3[i] = a1[i] + a2[i];  // Asignar valor a un arreglo con la suma de otros 2 
        }
    }
    public static void main(String[] args) {   // Funcion principal
        int MAX=15;  // Declarar variable como el maximo tamaño de los arreglos 
        // Declarar arreglos 
        float[] A = new float[MAX];
        float[] B = new float[MAX];
        float[] C = new float[MAX];

        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        // Mandar a llamar a las funciones con paso de parametros 
        System.out.println("El arreglo ya con aletorios generados:\n");
        GeneraAleatorio(A);
        GeneraAleatorio(B);
        Mostrar(A);
        Mostrar(B);
        System.out.println("El arreglo con la suma de los dos arreglos es:\n");
        SumaArreglos(A,B,C);
        Mostrar(C);
    }
}
