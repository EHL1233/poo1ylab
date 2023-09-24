// Programa con una función que pida 4 números enteros y devuelva el menor de ellos.
import java.util.Scanner;

public class _p75_NumeroMenor {
    public static void elmenor(int n1, int n2, int n3, int n4) {  // Funcion para determinar cual es el numero menor y imprimir este
        System.out.println("\n"); 
        // Condicion de if para determinar cual es el menor de todos los numeros 
        if (n1<n2 && n1<n3 && n1<n4){ 
            System.out.printf("El numero menor es: %d",n1);
        }
        else if (n2<n1 && n2<n3 && n2<n4){
            System.out.printf("El numero menor es: %d",n2);
        }
        else if (n3<n1 && n3<n2 && n3<n4){
            System.out.printf("El numero menor es: %d",n3);
        }
        else{
            System.out.printf("El numero menor es: %d",n4);
        }
    }
    public static void main(String[] args) {  // Funcion principal
        int n1,n2,n3,n4;  // Variables locales 
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola 

        // Pedir y asignar valores 
        System.out.print("Dame el primer termino ");
        n1 = obj.nextInt();
        System.out.print("\nDame el segundo termino ");
        n2 = obj.nextInt();
        System.out.print("\nDame el tercer termino ");
        n3 = obj.nextInt();
        System.out.print("\nDame el cuarto termino ");
        n4 = obj.nextInt();
        elmenor(n1, n2, n3, n4);  // LLamar a la funcion pasando parametros 
        System.out.print("\nFin del programa.........");  // Imprimir en consola 
    }
}
