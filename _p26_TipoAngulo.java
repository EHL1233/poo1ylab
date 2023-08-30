// Muestra el tipo de angulo según los grados
import java.util.Scanner;

public class _p26_TipoAngulo {
    public static void main(String[] args) {
        // Borrar datos de la consola
        System.out.print("\033[H\033[2J"); System.out.flush();

        // Pedir y asignar valor a la variable
        System.out.println("Muestra el tipo de ángulo según los grados introducidos \n");
        System.out.print("Dame un ángulo entre 0 y 360 grados? ");
        int angulo = new Scanner(System.in).nextInt();

        // Codiciones
        if(angulo >= 361 || angulo <=0)
            System.out.println("El valor introducido no esta permitido");
        else
            System.out.print("El ángulo que introdujiste: ");
            if(angulo<90 && angulo >0)
                System.out.println("Es agudo");

            if(angulo==90)
                System.out.println("Es recto");

            if(angulo>90 && angulo<180)
                System.out.println("Es obtuso");

            if(angulo==180)
                System.out.println("Es llano");

            if(angulo>180 && angulo<360)
                System.out.println("Es concavo");

            if(angulo==360)
                System.out.println("Es completo");
        
        // Imprimir en consola
        System.out.println("\nProceso terminado ....");
    }
}
