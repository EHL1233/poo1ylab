// Programa con dos funciones una que convierta pulgadas a centímetros y otra que convierta de metros a
// pies. Deberá́ mostrar un menú́ con las opciones correspondientes.

import java.util.Scanner;

public class _p77_MedidasLongitud {
    public static void metro_pies(float n) {     // Funcion para convertir metros a pies con paso de parametros 
        System.out.printf("La convercion de %.2fm es %.2fft",n,n*3.281); // imprimir en consola con paso de parametros 
    }
    public static void pulgadas_centrimetros(float n) {   // Funcion para convertir pulgadas a centimetros con paso de parametros
        System.out.printf("La convercion de %.2fin es %.2fcm",n,n*2.54); // Imprimir en consola con paso de parametros 
    }
    public static void main(String[] args) {  // Funcion principal 
        int op;
        float n;  // Variables locales 
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola 
        // Ciclo do while para que el usuario ingrese el valor correcto
        do{
            System.out.println("Dime que opcion quieres");
            System.out.println("------------------------");
            System.out.println("Convertir de metros a pies [1] ");
            System.out.println("Convertir de pulgadas a centimetros [2] ");
            op = obj.nextInt();
        }while(op!=1 && op!=2);

        // Condicion if para llamar a la funcion segun corresponda la opcion
        if (op==1){
            System.out.print("Dime cuantos metros quieres que convierta ");
            n = obj.nextFloat();
            metro_pies(n);  // LLamar a la funcion con pasando un parametro
        }
        else{
            System.out.print("Dime cuantas pulgadas quieres que convierta ");
            n = obj.nextFloat();
            pulgadas_centrimetros(n); // LLamando a la funcion pasando un parametro
        }
        System.out.println("\nFin del programa.............");

    }
}
