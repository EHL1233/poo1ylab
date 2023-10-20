package _p105_PuntoTriangulo;

public class Triangulo {  // Clase triangulo 
    // Declara los atributos para esta clase
    private Punto V1;
    private Punto V2;
    private Punto V3;
    private double perimetro;

    public Triangulo(){} // Constructor de la clase
    public Triangulo(Punto v1, Punto v2, Punto v3){ // Encapsula los atributos de la clase
        V1=v1;
        V2=v2;
        V3=v3;
    }
    public Punto getV1() {  // Obtiene la V1 con la compocion con la clase Punto
        return V1; // REtorna el valor 
    }
    public void setV1(Punto v1) { // Establese el valor 
        V1 = v1;
    }
    public Punto getV2() {
        return V2;
    }
    public void setV2(Punto v2) {
        V2 = v2;
    }
    public Punto getV3() {
        return V3;
    }
    public void setV3(Punto v3) {
        V3 = v3;
    }

    public double getPerimetro(){  //  Metodo que calcula el valor del perimetri
        perimetro = V1.getDistancia(V2) + V2.getDistancia(V3) + V3.getDistancia(V1);
        return perimetro; // REtorna el valor
    }

    public String getTipo(){ // Metodo que define que tipo de trinagulo se trata
        // Define varibles de esta funcion
        double lado1 = V1.getDistancia(V2);
        double lado2 = V2.getDistancia(V3);
        double lado3 = V3.getDistancia(V1);

        if (lado1 == lado2 && lado2 == lado3) {  // Condicion if para comparar triangulos
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public String toString(){ // Metodo que retorna una cadena de texto
        return "Triangulo [V1="+V1+", V2="+V2+", V3="+V3+"]";
    }
}
