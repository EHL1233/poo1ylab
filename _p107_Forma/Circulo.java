package _p107_Forma;

public class Circulo extends Forma {  // Clase circulo que hereda de la clase Forma 
    // Atributos de la clase 
    private double Radio;

    public Circulo(String color, double radio) { // Encampsula los atributos 
        super(color); // LLama al constructor de la clase padre 
        Radio = radio; 
    }
    public double getRadio() { // Obtiene el valor 
        return Radio;  // REtorna el valor 
    }
    public void setRadio(double radio) { // Establese el valor 
        Radio = radio;
    }

    @Override  // Sobre escribe el metodo de la clase padre 
    public double getArea() {   // Metodo para calcula el area de un circulo
        return Math.PI * Math.pow(Radio, 2); // Retorna el valor 
    }
    @Override 
    public String toString() { // Metodo que retorna una cadena de texto
        return "Circulo [Color=" +super.getColor() + ",Radio=" + Radio + "]"; // super.getColor para llamar el metodo de la clase padre 
    }
}