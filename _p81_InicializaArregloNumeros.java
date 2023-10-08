// Inicializa de forma manual arreglo de números flotantes y lo imprime

public class _p81_InicializaArregloNumeros {
    public static void main(String[] args) {
        double[] nums = new double[7];     // Declara un arreglo de tipo doble
        // Inicializa los valos de forma manual para cada indice 
        nums[0] = 5.0;
        nums[1] = 10.0;
        nums[2] = 15.5;
        nums[3] = 20.5;
        nums[4] = 25.0;
        nums[5] = 100.22;
        nums[6] = 90.0;
        System.out.print("\033[H\033[2J");System.out.flush(); // Borra datos de la consola 
        // Imprime datos de un indice especifico de un arreglo
        System.out.printf("Primer elemento del arreglo %.2f\n", nums[0] );
        System.out.printf("Ultimo elemento del arreglo %.2f\n", nums[6] );

        // Imprime con for los datos de un arreglo 
        System.out.println("\nTodos los elementos del arreglo con ciclo for:");
        for(int i=0; i < nums.length; i++) {  // la variable i solo tomara el valor del tamaño del arreglo -1

            System.out.printf( "%.2f ",nums[i] );

        }
        // Imprime con for-each los datos de un arreglo 
        System.out.println("\n\nTodos los elementos del arreglo con ciclo for-each:");
        for(double i : nums) {  // La variable i tomara el valor del dato que este dentro de cada uno de los indices del arreglo

            System.out.printf( "%.2f ", i );

        }
        System.out.println("\nfin del programa............ ");
    }
}
