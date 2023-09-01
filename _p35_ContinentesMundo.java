// Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre: 1 Asia, 2 África,
// 3 América del Norte, 4 América del Sur, 5 Antártida, 6 Europa. Si el número no está en el rango especificado, mostrar
// un mensaje de error.

import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        char op;
        Scanner entrada = new Scanner(System.in);

        // Borrar datos de la consola
        System.out.print("\033[H\033[2J");System.out.flush();

        // Pedir y asignar datos 
        System.out.println("Dame un numero y te dire un Continete");
        System.out.println("--------------------------------------\n");
        System.out.print("Dame un número del 1 al 6 \n");
        op = entrada.next().charAt(0);

        // Condicion
        switch (op) {
        case '1':
            System.out.println("El continente es Asia");
            break;
        case '2':
            System.out.println("El continente es África");
            break;
        case '3':
            System.out.println("El continente es América del Norte");
            break;
        case '4':
            System.out.println("El continente es América del Sur");
            break;
        case '5':
            System.out.println("El continente es Antartida");
            break;
        case '6':
            System.out.println("El continente es Europa");
            break;
        default:
            System.out.println("\nNumero introducido no es valido ...");
            break;
        }

        // Imprimir en cosola 
        System.out.println("Finalizacion del programa............");
    }
}
