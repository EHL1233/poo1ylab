package _p112_ControlVentas;

public class VentaCredito extends Venta{   // Clase que hereda
    // Atributos de esta clase 
    private int Meses;
    private double Interes;

    public VentaCredito(String articulo, double cantidad, double precio, int meses, double interes) { // Constructor de la clase 
        super(articulo, cantidad, precio); // LLama al constructor de la clase padre
        Meses = meses;
        Interes = interes;
    }

    // Metodos gets y sets de los atributos 
    public int getMeses() {
        return Meses;
    }

    public void setMeses(int meses) {
        Meses = meses;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double interes) {
        Interes = interes;
    }

    @Override
    public double getTotalVenta(){  // Metodo sobrescrito que calcula el total de ventas 
        return (Meses*(Interes/100.0)*super.getTotal())+super.getTotal();
    }
    
    @Override
    public String toString(){ // Metodo de la clase que retorna una cadena de texto
        return "VentaCredito ["+super.toString()+"Meses= "+Meses+", Interes= "+Interes+"%, TotalVenta= "+this.getTotalVenta()+"]";
    }
}
