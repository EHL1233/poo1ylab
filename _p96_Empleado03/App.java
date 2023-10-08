package _p96_Empleado03;

public class App {
    public static void main(String[] args) {
        // Crea un objeto de la clase empleado
        Empleado empleado1 = new Empleado("Juan Perez",35); // Inicializa el objeto empleado1 con los atributos de nombre y edad
        System.out.println(empleado1.toString()); // LLama al metodo del empleado1
        Empleado empleado2 = new Empleado("Maria de Jesus",16);
        System.out.println(empleado2.toString());
        // Crea un objeto de la clase empleado 
        Empleado empleado3 = new Empleado();  // Instancia y reserva espacio en memorea
        empleado3.setNombre("Dario Jimenez"); // Estable como atributo del empleado
        empleado3.setEdad(33);  // Establese como atributo del nuevo empleado 
        System.out.println(empleado3.toString());  // LLama al metodo del empleado
        System.out.println("Nombre : " + empleado1.getNombre());  // Obtiene un atributo del empleado 
        System.out.println("Edad : " + empleado1.getEdad());  // Obtiene un atributo del empleado
    }
}
