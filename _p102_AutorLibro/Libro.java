package _p102_AutorLibro;

public class Libro {   // Clase libro 
    // Declara los atributos de la clase libro 
    private String Isbn;
    private String Nombre;
    private Autor Autor;
    private double Precio;
    private int Cant=0;
    
    public Libro(){} // Constructor de la clase 
    public Libro(String isbn, String nombre, Autor autor, double precio, int cant) { // Inicializa los atributos 
        Isbn = isbn;
        Nombre = nombre;
        Autor = autor;
        Precio = precio;
        Cant = cant;
    }
    public String getIsbn() {  // Obtener el isbn (lo que sea eso )
        return Isbn;   // Retorna esa cosa 
    }
    public void setIsbn(String isbn) { // Establese el isbn 
        Isbn = isbn;
    }
    public String getNombre() { // Obtiner el nombre del libro 
        return Nombre;  // Retorna el nombre del libro 
    }
    public void setNombre(String nombre) {  // Establece el nombre del libro 

        Nombre = nombre;

    }
    public Autor getAutor() {  // Obtiene  el autor del libro con una composicion entre clases 
        return Autor;  // Retorna lo que retorna la clase Autor

    }
    public void setAutor(Autor autor) { // Establese la compocion de la clase Autor en esta clase Libro 

        Autor = autor;

    }
    public double getPrecio() {  // Obtiene el precio del libro 
        return Precio; // Retorna el precio

    }
    public void setPrecio(double precio) {  // Establese el precio

        Precio = precio;

    }
    public int getCant() {  // Obtiene la cantidad de libros 
        return Cant;  // Retorna la cantidad de libros 

    }
    public void setCant(int cant) {  // Establese la cantidad de libros 

        Cant = cant;

    }
    @Override
    public String toString() { // Metodo de la clase que retorna una cadena de texto y incluye lo que retorne la clase Autor
        return "Libro [Isbn=" + Isbn + ", Nombre=" + Nombre + ", Autor=" + Autor + ", Precio=" + Precio + ", Cant=" + Cant + "]";
    }
}
