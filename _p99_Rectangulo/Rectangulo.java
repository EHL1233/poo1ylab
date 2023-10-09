package _p99_Rectangulo;

public class Rectangulo {
    // Atributos de esta clase 
    private float Largo,Ancho;
    private float area,perimetro,hipotenusa;

    public Rectangulo() {}; // Constructor de la clase
    public Rectangulo(float largo, float ancho) {  // Inicializacion de la clase 
        this.Largo = largo;
        this.Ancho = ancho;
    }
    public float getLargo() {  // Optener Largo
        return Largo; // Retornar el Largo
    }
    public void setLargo(float largo) {  // Estableser Largo
        Largo = largo;
    }
    public float getAncho() {  // Optener Ancho
        return Ancho; // Retornar el Ancho
    }
    public void setAncho(float ancho) {  // Estableser Ancho
        Ancho = ancho;
    }

    public float getArea(){  // Metodo de la clase que calcula el area del Rectangulo
        area = (Largo*Ancho)/2;
        return area;  // Retornar area 
    }
    public float getPerimetro(){  // Metodo de la clase para calcular el perimetro
        hipotenusa = (float) Math.sqrt(Math.pow((Largo/2), 2)+Math.pow(Ancho, 2)); 
        perimetro=hipotenusa+Largo+Ancho; // Retornar perimetro
        return perimetro;
    }
    public String toString() { // Metodo de la clase que retorna una cadena de texto
        return String.format("Rectangulo [Largo=%.2f, Ancho=%.2f]",Largo,Ancho);
    }
}
