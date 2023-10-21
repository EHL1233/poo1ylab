package _p109_FormaV2;

public abstract class Forma {   // Clase Forma tipo abstract
    // Declara atributos de la clase padre
    private String Color;
    private boolean Relleno;

    public Forma(){}  // Constructor de la clase
    public Forma(String color, boolean relleno){  // Inicializa los atributos de la clase 
        Color=color;
        Relleno=relleno;
    }
    public String getColor() {  // Obtiene el valor 
        return Color;  // Retorna el valor
    }
    public void setColor(String color) {  // Establese el valor 
        Color = color;
    }
    public boolean isRelleno() {
        return Relleno;
    }
    public void setRelleno(boolean relleno) {
        Relleno = relleno;
    }

    public abstract double getArea();  // Metodo de la clase padre que puede sobrecribirse por sus herencias 

    public abstract double getPerimetro(); // Metodo de la clase padre que puede sobrecribirse por sus herencias 
 
    public String toString(){   // Metodo de la clase que retorna una cadena de texto
        return "[Forma [Color="+Color+", Relleno="+Relleno+"],";
    }
    
    
}
