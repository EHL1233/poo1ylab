package _p101_TrabajoPersona;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();  // Instaciar un objeto de tipo Persona y reservar espacio en memoria 
        Trabajo trabajo = new Trabajo();   // Instaciar un objeto de tipo Trabajo y reservar espacio en memoria
        trabajo.setId(1);  // Estableser Id del trbajo
        trabajo.setRol("Piloto_del_Eva01");  // Estableser el Rol del trabajo
        trabajo.setSalario(200);  // Estableser el Salario de trabajo
        persona1.setNombre("Shinji Ikari");  // Estableser Nombre de persona1
        persona1.setTrabajo(trabajo);   // Estableser el Trabajo de persona1
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        System.out.println(persona1); // Imprimir llamando al objeto persona1
        // Instacia una persona y inicializa sus atributos 
        Persona persona2 = new Persona("Asuka Sōryū", new Trabajo(2, "Piloto_del_Eva02", 2500));
        System.out.println(persona2); // Imprime llamando al objeto persona2
    }
}