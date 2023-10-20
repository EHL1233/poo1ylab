package _p105_PuntoTriangulo;

public class App {
    public static void main(String[] args) {  // Clase principal 
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola
        // Intacia un objeto de tipo triangulo y inicializa sus atributos con una composicion
        Triangulo triangulo1 = new Triangulo(new Punto(5, 5), new Punto(15, 15), new Punto(5,25));
        Triangulo triangulo2 = new Triangulo(new Punto(15, 5), new Punto(15, 15), new Punto(5,25));

        System.out.println(triangulo1.toString()); // Imprime lo que retorna el metodo toString
        System.out.println(triangulo2.toString());
        System.out.println("Triangulo 1 - Vertice 1 : " + triangulo1.getV1()); // Imprime lo que retorna el metodo getV1
        System.out.println("Triangulo 1 - Vertice 2 : " + triangulo1.getV2());
        System.out.println("Triangulo 1 - Vertice 3 : " + triangulo1.getV3());
        System.out.println("Triangulo 1 - Perimetro : " + triangulo1.getPerimetro()); // Imprime lo que retorna el metodo 
        System.out.println("Triangulo 1 - Tipo : " + triangulo1.getTipo()); // Imprime lo que retorna el metodo getTipo
    }
}
