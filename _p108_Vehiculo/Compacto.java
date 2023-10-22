package _p108_Vehiculo;

public class Compacto extends Vehiculo {  // Clase Compacto que hereda de la clase Vehiculo 
    // DEclara los atributos de la clase Compacto
    private int Pasajeros;
    private int Puertas;

    public Compacto(){}  // Constructor de la clase 
    public Compacto(Vehiculo vehiculo, int pasajeros, int puertas){  // Constructor de la clase 
        super(vehiculo.Serie, vehiculo.Marca, vehiculo.Año, vehiculo.Precio);  // LLama al constructor de la clase padre 
        Pasajeros=pasajeros;
        Puertas=puertas;
    }
    public int getPasajeros() {   // Obtiene el valor 
        return Pasajeros;  // REtorna el valor 
    }
    public void setPasajeros(int pasajeros) { // Establese el valor 
        Pasajeros = pasajeros;
    }
    public int getPuertas() {
        return Puertas;
    }
    public void setPuerta(int puertas) {
        Puertas = puertas;
    }

    public String toString(){   // Metodo de la clase que retorna una cadena de texto 
        // El metodo super.toString es para llamar el metodo de la clase padre 
        return "Compacto  "+super.toString()+" Pasajeros="+Pasajeros+", Puertas="+Puertas+"]";
    }
    
}
