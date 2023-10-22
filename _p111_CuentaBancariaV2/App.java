package _p111_CuentaBancariaV2;

public class App {   // Clase que ejecuta 
    public static void main(String[] args) {  // Funcion principal 
        System.out.print("\033[H\033[2J");System.out.flush(); // Borra los datos de la consola 
        // Instacia un objeto de tipo banco 
        Banco mibanco = new Banco("Banco del norte SA de CV","Priva las Cumbres 123"); 
        // Instacia clientes y inicializa los atributos
        mibanco.agregarCliente(new Cliente("Carlos Fuentes"));
        mibanco.agregarCliente(new Cliente("Juan De La Fuente"));
        mibanco.agregarCliente(new Cliente("Rene Mayorga"));
        mibanco.agregarCliente(new Cliente("Maria Vazquez"));
        System.out.println("\n>>> Los clientes del banco son:\n");  // Imprime en consola

        mibanco.reporte();  // Se llama al metodo del objeto
        // instancia en los clientes agregados cuentas para cada uno de diferentes tipos y inicializa los atributos de las cuantas
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000,0.10));
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000,0.20));
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeCheques(1000,500));
        mibanco.getClientes().get(1).agregarCuenta(new CuentaDeCheques(2500,500));
        mibanco.getClientes().get(2).agregarCuenta(new CuentaDeCheques(2000,600));
        mibanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000,0.40));

        System.out.println("\n>>> Los clientes con sus cuentas y saldos iniciales son:\n");  // Imprime en consola

        mibanco.reporte();  // LLAma al metodo del objeto
        // LLAma al metodo de cada objeto para realizar retiradas o depositos, pasando parametros
        mibanco.getClientes().get(0).getCuentas().get(0).retira(500);
        mibanco.getClientes().get(0).getCuentas().get(1).retira(100);
        mibanco.getClientes().get(1).getCuentas().get(0).deposita(100);
        mibanco.getClientes().get(2).getCuentas().get(0).deposita(300);
        mibanco.getClientes().get(2).getCuentas().get(1).retira(1000); 

        System.out.println("\n>>> Los clientes con sus cuentas y saldos despues de los movimientos son: \n"); // Imprime en consola
        mibanco.reporte();  // LLama al metodo del objeto
        // Reporte de clientes del banco y el saldo de sus cuentas, despues del cálculo de intereses
        mibanco.calcularInteres();  // LLama al metodo de la clase 
        System.out.println("\n>>> Los clientes con sus cuentas y saldos despues de calcular intereses: \n");  // Imprime en consola
        mibanco.reporte();  // LLAma el metodo de la clase 
    } 
}
