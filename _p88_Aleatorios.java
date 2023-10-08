// Genera números aleatorios

import java.util.Random;  // Importar libreria para numeros aleatorios 

public class _p88_Aleatorios {
    public static void main(String[] args) {
        Random rnd = new Random();    // Creando un objeto de tipo aleatoreo
        // Declarar variables e inicializar con un numero ramdon
        int aleatorio1 = Math.abs(rnd.nextInt());
        int aleatorio2 = Math.abs(rnd.nextInt(30));
        int aleatorio3 = Math.abs(rnd.nextInt(100-50))+50;
        System.out.print("\033[H\033[2J");System.out.flush(); // Borrar datos de la consola 
        // Imprimir en consola los numero aleatoreos 
        System.out.printf("\nNúmero aleatorio entero positivo : %d", aleatorio1);
        System.out.printf("\nNúmero aleatorio 0 ..30 : %d", aleatorio2);
        System.out.printf("\nNúmero aleatorio en el rango de 50 a 99 : %d", aleatorio3);
    }
}
