package _p94_Empleado01;

public class App {
    public static void main(String[] args) {
        // Instanciar y reservar espacio en memoria
        Empleado empleado1 = new Empleado();
        // Darle valores al objeto
        empleado1.Nombre = "Juan Perez";
        empleado1.Edad = 35;
        System.out.println(empleado1.toString());  // LLama ala funcion de una clase
        // Instanciar, luego reservar espacio en memoria
        Empleado empleado2;
        empleado2 = new Empleado();
        // Darle valores al objeto 
        empleado2.Nombre = "Maria de Jesus";
        empleado2.Edad = 16;
        System.out.println(empleado2.toString());  // LLama ala funcion de una clase
        // Accede elementos individuales directamente
        System.out.println("Nombre : " + empleado1.Nombre);
        System.out.println("Edad : " + empleado1.Edad);
    }
}
