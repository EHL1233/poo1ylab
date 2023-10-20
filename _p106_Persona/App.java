package _p106_Persona;

public class App {  // Clase que ejecuta
    public static void main(String[] args) {   // Funcion principal
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola

        Persona p1 = new Persona("Juan Perez", "Av Mexico 114");  // Intanciar un objeto y de tipo persona y inicializar sus atributos 
        Persona p2 = new Persona("Alma Gonzalez","Primera de los Bolos 234l");
        Estudiante estudiante = new Estudiante(p1, "Sistemas", 2018, 1200); // Intanciar un objeto de tipo estudiante y inicializa sus atributos con una composicion
        Apoyo apoyo = new Apoyo(p2,"Licenciatura",1300); // Intanciar un objeto de tipo apoyo y inicializa sus atributos con una composicion
        Apoyo apoyo2 = new Apoyo(new Persona("Sra Tere", "Sierra Madre 22"), "Secundaria", 1000);
        System.out.println(estudiante); // Imprime lo que retorna el objeto estudiante
        // Imprime lo que retorne cada metodo del objeto estudiante
        System.out.println("Nombre: : " + estudiante.getNombre());
        System.out.println("Direccion : " + estudiante.getDireccion());
        System.out.println("Carrera : " + estudiante.getCarrera());
        System.out.println("Año : " + estudiante.getAño());
        System.out.println("Colegiatura : " + estudiante.getColegiatura());
        System.out.println(apoyo); // Imprime lo que retorna el objeto estudiante
        // Imprime lo que retorna el objeto apoyo
        System.out.println("Nombre: : " + apoyo.getNombre());
        System.out.println("Direccion : " + apoyo.getDireccion());
        System.out.println("Escolaridad : " + apoyo.getEscolaridad());
        System.out.println("Paga : " + apoyo.getPaga());
        System.out.println(apoyo2); // Imprime lo que retorna el objeto estudiante 
        // Imprime lo que retorna el objeto apoyo
        System.out.println("Nombre: : " + apoyo2.getNombre());
        System.out.println("Direccion : " + apoyo2.getDireccion());
        System.out.println("Escolaridad : " + apoyo2.getEscolaridad());
        System.out.println("Paga : " + apoyo2.getPaga());
    }
}
