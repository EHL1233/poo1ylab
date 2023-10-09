package _p100_Articulo;

public class Articulo {
    // Atributos de la clase
    private String Id;
    private String Desc;
    private int Cant;
    private double PrecioUnit;
    private double total;  // Variable local

    public Articulo() {}; // Constructor de la clase
    public Articulo(String id, String desc,int cant, double preciounit) {  // Inicializacion de la clase 
        this.Id = id;
        this.Desc = desc;
        this.Cant = cant;
        this.PrecioUnit = preciounit;
    }
    public String getId() {  // Optener Id
        return Id; // Retornar el Id
    }
    public String getDesc() {  // Optener Desc
        return Desc; // Retornar el Desc
    }
    public int getCant() {  // Optener Cant
        return Cant; // Retornar el Cant
    }
    public void setCant(int cant) {  // Estableser Cant
        Cant = cant;
    }
    public double getPrecioUnit() {  // Optener PrecioUnit
        return PrecioUnit; // Retornar el PrecioUnit
    }
    public void setPrecioUnit(double preciounit) {  // Establese PrecioUnit
        PrecioUnit = preciounit;
    }
    public double getTotal(){   // Metodo para calcular el total
        total=Cant*PrecioUnit;
        return total; // Retornar el total
    }
    public String toString() { // Metodo de la clase que retorna una cadena de texto
        return String.format("Articulo [Id=%s, Desc=%s, Cant=%d, PrecioUnit=%.2f]",Id,Desc,Cant,PrecioUnit);
    }

}
