// Inicializa al declarar, dos arreglos, uno con Nombres y otro con Edades

public class _p83_InicializaNombresEdades {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Luis", "Jose", "Mateo","Maria"}; // Inicializa el arreglo al declarar tipo String
        int[] edades = {22, 25, 44, 38, 50, 16};  // Inicializa el arreglo al declarar tipo entero

        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola 
        // Imprime los valores del arreglo "nombres"
        System.out.println("\nLos nombres son:");
        for(String nombre : nombres){
            System.out.println(nombre);
        }
        // Imprime los valors del arreglo "edades"
        System.out.println("\nLas edades son:");
        for(int edad : edades){
            System.out.println(edad);
        }

        // Imprime los valores de los dos arreglos 
        System.out.println("\nCada nombre con su respectiva edad");
        for(int i=0; i < nombres.length; i++){  // Ciclo for para pasar por cada indice de los dos arreglos 
            // Los arreglos al ser del mismo tamaño se peueden imprimir con la variable i 
            System.out.printf("Nombre: %s, Edad %d\n", nombres[i], edades[i] );
        }

        System.out.println("\nFin del programa.... ");
    }
}
