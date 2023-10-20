package _p104_PuntoCirculo;

public class Punto {  // Clase Punto
    // Declara los atributos de la clase Punto
    private int X;
    private int Y;

    public Punto(){} // Constructor de la clase 
    public Punto(int x, int y){  // Encapsula los atributos 
        X=x;
        Y=y;
    }
    public int getX() {  // Obtiene a X
        return X; // Retorna a X
    }
    public void setX(int x) {  // Establese a X
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }

    public double getDistancia(Punto punto){  // Metodo que calcula la distancia entre puntos  
        return Math.sqrt(Math.pow(X - punto.X,2)+(Math.pow(Y - punto.Y,2 ))); // Retona el calculo
    }

    @Override
    public String toString() { // Metodo que retorna una cadena de texto
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
}
