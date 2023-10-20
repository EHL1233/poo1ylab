package _p106_Persona;

public class Apoyo extends Persona {  // la clase Apoyo hereda de la clase Persona
    // Declara atributos de la clase Apoyo
    private String Escolaridad;
    private double Paga;

    public Apoyo() {}  // Constructor de esta clase 
    public Apoyo(String nombre, String direccion, String escolaridad, double paga) {  // Encapsula los atributos de la clase
        super(nombre, direccion);  // LLama al contructor de la clase padre 
        Escolaridad = escolaridad;
        Paga = paga;
    }
    public Apoyo(Persona persona, String escolaridad, double paga) {
        super(persona.Nombre, persona.Direccion);  // Llama al contructor de la clase padre
        Escolaridad = escolaridad;
        Paga = paga;
    }
    public String getEscolaridad() {    // Obtiene el valor del atributo 
        return Escolaridad; // REtorna el valor 
    }
    public void setEscolaridad(String escolaridad) {
        Escolaridad = escolaridad;
    }
    public double getPaga() {
        return Paga;
    }
    public void setPaga(double paga) {
        Paga = paga;
    }
    @Override
    public String toString() {  // Metodo que retorna una cadena de texto
        // super.toString se usa para llamar al metodo de la clase padre
        return "Apoyo [" + super.toString() + ", Escolaridad=" + Escolaridad + ", Paga=" + Paga + "]";
    }
}
