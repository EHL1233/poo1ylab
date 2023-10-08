package _p95_Empleado02;

public class App {
    public static void main(String[] args) {
        // Instanciar y reservar espacio en memoria
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Juan Perez");  // EL metodo set establese como nombre lo que que esta detro del parentecis al objeto empleado1
        empleado1.setEdad(35);             // El metodo set establese como nombre lo que esta dentro del parentecis al objeto empleado1
        System.out.println(empleado1.toString());  //LLama al metodo de empleado1
        // Instanciar, luego reservar espacio en memoria
        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.setNombre("Maria de Jesus");
        empleado2.setEdad(16);
        System.out.println(empleado2.toString());
        // Accede elementos individuales directamente
        System.out.println("Nombre : " + empleado1.getNombre());
        System.out.println("Edad : " + empleado1.getEdad());
    }
}
