package _p98_Circulo;

public class Circulo {    // Clase circulo 
    // Atributos de la clase circulo privados 
    private double Radio;
    private double area,circunferencia;

    public Circulo() {}; // Constructor de la clase 
    public Circulo(double radio) {  // Inicializacion de la clase 
        this.Radio = radio;
    }
    public double getRadio() {  // Optener radio
        return Radio; // Retornar el radio
    }
    public void setRadio(double radio) {  // Estableser radio
        Radio = radio;
    }
    public double getArea(){  // Metodo de la clase que calcula el area del circulo
        area = (Radio*Radio)*Math.PI;
        return area;  // Retornar area 
    }
    public double getCircunferencia(){  // Metodo de la clase para calcular la circunferencia
        circunferencia = Radio*(Math.PI*2); 
        return circunferencia; // Retornar circunferencia
    }
    public String toString() { // Metodo de la clase que retorna una cadena de texto
        return String.format("Circulo [Radio=%.2f]",Radio);
    }
}
