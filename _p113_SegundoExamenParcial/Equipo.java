package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo(){
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        this();
        Nombre = nombre;
        Liga = liga;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getLiga() {
        return Liga;
    }

    public void setLiga(String liga) {
        Liga = liga;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void agregarJugadores(Jugador jugadores) {
        Jugadores.add(jugadores);
    }

    public double getTotalBono(){
        double totalBono=0.0;
        for(Jugador jugadores : Jugadores){
            totalBono += jugadores.getBono();
        }
        return totalBono;
    }

    public double getTotal(){
        double totalTotales=0.0;
        for(Jugador jugadores : Jugadores){
            totalTotales += jugadores.getTotal();
        }
        return totalTotales;
    }

    public int getTotalH(){
        int hombre =0;
        for(Jugador jugadores : Jugadores){
            if(jugadores.getSexo() == 'H'){
                hombre++;
            }
        }
        return hombre;
    }
    public int getTotalM(){
        int mujeres =0;
        for(Jugador jugadores : Jugadores){
            if(jugadores.getSexo() == 'M'){
                mujeres++;
            }
        }
        return mujeres;
    }

    public void reporte(){
        for(Jugador jugadores: Jugadores){
            System.out.println("");
            System.out.println(jugadores);
        }
    }

    @Override
    public String toString(){
        return ">> Equipo [Nombre= "+Nombre+", Liga= "+Liga+", Jugadores="+Jugadores.size()+", Bono= "+getTotalBono()+", Total= "+getTotal()+", Hombre= "+getTotalH()+", Mujeres= "+getTotalM()+"]";
    }
    
}
