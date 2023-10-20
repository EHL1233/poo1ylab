package _p107_Forma;

import java.util.ArrayList;

public class App {  // Clase que ejecuta 
    public static void main(String[] args) {  // Funcion principal
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola
        Circulo circulo = new Circulo("Rojo", 10.3);  // Instancia un objeto y inicializa sus atributos
        System.out.println(circulo); // Imprime lo que retorna el objeto circulo  
        System.out.println("Area Circulo : " + circulo.getArea()); // Imprime loque obtiene del metodo
        Triangulo triangulo = new Triangulo("Azul", 10, 20); // Instancia un objeto y inicializa sus atributos 
        System.out.println(triangulo); // Imprime lo que retorna el objeto triangulo
        System.out.println("Area Triángulo : " + triangulo.getArea()); // Imprime lo que retorna el metodo
        ArrayList<Forma> formas = new ArrayList<>(); // Crea una lista dinamica en el objeto formas
        formas.add(circulo); // Agrega en la lsita
        formas.add(triangulo);
        formas.add(new Circulo("Azul", 33.45)); // Añade un objeto mas en la lista
        System.out.println("\nTodas las formas :\n"); // Imprime en consola 
        for (Forma forma : formas) {  // Ciclo for-erch para pasar por cada objeto de la lista 
            System.out.println(forma);
            System.out.print("El area del ");
            if(forma instanceof Triangulo) { // if de corto circuito para determinar si es triangulo
                // Imprime metodos del triangulo
                System.out.print("Triangulo es :");
                System.out.print( ((Triangulo)forma).getArea() );
            }
            else if(forma instanceof Circulo) { // if de corto circuito para determinar si es circulo
                // Imprime metodos de circulo
                System.out.print("Circulo es :");
                System.out.print( ((Circulo)forma).getArea() );
            }
            System.out.println("\n"); // SAlto de linea
        }
    }
}
