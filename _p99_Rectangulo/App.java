package _p99_Rectangulo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola
        Rectangulo r1 = new Rectangulo(1.2f, 3.4f);  // Intancia un objeto e inicializa con largo y ancho
        System.out.println(r1.toString());  // Llama el metodo toString del objeto r1
        Rectangulo r2 = new Rectangulo();   // Instancia y reserva espacio en memoria 
        System.out.println(r2.toString());  // Imprime llamando a un metodo
        r1.setLargo(5.6f);  // Establese largo de r1
        r1.setAncho(7.8f);  // Establese ancho de r1
        System.out.println(r1.toString());  // Imprime llamando un metodo de r1
        System.out.println("Largo : " + r1.getLargo());  // Imprime llamando un metodo 
        System.out.println("Ancho : " + r1.getAncho());
        System.out.printf("El Area es : %.2f\n", r1.getArea());  // Imprime llamando un metodo
        System.out.printf("El Perimetro es : %.2f\n", r1.getPerimetro());  // Imprime llamando un matodo
    }
}
