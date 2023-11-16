package _p145_EstudianteGUI_V1;

import java.util.ArrayList;

public class Util {
    public static ArrayList<Estudiante> inicializarDatos() {
    ArrayList<Estudiante> datos = new ArrayList<>();
        datos.add(new Estudiante("Shinji Ikari",16,49.6,"eldepresivo@gmail.com"));
        datos.add(new Estudiante("Eren Jegar",17,58.9,"elpalomo@gmail.com"));
        datos.add(new Estudiante("Elon Musk",58,72.45,"elcohetes@xpacex.com"));
        return datos;
    }
}
