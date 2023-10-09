package _p100_Articulo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola
        Articulo art1 = new Articulo("A101", "Pluma Roja", 888, 0.08);  // Intancia un objeto e inicializa con id, desc, cant, preciounit
        System.out.println(art1.toString()); // LLamar al metodo de objeto art1
        art1.setCant(999);  // Estableser cantidad del articulo art1
        art1.setPrecioUnit(0.99);  // Estableser precio por unidad del articulo art1
        System.out.println(art1.toString()); // Imprimir llamando el metodo del objeto art1
        // Imprimir los metodos y atributos del objeto art1
        System.out.println("Id         es: " + art1.getId());
        System.out.println("Desc       es: " + art1.getDesc());
        System.out.println("Cant       es: " + art1.getCant());
        System.out.println("PrecioUnit es: " + art1.getPrecioUnit());
        System.out.println("El Total   es: " + art1.getTotal());
        ArrayList<Articulo> articulos = new ArrayList<>();  // Crea una lista dinamica de articulos 
        articulos.add(art1);   // Agrega a la lista los atributos de art1
        // Agrega dos articulos mas a la lista pasandole atributos 
        articulos.add(new Articulo("A102", "Pluma Azul", 934, 1.2));
        articulos.add(new Articulo("P103", "Lapiz del 12", 456, 0.5));
        int total=0; // Variable local 
        System.out.println("\nTodos los articulos");
        for (Articulo articulo : articulos) { // Ciclo for-earh para pasar por cada indice de la lista 
            System.out.println(articulo.toString());  // Imprime el metodo toString de la clase articulo
            total += articulo.getTotal(); // Guarda en total lo que obtine llamando al metodo articulo 
        }
        System.out.println("Total venta: " + total); // Imprime en la consola
        }
}
