package _p106_Persona;

public class Estudiante extends Persona {  // Clase estudiante que hereda de la clase persona
    // Atributos de la clase estudiante 
    private String Carrera;
    private int Año;
    private double Colegiatura;

    public Estudiante() {} // Constructor de la clase
    public Estudiante(String nombre, String direccion, String carrera, int año, double colegiatura) { // Encapsula los atrubutos 
        super(nombre, direccion); // LLama al constructor de la clase padre
        Carrera = carrera;
        Año = año;
        Colegiatura = colegiatura;
    }
    public Estudiante(Persona persona, String carrera, int año, double colegiatura) {
        super(persona.Nombre,persona.Direccion);  // LLama al contructor de la clase padre 
        Carrera = carrera;
        Año = año;
        Colegiatura = colegiatura;
    }
    public String getCarrera() {  // Obtiene el valor 
        return Carrera; // REtorna el valor 
    }
    public void setCarrera(String carrera) {  // Establese el valor 
        Carrera = carrera;
    }
    public int getAño() {
        return Año;
    }
    public void setAño(int año) {
        Año = año;
    }
    public double getColegiatura() {
        return Colegiatura;
    }
    public void setColegiatura(double colegiatura) {
        Colegiatura = colegiatura;
    }
    @Override
    public String toString() {  // Metodo de la clase que retorna una cadena de texto
        // super.toString se usa para llamar al metodo de la clase padre
        return "Estudiante [" +super.toString() + ", Carrera=" + Carrera + ", Año=" + Año + ", Colegiatura=" + Colegiatura + "]";
    }
}