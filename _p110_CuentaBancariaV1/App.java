package _p110_CuentaBancariaV1;

public class App {   // Clase que ejecuta
    public static void main(String[] args) {  // Funcion principal
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola

        System.out.println("\nProbando clase CuentaBancaria:\n"); // Imprime en consola

        CuentaBancaria cuenta1 = new CuentaBancaria(90000); // Instancia un objeto de tipo CuenataBancaria Y inicializa sus atributos
        cuenta1.deposita(10000);  // Llama al metodo depodita del objeto con el paso de aparametro 

        System.out.println("El saldo es " + cuenta1.getSaldo());  // Imprime llamando al metodo getSaldo()
        double cretiro = 56;  // Declara y inicializa una variable de la esta funcion
        // Declaramos una variable de tipo boolean para verificar si  el saldo es suficiente, le pasamos un parametro para que realise el retiro
        boolean retiro = cuenta1.retira(cretiro);
        if(retiro){ // Condicion if que verifica si el resultado es true 
            System.out.println("Retiro de " + cretiro + " efectuado con éxito, nuevo saldo " + cuenta1.getSaldo()); // Imprime y añade un metodo del objeto clase 
        } 
        else System.out.println("Ni para los cigarros tienes"); // Si la condicion es falsa, se imprime en consola

        System.out.println("\nProbando clase Cliente");  // Imprime en consola 
        Cliente cliente1 = new Cliente("Shinji Ikari", cuenta1);  // Instancia un objeto de tipo cliente y inicializa sus parametros pasando objeto
        System.out.println("Cliente 1 : " + cliente1);  // Imprime los que retorna el obejeto 
        Cliente cliente2 = new Cliente("EL Bicho", new CuentaBancaria(89777)); // Instancia un objeto y inicializa sus atributos instanciando un objeto de tipo cuenta bancaria
        System.out.println("Cliente 2 : " + cliente2); // Imprime lo que retorna el objeto
        double nvoretiro = 50;  // Declara y inicializa una variable
        cliente2.getCuenta().retira(nvoretiro); // LLama al metodo del objeto para realizar un retiro 
        if( cliente2.getCuenta().retira(nvoretiro) ){ // Condicion para saber si el Saldo es suficiente para realizar el retiro 
            // Imprime el llamndo a un metodo del objeto
            System.out.println("El retiro de " + nvoretiro + " efectuado con exito, nuevo saldo " + cliente2.getCuenta().getSaldo());
        }
        else System.out.println("No money man :( "); // Imprime si la condicion no se cumple 

        System.out.println("\nProbando clase Banco");  // Imprime en consola 
        Banco mibanco = new Banco("Banco Patito SA de CV","Arboledas 124"); // Instancia un obejto de tipo Banco y inicializa sus atributos 
        mibanco.agregarCliente(cliente1); // Agrega un cliente en la lista y reserva su espacio en memoria 
        mibanco.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente("Mizato Katsuragi", new CuentaBancaria(2000));  // Instancia un cliente y inicializa sus atributos 
        mibanco.agregarCliente(cliente3); // Agerga un cliente a la lista
        // llama ala posicion de la lista y obtiene un metodo especisifico de ese obejeto
        mibanco.getClientes().get(0).getCuenta().deposita(1500); 
        mibanco.getClientes().get(1).getCuenta().retira(1000);
        mibanco.getClientes().get(2).getCuenta().deposita(12000);

        System.out.println("\nResumen del Banco \n"); // Imprime en consola
        System.out.println(mibanco); // Imprime lo que retorna el objeto
        double totalbanco = 0.0;  // Declara y inicializa una variable de esta funcion
        for(Cliente cliente : mibanco.getClientes()) {   // Ciclo for-each para pasar por todo los objetos de la lista
            System.out.println(cliente); // Imprime lo que retorna el objeto
            totalbanco += cliente.getCuenta().getSaldo();  // Suma lo que retorna el metodo llamado
        }
        System.out.println("\nTotal de dinero en el Banco : " + totalbanco); // Imprime en consola 
    }
}
