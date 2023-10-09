package _p98_Circulo;

public class App {
    public static void main(String[] args) {  // Funcion principal
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola
        Circulo c1 = new Circulo(10.40);  // Instacia un objeto e inicializa con el radio 
        System.out.println(c1);  // Imprime el atributo del objeto 
        Circulo c2 = new Circulo();  // Instacia y reserva espacio en memoria
        c2.setRadio(12.45);  // Establese el atributo radio
        System.out.println(c2.toString());  // llama al metodo ToString de c2
        System.out.println("El radio es : " + c2.getRadio() );  // Imprime llamando el metodo getRadio de c2
        System.out.println("Area = " + c1.getArea() );        // Imprime llamando al metodo getArea de c1
        System.out.println("Circunferencia = " + c1.getCircunferencia() );  // Imprime llamando al metodo getCircunferencia de c1
    }
}
