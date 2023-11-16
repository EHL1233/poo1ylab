package _p147_TercerExamenParcial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {

    public static ArrayList<Jugador> inicializarDatos() {
    ArrayList<Jugador> datos = new ArrayList<>();
    datos.add(new Jugador("Erling Haaland", 23, 'H', "Soltero", "Delantero", 1000));
    datos.add(new Jugador("Oliver Atom", 25, 'H', "Soltero", "Medio", 2000));
    datos.add(new Jugador("Benjamin Price", 21, 'H', "Casado", "Portero", 3000));
    datos.add(new Jugador("Alex Morgan", 34, 'M', "Casada", "Delantero", 4000));
    datos.add(new Jugador("Serena Williams", 42, 'M', "Casada", "Tenista", 5000));
    datos.add(new Jugador("Michael Obama", 25, 'M', "Soltera", "Presidenta", 9000));
    datos.add(new Jugador("Mamá coco", 89, 'M', "Soltera", "Abuelita", 9000));
    return datos;
    }
    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }
    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws
    IOException, ClassNotFoundException {
    ArrayList<Jugador> datos;
    FileInputStream arch = new FileInputStream(archivo);
    ObjectInputStream fpersonas = new ObjectInputStream(arch);
    datos = (ArrayList<Jugador>) fpersonas.readObject();
    fpersonas.close();
    return datos;
    }

    public static double calcularSalarioTotal(ArrayList<Jugador> jugadores) {
        double salarioTotal = 0.0;
        for (Jugador jugador : jugadores) {
            salarioTotal += jugador.getSalario();
        }
        return salarioTotal;
    }
    
    public static int calcularTotalHombres(ArrayList<Jugador> jugadores) {
        int hombres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'H') {
                hombres++;
            }
        }
        return hombres;
    }

    public static int calcularTotalMujeres(ArrayList<Jugador> jugadores) {
        int mujeres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'M') {
                mujeres++;
            }
        }
        return mujeres;
    }

    public static int calcularTotalCasados(ArrayList<Jugador> jugadores) {
        int casado = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getEstadoCivil().equals("Casado") || jugador.getEstadoCivil().equals("Casada")) {
                casado++;
            }
        }
        return casado;
    }

    public static int calcularTotalSolteros(ArrayList<Jugador> jugadores) {
        int soltero = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getEstadoCivil().equals("Soltero") || jugador.getEstadoCivil().equals("Soltera")) {
                soltero++;
            }
        }
        return soltero;
    }
    
}
