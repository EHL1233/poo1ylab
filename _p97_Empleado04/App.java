package _p97_Empleado04;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
    ArrayList<Empleado> empleados = new ArrayList<>();   // Lista de datos dinamica
    // Se crea un lista de nuevos objetos de la clase empleado, pasando parametros para inicializar
    empleados.add(new Empleado("Juan Perez",35,'H',true));
    empleados.add(new Empleado("Maria de Jesus",16,'M',false));
    empleados.add(new Empleado("Dario Jimenez",33,'H',true));
    empleados.add(new Empleado("Jessica Jimenez",45,'H',true));

    System.out.print("\033[H\033[2J");System.out.flush();  // Borra datos de la consola 
    System.out.println("\nLos empleados en el ArrayList");
    for (Empleado empleado : empleados){ // Ciclo for que pasa por cada indice del ArrayList
        System.out.println(empleado.toString()); // Se llama al metodo del objeto empleado
    }
    System.out.println("\nEl primer elemento del ArrayList");
    System.out.println(empleados.get(0));         // Se optiene al metodo del empleado en posicion 0(es el primero en ser añadido)
    System.out.println("\nRealizando calculos:");
    int suma=0, th=0, tm=0, tc=0, tnc=0;  // Declara variables locales 
    for(int i=0; i < empleados.size(); i++) {  // Ciclo for para pasar por cada indice del ArrayList
        suma = suma + empleados.get(i).getEdad();  // Se optine el valor del atributo edad de cada empleado
        if(empleados.get(i).getSexo()=='H') th++; else tm++;  // Condicion para determinar si es hombre o mujer 
        if(empleados.get(i).getCasado()) tc++; else tnc++; // Condicion para determinar si esta casado o no
    }
    System.out.println("Promedio de edades: " + (suma/empleados.size())); // Imprime la suma por el numero de empleados en la lista
    // Imprimen datos en la consola 
    System.out.println("Hombres : " + th);
    System.out.println("Mujeres : " + tm);
    System.out.println("Casados : " + tc);
    System.out.println("No Casado : " + tnc);
    }
}
