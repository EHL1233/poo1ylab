package _p108_Vehiculo;

import java.util.ArrayList;

public class App {   // Clase que ejecuta
    public static void main(String[] args){  // Funcion principal
        double suma=0.0;   // Variable de esta funcion
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola
        
        // Instancia un objeto de tipo Compacto o Camioneta y inicializa sus atributos junto a los de su clase padre Vehiculo
        Compacto comp1 = new Compacto(new Vehiculo("CP0100010122", "Ford", 2023, 125345.22), 4, 2);
        Compacto comp2 = new Compacto(new Vehiculo("CP1000145555", "Nissan", 2010, 54500.33), 6, 4);
        Camioneta  cami1= new Camioneta(new Vehiculo("CA104014544", "Dina", 2008, 234567.15), 450.0, 4);
        Camioneta  cami2= new Camioneta(new Vehiculo("CA774814599", "Hongyan", 2023, 934577.98), 1200.0, 6);
        // Crea una lista dinamica 
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        // Añado los vehiculos a la lista 
        vehiculos.add(comp1);
        vehiculos.add(comp2);
        vehiculos.add(cami1);
        vehiculos.add(cami2);
        
        System.out.println("Datos de los Vehiculos de la flota\n"); // Imprime en consola 
        for(Vehiculo vehiculo : vehiculos){  // Ciclo for-each para pasar por cada objeto de la lista 
            System.out.println(vehiculo); // Emprime el los que retorna el obejeto
        }

        System.out.println("\nCalculando el total de precio de todos los vehiculos....."); // Imprime en consola
        for(Vehiculo vehiculo : vehiculos){   // Ciclo for-each para pasar pro cada objeto de la lista 
            System.out.println(vehiculo.getPrecio());  // Imprime lo que retorna el metodo llamado del obejeto
            suma+=vehiculo.getPrecio();  // Suma lo que obetiene del metodo del objeto
        }
        System.out.println("La suma de precios es: "+suma);  // Imprime en consola el objeto

    }
}
