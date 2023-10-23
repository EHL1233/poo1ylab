package _p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador{
    private int Subordinados;
    private int Proyectos;
    
    
    
    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
    }

    public int getSubordinados() {
        return Subordinados;
    }


    public void setSubordinados(int subordinados) {
        Subordinados = subordinados;
    }


    public int getProyectos() {
        return Proyectos;
    }


    public void setProyectos(int proyectos) {
        Proyectos = proyectos;
    }

    
    @Override
    public double getBono(){
        return (super.getSalario()*0.15)+(Proyectos*100)+(Subordinados*10);
    }

    @Override
    public double getTotal(){
        double Total=0.0;
        Total=(super.getSalario()+getBono());
        return Total;
    }
    
    @Override
    public String toString(){
        return "- JugadorEntrenador "+super.toString()+"Subordinados="+Subordinados+", Proyectos="+Proyectos+", Bono="+getBono()+", Total="+getTotal()+"]";
    }

}
