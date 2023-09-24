// Imprime un cuadro de r x c del caracter especificado con funciones 

import java.util.Scanner;

public class _p74_CuadroCaracter {
    public static void Cuadro(int ren, int col, char car) {  // Funcion para imprimir la matriz con una caracter 
        for(int i=1;i<=ren;i++) {    // Ciclo for para imprimir los renglones 
            for(int j=1;j<=col;j++)     // Ciclo for para imprimir las columnas con caracteres 
                System.out.printf("%c ",car);
            System.out.println();
        }
    }
    public static void main(String[] args) {  // Funcion principal
        int ren, col;  // Variables locales 
        char car;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola 
        // Pedir y asignar datos 
        System.out.print("Renglones ? "); ren = obj.nextInt();
        System.out.print("Columnas ? "); col = obj.nextInt();
        System.out.print("Caracter ? "); car = Character.toUpperCase(obj.next().charAt(0));
        Cuadro(ren,col,car); // LLamar a la funcion con paso de parametros 
    }
}
