// Inicializa de forma manual arreglo de cadenas y lo imprime

public class _p82_InicializaArregloCadenas {
    public static void main(String[] args) {
        String[] municipios = new String[10];  // Declara un arreglo de tipo String (permite cadenas de texto)
        // Asignar valor de forma manual a cada indice de el arreglo 
        municipios[0] = "Apozol";
        municipios[1] = "Apulco";
        municipios[2] = "Cañitas";
        municipios[3] = "Jerez";
        municipios[4] = "Fresnillo";
        municipios[5] = "Rio Grande";
        municipios[6] = "Sain Alto";
        municipios[7] = "Sombrerete";
        municipios[8] = "Teul de Gonzalez Ortega";
        municipios[9] = "Zacatecas";
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola 
        // Imprime datos de un indice especifico de un arreglo
        System.out.printf("Primer elemento del arreglo %s\n", municipios[0] );  
        System.out.printf("Ultimo elemento del arreglo %s\n", municipios[9] );

        // Imprime con for los datos de un arreglo
        System.out.println("\nTodos los elementos del arreglo con ciclo for:");
        for(int i=0; i < municipios.length; i++) {  // la variable i solo tomara el valor del tamaño del arreglo -1

            System.out.printf( "%s ",municipios[i] );

        }

        // Imprime con for-each los datos de un arreglo 
        System.out.println("\n\nTodos los elementos del arreglo con ciclo for-each:");
        for(String m : municipios) {  // La variable m tomara el valor del dato que este dentro de cada uno de los indices del arreglo

            System.out.printf( "%s ", m );

        }
        System.out.println("\nFin del programa.... ");
    }
}
