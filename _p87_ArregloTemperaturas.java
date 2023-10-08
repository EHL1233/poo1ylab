// Calcula mayor,promedio y busca en un arreglo de temperaturas

public class _p87_ArregloTemperaturas {
    public static void Mostrar(double[] t) {  // Funcion para mostrar los datos de un arreglo
        for(double v : t){   // Ciclo for para psar por cada indice del arreglo 
            System.out.print(v + " ");
        }
        
    }
    public static double Mayor(double[] t) {  // Funcion con paso de parametro para determinar que valor del arreglo es el Mayor 
        double m = t[0];  // Declar a m como doble y asignarle el valor del indice 0 del arreglo 
        for(int i=0; i < t.length; i++){  // Ciclo for para recorrer cada indice del arreglo 
            if(t[i] > m){  // Condicion if para deterninar si el valo es mayor 
                m = t[i];  // Si el valor es mayor que el anterior la varible toma este nuevo valor 
            }
        }
        
        return m; // Retornar el valor de m 
    }
    public static double Mernor(double[] t) { // Funcion con paso de parametro para determinar que valor del arreglo es el Menor 
        double m = t[0];  // Declar a m como doble y asignarle el valor del indice 0 del arreglo  
        for(int i=0; i < t.length; i++){  // Ciclo for para rrecorrer cada indice del arreglo 
            if(t[i] < m){  // Condicion if para determinar si el valor es menor 
                m = t[i];  // Si el valor es menor que el anterior la variable toma este nuevo valor 
            }
        }
        
        return m; // Retornnr el valor de m 
    }
    public static double Promedio(double t[]) {  // Funcion para sacar el promedio de las temperaturas 
        double s = 0;   // Declara y inicializar la varible 
        for(int i=0; i < t.length; i++){  // Ciclo for para recorrer los indices del arreglo
            s += t[i];  // Calculo para la suma de los valores del arreglos
        }
        return s / t.length;  // Retornar el valor de la suma entre el tamaño del arreglo
    }
    public static int Buscar(double t[], double b) {  // Funcion para buscar una temperatura espesifica pasando el arreglo y el valor especifico 
        int pos=-1;  // Declarar una varible y inicializarla  
        for(int i=0; i < t.length; i++){ // Ciclo for para recorrer los valores de un arreglo 
            if( t[i] == b ){   // Condicion if para determinar si el valor que ese encuentra dentro del indice es el del parametro temp
                pos = i;  // Si la condicion es verdadera la variable toma el valor de la posion en el arreglo 
            }
        }
        
        return pos;  // Retornar pos 
    }
    public static void main(String[] args) {  // Funcion pincipal 
        double[] temps = {12.34, 56.22, 56.78, 0.0, 10.25, 60.22};  // Declar y inicializar el arreglo 
        // Declarar una variables
        double temp = 10.25;
        int pos=0;
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola 
        // Imprime todas las temperaturas del arreglo 
        System.out.println("\nLas temperaturas son:");
        Mostrar(temps); // LLama al funcion Mostrar con paso de parametro 

        System.out.printf("\nLa temperatura mayor es : %.2f", Mayor(temps) );  // Imprime lo que retorna la funcion Mayor con paso de parametro 
        System.out.printf("\nLa temperatura menor es : %.2f", Mernor(temps) ); // Imprime lo que retorna la funcion Menor con paso de parametro
        System.out.printf("\nLa promedio es : %.2f", Promedio(temps) );  // Imprime lo que retorna la funcion Promedio con paso de parametro 

        // Darle el valor a la variable con lo que retorna la funcion Buscar 
        pos = Buscar(temps,temp); // LLamando a la funcion Buscar con paso de parametro
        // Condicion if para determinar si el valor de se encuentra en el arreglo 
        if( pos!= -1){
            System.out.printf("\nLa temperatura %.2f fue encontrado en la posición %d", temp, pos);  // Si el valor de la varible cambia, se imprime
        }
        else{
            System.out.println("\nEl elemento no existe");  // Si el valor de la varible no cambia, significa el valor no se encuentra dentro del arreglo
        }
        System.out.println("\n\nFin del programa.........");
    }
}
