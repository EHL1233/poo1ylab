package _p107_Forma;

public abstract class Forma {  // Clase Forma que hereda pero no se instancia
    // Atributos de la clase 
    private String Color;
    public Forma(String color) { // Encapsula los atributos de la clase 
        Color = color;
    }
    public String getColor() {  // Obtiene el valor 
        return Color;   // REtorna el valor 
    }
    public void setColor(String color) { // Establese el valor 
        Color = color;
    }
    public abstract double getArea();  // Metodo que se pede sobrescribir 
}
