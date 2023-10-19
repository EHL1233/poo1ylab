package _p103_ClienteFactura;

public class App {
    public static void main(String[] args) {  // Funcion principal 
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10); // Instancia un objeto de tipo cliente y inicializa sus atributos
        System.out.println(c1); // Imprime llamndo al objeto c1
        c1.setDescuento(8);  // Establese el descuento del objeto c1
        System.out.println(c1); // Imprime llamando al objeto c1
        System.out.println("Id es : " + c1.getId()); // Imprime llamando al metodo getid del objeto c1
        System.out.println("Nombre es : " + c1.getNombre()); // Imprime llamando al metodo getnombre del objeto c1 
        System.out.println("Descuento es : " + c1.getDescuento()); // Imprime llamendo un metodo del objeto c1
        Factura inv1 = new Factura(101, c1, 888.8);  // Instancia un objeto de tipo Factura y inicializa sus atributos con la composicion de la clase Cliente
        System.out.println(inv1); // Imprime lo que retorne el objeto inv1
        inv1.setMonto(999.9);  // Establese el Monto para el objeto inv1
        System.out.println(inv1); // Imprime lo que retorna el objeto inv1
        System.out.println("Id es : " + inv1.getId()); // Imprime llamndo un metodo de inv1
        System.out.println("Cliente es : " + inv1.getCliente()); // Imprime llamando el metodo del objeto inv1 que fue compuesto por la clase Cliente
        System.out.println("Monto es : " + inv1.getMonto());
        System.out.println("Cliente Id es : " + inv1.getCliente().getId());
        System.out.println("Cliente Nombre es : " + inv1.getCliente().getNombre());
        System.out.println("Cliente Descuento es : " + inv1.getCliente().getDescuento() + "%");
        System.out.printf("Monto despues de descuento es :%.2f%n", inv1.getMontoDespuesDeDescuento());
    }
}
