package _p97_Empleado04;

import java.util.ArrayList;

public class Empleado {
    // Atributos de la clase permanecen en privado
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean Casado;

    public Empleado() {};  // Constructor por defecto de la clase empleado
    public Empleado(String nombre,int edad,char sexo,boolean casado) {  // Inicializa los atributos 
        this.Nombre = nombre; this.Edad = edad;
        this.Sexo = sexo; this.Casado = casado;
    }
    public String getNombre() {  // Obtener nombre
        return Nombre; // Retorna el nombre 
    }
    public int getEdad() { // Obtine edad
        return Edad;   // REtorna la edad
    }
    public char getSexo() {   // Obtiene el sexo
        return Sexo;  // Retorna el sexo
    }
    public boolean getCasado() {  // Obtiene verdadero/falso
        return Casado;  // Retorna el valor 
    }
    public String toString() { // Retorna una cadena de texto
        // Los if de corto circuito son para definir que atributo corresponde dependiendo del lo obtenido
        return String.format("Nombre: %s, Edad: %d, Sexo: %s, Casado:%s", Nombre, Edad,(Sexo == 'M' ? "Mujer" : "Hombre"), (Casado ? "Casado" : "No Casado"));
    }
}
