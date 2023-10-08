// Mostrar las temperaturas de un arreglo

public class _p90_Temperaturas {
    public static void main(String[] args) {
        int i; // Declarar variable 
        double[] temperaturas = {2.34, 44.56, 7.89, 0.5, 4.67, 40.3, 22.35, 56.22}; // Declarar un arreglo tipo double y inicializar con valores 
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        // Imprimir valores del arreglo
        System.out.println("El primer elemento del arreglo es : "+temperaturas[0]);
        System.out.println("El primer elemento del arreglo es : "+temperaturas[2]);
        System.out.println("Todas las temperaturas del arreglo son:");
        for(i=0;i<temperaturas.length; i++){ // Ciclo for para pasar por los indices del arreglo 
            System.out.print(temperaturas[i]+" "); // Imprimir el valor de un arreglo
        }

        for(i=0;i< temperaturas.length; i++){ // Ciclo for para pasar por los indices de un arreglo 
            if(temperaturas[i]>10){   // Condicion if, si el valor del indice es mayos a 10 entonces 
                temperaturas[i] = 0;  // El valor del indice se cambia por 0
            }
        }
        System.out.println("\n\nEste es el nuevo arreglo con las temperaturas:");
        for(i=0;i<temperaturas.length; i++){    // Ciclo for para pasar por los indices de un arreglo
            System.out.print(temperaturas[i]+" "); // Imprimir los valores del nuevo arreglo
        }
        System.out.println("\n\nFin del programa.........");
    }
}
