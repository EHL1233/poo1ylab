package _p104_PuntoCirculo;

public class Circulo {  // Clase Circulo
    // Declara los atributos de la clase circulo
    private Punto Centro;
    private double Radio;
    private double area;
    private double circunferencia;

    public Circulo(){}  // Constructor de la clase
    public Circulo(Punto centro, double radio){ // Encapsula los atributos 
        Centro=centro;
        Radio=radio;
    }
    public Punto getCentro() {  // Obtiene el centro como composicion
        return Centro; // Retorna el centro
    }
    public void setCentro(Punto centro) {  // Establese el centro 
        Centro = centro;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    
    public double getArea(){   // Metodo que realiza el calculo del area de un circulo
        area = Math.PI*Math.pow(Radio,2);
        return area;
    }

    public double getCircunferencia(){  // Metodo que realiza el calculo de la circunferencia de un circulo
        circunferencia = 2*Math.PI*Radio;
        return circunferencia;  // Retorna el valor de circunferencia
    }

    @Override
    public String toString() { // Metodo de la clase que retorna una cadena de texto
        return "Circulo [Centro=" + Centro + ", Radio=" + Radio + "]";
    }
}
