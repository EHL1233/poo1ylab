// Muestra un arreglo y lo eleva al cuadrado usando funciones

public class _p86_ArregloMostrar {
    public static void Mostrar(int[] a) {  // Función para mostrar el contenido del un arreglo me diante paso de parametros 
        for(int i=0; i < a.length; i++){  // Ciclo for para recorrer los indices de un arreglo 
            System.out.print(a[i] + " ");  // Imprimir el contenido de un indice 
        }
        
    }
    public static void Cuadrado(int [] a) {  // Funcion que resive un arreglo y lo eleva al cuadrado 

        for(int i=0; i < a.length; i++){  // Ciclo for para pasar por cada indice del arreglo 
            a[i] = a[i] * a[i];
        }
    }
    public static void main(String[] args) {  // Funcion principal
        int[] A = {2, 4, 6, 8, 3, 5, 7};  // Declara y inicializa el arreglo de tipo entero 
        System.out.println("\nElementos del arreglo A");
        Mostrar(A);  // LLama a la funcion mostrar con paso de parametro
        System.out.println("\nElementos del Arreglo A al Cuadrado");
        Cuadrado(A);  // LLama a la funcion cuadrado con paso de parametro
        Mostrar(A);  // LLama a la funcion mostrar con paso de parametro

        System.out.println("\n\nFin del programa........");
    }
}
