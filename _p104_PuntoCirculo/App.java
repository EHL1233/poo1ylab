package _p104_PuntoCirculo;

public class App {
    public static void main(String[] args){  // Funcion principal 
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        Circulo circulo1 = new Circulo(new Punto(5, 8), 6);  // Intacia un objeto de tipo circulo y inicializa sus atributos con una composicion
        Circulo circulo2 = new Circulo(new Punto(30, 46), 2);

        System.out.println(circulo1);  // Imprime lo que retorne la clase circulo
        System.out.println(circulo2);
        System.out.println("Circulo 1 Area             : "+circulo1.getArea());
        System.out.println("Circulo 1 Circunferencia   : "+circulo1.getCircunferencia());
        System.out.println("Circulo 1 Centro           : "+circulo1.getCentro());
        System.out.println("Distancia a Circulo 2      : "+circulo1.getCentro().getDistancia(circulo2.getCentro())); // Imprime lo que retorne el metodo centro pasando un parametro
    }
}
