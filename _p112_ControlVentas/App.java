package _p112_ControlVentas;

public class App {  // Clase que ejecuta
    public static void main(String[] args){  // Funcion prinsipal
        System.out.print("\033[H\033[2J");System.out.flush(); // Borra los datos de la consola 

        Tienda similares = new Tienda("Similares", "Lionel Messi", "Av. CR7");   // Instanciando la tienda 

        // Instanciando clientes y inicializar sus atributos 
        similares.agregarCliente(new Cliente("Memo Ochoa", "Condesa 8", "MamosDeTeflon@gmail.com"));
        similares.agregarCliente(new Cliente("Michael Jackson", "Neverland", "QueriaSerBlanco@hotmail.com"));
        similares.agregarCliente(new Cliente("Elon Musk", "Av. Space X", "ComproLoQueSea@outlook.com"));
        similares.agregarCliente(new Cliente("La Tía Turbina", "Ciudad Robot", "GranSoldador@uaz.mx.com"));

        System.out.println("Reporte de clientes sin vetas: "+similares+"\n"); // Imprime en consola lo que retorna el objeto
        similares.reporte();  // Llama al metodo del objeto

        // Agrega las ventas de cada cliente 
        similares.getClientes().get(0).agregarVentas(new VentaContado("Martillo", 10, 60.50, 10, "Sacabrocados"));
        similares.getClientes().get(0).agregarVentas(new VentaCredito("Pala", 2, 1170.55, 3, 10));
        similares.getClientes().get(1).agregarVentas(new VentaCredito("Clavo", 2.5, 160.34, 2, 20));
        similares.getClientes().get(1).agregarVentas(new VentaCredito("Cinta de Aislar", 5, 71.34, 6, 20));
        similares.getClientes().get(1).agregarVentas(new VentaContado("Pinzas", 10, 650.33, 20, "Taladro"));
        similares.getClientes().get(2).agregarVentas(new VentaContado("Thiner", 50, 65, 10, "Aerosol"));

        System.out.println("\nReporte de clientes sin vetas: "+similares+"\n");  // Imprime lo que retorna el objeto
        similares.reporte();  // Llama al metodo del objeto
    }
}
