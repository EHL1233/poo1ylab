package _p108_Vehiculo;

public class Vehiculo {   // Clase Vehiculo
    // DEclara los atributos de la clase padre 
    protected String Serie;
    protected String Marca;
    protected int Año;
    protected double Precio;

    public Vehiculo(){} // Cosntructor de la clase 
    public Vehiculo(String serie, String marca, int año, double precio){  // Inicializa los atributos de la clase 
        Serie=serie;
        Marca=marca;
        Año=año;
        Precio=precio;
    }
    public String getSerie() {   // Obtiene el valor 
        return Serie;  // Retorna el valor 
    }
    public void setSerie(String serie) {  // Establese el valor 
        Serie = serie;  
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public int getAño() {
        return Año;
    }
    public void setAño(int año) {
        Año = año;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String toString(){   // Metodo de la clase que retorna una cadena de texto 
        return "[Vehiculo [Serie="+Serie+", Marca="+Marca+", Año="+Año+", Precio="+Precio+"],";
    }
    
}
