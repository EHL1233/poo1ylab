package _p102_AutorLibro;

public class App {
    public static void main(String[] args) {  // Funcion principal 
        // Prueba Autor
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        Autor a1 = new Autor("Tan Ah Teck","ahteck@nowhere.com"); // Intancia el autor y inicializa sus atributos 
        System.out.println(a1); // Imprime llamando al objeto a1
        a1.setCorreo("ahteck@somewhere.com");  // Establese el correo del autor 
        System.out.println(a1); // Imprime llamando al objeto a1
        System.out.println("Nombre es: " + a1.getNombre()); // Imprime llamando un metodo de a1
        System.out.println("Correo es: " + a1.getCorreo()); // Imprime llamando un metodo de a1
        // Prueba Libro
        Libro b1 = new Libro("12345", "Java for dummies", a1, 8.8, 88);  // Instancia el libro y inicializa sus atributos con una compocicion de Autor
        System.out.println(b1); // Imprime llamando al objeto b1
        b1.setPrecio(9.9);  // Establese el presio del libro 
        b1.setCant(99);     // Establese la cantidad de los libros 
        System.out.println(b1); // Imprime llamando al objeto b1
        System.out.println("Isbn es: " + b1.getIsbn());    // Imprime llamando un metodo de b1
        System.out.println("Nombre es: " + b1.getNombre());
        System.out.println("Precio es: " + b1.getPrecio());
        System.out.println("Cant es: " + b1.getCant());
        System.out.println("Autor es: " + b1.getAutor());  // Imprime llamando un metodo de b1 al cual tiene la composicion con Autor
        System.out.println("Autor Nombre: " + b1.getAutor().getNombre()); // Imprime el metodo de b1
        System.out.println("Autor Correo: " + b1.getAutor().getCorreo());
    }
}
