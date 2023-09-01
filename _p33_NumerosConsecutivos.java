//Dados tres números enteros, verificar si son consecutivos (9,10,11) y mandar mensaje confirmándolo, si no lo son (1,4,6) mandar mensaje de error.
import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        // Borrar datos de la consola
        System.out.print("\033[H\033[2J");System.out.flush();

        // Declarar variables
        int n1=0, n2=0, n3=0;
        Scanner entrada = new Scanner(System.in);
        
        // Pedir y asignar valores
        System.out.println("Dame tres valores y te dire si estos son consecutivos (solo puedes introducir número enteros)");
        System.out.println("NOTA: no importa en que orden igreses los numeros");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Dame el primer valor : ");
        n1 =entrada.nextInt();
        System.out.println("Dame el segundo valor : ");
        n2 =entrada.nextInt();
        System.out.println("Dame el tercer valor : ");
        n3 =entrada.nextInt();

        // Condiciones
        if(((n1>n2 && n1<n3) || (n1>n3 && n1<n2)) && ((n1-1==n2 && n1+1==n3) || (n1-1==n3 && n1+1==n2))){
            System.out.println("Los numeros que introdugiste SI son consecutivos");
        }
        else if(((n2>n1 && n2<n3) || (n2>n3 && n2<n1)) && ((n2-1==n1 && n2+1==n3) || (n2-1==n3 && n2+1==n1))){
            System.out.println("Los numeros que introdugiste SI son consecutivos");
        }
        else if(((n3>n1 && n3<n2) || (n3>n2 && n3<n1)) && ((n3-1==n2 && n3+1==n1) || (n3-1==n1 && n3+1==n2))){
            System.out.println("Los numeros que introdugiste SI son consecutivos");
        }
        else{
            System.out.println("Los numeros que introdugiste NO son consecutivos");
        }

        // Imprimir en consola
        System.out.println("Finalizo el programa............");
    }
}