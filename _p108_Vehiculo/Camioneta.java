package _p108_Vehiculo;

public class Camioneta extends Vehiculo{  // Clase Camioneta que hereda de la clase Vehiculo
    // Declara los atributos de la clase 
    private double Capcidad;
    private int Ejes;

    public Camioneta(){}  // Constructor de la clase
    public Camioneta(String serie, String marca, int año, double precio, double capacidad, int ejes){ // inicializa los atributos 
        super(serie, marca, año, precio);  // LLama al constructor de la clase padre 
        Capcidad=capacidad;
        Ejes=ejes;
    }
    public Camioneta(Vehiculo vehiculo, double capacidad, int ejes){  // Consructor de la clase 
        super(vehiculo.Serie, vehiculo.Marca, vehiculo.Año, vehiculo.Precio); // LLama al constructor de la clase padre 
        Capcidad=capacidad;
        Ejes=ejes;
    }
    public double getCapcidad() {  // Obtiene el valor 
        return Capcidad;  // REtorna el valor 
    }
    public void setCapcidad(double capcidad) { // Establese el valor 
        Capcidad = capcidad;
    }
    public int getEjes() {
        return Ejes;
    }
    public void setEjes(int ejes) {
        Ejes = ejes;
    }

    public String toString(){   // Metodo de la clase que retorna una cadena de texto
        // El metodo super.toString es para llamar el metodo de la clase padre 
        return "Camioneta  "+super.toString()+" Capacidad="+Capcidad+", Ejes="+Ejes+"]";
    }
}
