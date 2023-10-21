package _p109_FormaV2;

public class Rectangulo extends Forma {   // Clase Rectangulo que hereda de la clase Forma
    // Declara atributos de la clase 
    private double Largo;
    private double Ancho;

    public Rectangulo(){} // Constructor de la clase  
    public Rectangulo(String color, boolean relleno, double largo, double ancho){  // Inicializa los atributos de la clase 
        super(color, relleno);  // LLAma al constructor de la clase padre 
        Largo=largo;
        Ancho=ancho;
    }
    public double getLargo() {  // Obtiene el valor 
        return Largo;  // Retorna el valor
    }
    public void setLargo(double largo) {  // Estable el valor 
        Largo = largo;
    }
    public double getAncho() {
        return Ancho;
    }
    public void setAncho(double ancho) {
        Ancho = ancho;
    }
    @Override  // Metodo de la clase que se sobrescribe de la clase padre 
    public double getArea() { // Metodo para calcular el area de un Rectangulo
        return Largo * Ancho;  // Retorna el valor 
    }
    @Override // Metodo de la clase que se sobrescribe de la clase padre 
    public double getPerimetro(){ // Metodo para calcular el perimetro de un rectangulo
        return 2*(Largo+Ancho); // Retorna el valor 
    }
    @Override
    public String toString() {  // Metodo que retorna una cadena de texto 
        // El metodo super.toString es para llamar el metodo de la clase padre 
        return "Rectangulo  "+super.toString()+" Largo="+Largo+", Ancho="+Ancho+"]";
    }

}
