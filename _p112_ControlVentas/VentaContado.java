package _p112_ControlVentas;

public class VentaContado extends Venta{   // Clase que hereda atributos 
    // Atributos de esta clase 
    private double Descuento;
    private String Regalo;
    
    public VentaContado(String articulo, double cantidad, double precio, double descuento, String regalo) { // Constructor de la clase
        super(articulo, cantidad, precio); // LLAma al constructor de la clase padre 
        Descuento = descuento;
        Regalo = regalo;
    }

    // Metodos gets y sets de todos atributos de la clase 
    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double descuento) {
        Descuento = descuento;
    }

    public String getRegalo() {
        return Regalo;
    }

    public void setRegalo(String regalo) {
        Regalo = regalo;
    }

    @Override
    public double getTotalVenta(){ // Metodo sobrescrito que calcula el total de la venta 
        return super.getTotal()-(super.getTotal()*(Descuento/100));
    }

    @Override
    public String toString(){  // Metodo de la clase que retorna una cadena de texto
        return "VentaContado ["+super.toString()+"Descuento= "+Descuento+"%, Regalo= "+Regalo+", Total= "+this.getTotalVenta()+"]";
    }
}
