package _p109_FormaV2;

public class Circulo extends Forma {   // Clase Circulo que hereda de la clase Forma 
    // Declara atributo de la clase 
    private double Radio;

    public Circulo(){}  // Constructor de la clase 
    public Circulo(String color, boolean relleno, double radio){  // Inicaializa los atributos de la clase 
        super(color, relleno);  // LLAma al constructor de la clase padre
        Radio=radio;
    }
    public double getRadio() {  // Obtiene el valor 
        return Radio; // retorna el valor 
    }
    public void setRadio(double radio) { // Establese el valor 
        Radio = radio;
    }
    @Override  // Sobre escribe el metodo de la clase padre 
    public double getArea() {   // Metodo para calcula el area de un circulo
        return Math.PI * Math.pow(Radio, 2); // Retorna el valor 
    }
    @Override  // Sobre escribe el metodo de la clase padre 
    public double getPerimetro(){ // Metodo para calcular el perimetro de un circulo
        return 2*Math.PI*Radio; // REtorna el perimetro
    }
    @Override 
    public String toString() { // Metodo que retorna una cadena de texto
        // El metodo super.toString es para llamar el metodo de la clase padre 
        return "Circulo  "+super.toString()+" Radio="+Radio+"]";
    }
}
