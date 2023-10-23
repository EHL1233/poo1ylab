package _p112_ControlVentas;

public abstract class Venta {    // Clase venta que hereda a otras clases 
    // Atributos de la clase 
    private String Articulo;
    private double Cantidad;
    private double Precio;
    protected double Total;

    public Venta(String articulo, double cantidad, double precio) {  // Constructor de la clase 
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
    }

    // Metodos gets y sets para cada atributo
    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String articulo) {
        Articulo = articulo;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public double getTotal() {   // Metodo para obtener el total de la venta individual
        Total= Cantidad*Precio;
        return Total;
    }
    public abstract double getTotalVenta();  // Metodo que se puede sobreescribir por las herencias de la clase 
    
    public String toString(){ // Metodo que retorna una cadena de texto
        return "Venta  [Articulo= "+Articulo+", Cantidad= "+Cantidad+", Precio= "+Precio+", Total= "+Total+"], ";
    }
}
