package _p109_FormaV2;

import java.util.ArrayList;

public class App {   // Clase que ejecuta
    public static void main(String[] args){  // Funcion principal
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola

        // Instanciando objetos y inicializando sus atributos 
        Circulo cir1 = new Circulo("Rojo", true, 10.23);
        Circulo cir2 = new Circulo("Verde", false, 99.12);
        Rectangulo rec1 = new Rectangulo("Amarillo", false, 10.0, 20.0);
        Rectangulo rec2 = new Rectangulo("Azul", true, 15.0, 44.0);
        // Crea una lista dinamica
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(cir1); // Añade un objeto ala lista
        formas.add(cir2);
        formas.add(rec1);
        formas.add(rec2);

        System.out.println("Todas las formas : ");  // Imprime en la consola 
        for(Forma forma : formas){ // Ciclo for-each para pasar por cada objeto de la lista
            System.out.println(forma); // Imprime lo que retorna el objeto
        }

        System.out.println("\nCalculando areas y perimetros de las figuras:");  // Imprime en consola
        for(Forma forma : formas){  // Ciclo for-each para pasar por cada objeto de la lista 
            if(forma instanceof Circulo){   // Condicion if de corto circuito para saber que tipo de Forma es
                System.out.println("La forma es un Circulo");                  // Imprime en consola
                System.out.println("El area es        : "+forma.getArea());    // Imprime lo que retorna el metodo del objeto
                System.out.println("El perimetro es   : "+forma.getPerimetro()); // Imprime lo que retorna el metodo del objeto
            }
            else if(forma instanceof Rectangulo){  // Condicion else if de corto circuito para saber de tipo de Forma es
                System.out.println("La forma es un Rectangulo");               // Imprime en consola
                System.out.println("El area es        : "+forma.getArea());    // Imprime lo que retorna el metodo del objeto
                System.out.println("El perimetro es   : "+forma.getPerimetro()); // Imprime lo que retorna el metodo de la clase
            }
        }

    }
}
