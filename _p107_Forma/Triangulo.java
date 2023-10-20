package _p107_Forma;

public class Triangulo extends Forma {  // Clase Trinagulo que hereda de la clase Forma 
    // Atributos de la clase triangulo
    private double Base;
    private double Altura;
    public Triangulo(String color, double base, double altura) { // Encapsula los atributos de la clase 
        super(color); // Llama al constructor de la clase padre 
        Base = base;
        Altura = altura;
    }
    public double getBase() {  // Obetiene el valor
        return Base; // Retorna el valor 
    }
    public void setBase(double base) { // Establese el valor 
        Base = base;
    }
    public double getAltura() {
        return Altura;
    }
    public void setAltura(double altura) {
        Altura = altura;
    }
    @Override  // Metodo de la clase que se sobrescribe de la clase padre 
    public double getArea() { // Metod para calcular el area de un triangulo
        return (Base * Altura) / 2;  // Retorna el valor 
    }
    @Override
    public String toString() {  // Metodo que retorna una cadena de texto 
        // El metodo super.getColor es para llamar el metodo de la clase padre 
        return "Triangulo [Color="+super.getColor()+", Base=" + Base + ", Altura=" + Altura + "]";
    }
}