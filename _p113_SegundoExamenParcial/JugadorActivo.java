package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador{
    private int Partidos;
    private int Goles;
    

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
    }


    public int getPartidos() {
        return Partidos;
    }


    public void setPartidos(int partidos) {
        Partidos = partidos;
    }


    public int getGoles() {
        return Goles;
    }


    public void setGoles(int goles) {
        Goles = goles;
    }

    @Override
    public double getBono(){
        return (super.getSalario()*0.10)+(Partidos*50)+(Goles*5);
    }
    @Override
    public double getTotal(){
        double Total=0.0;
        Total=(super.getSalario()+getBono());
        return Total;
    }
    
    @Override
    public String toString(){
        return "- JugadorActivo "+super.toString()+"Partidos="+Partidos+", Goles="+Goles+", Bono="+getBono()+", Total="+getTotal()+"]";
    }
}
