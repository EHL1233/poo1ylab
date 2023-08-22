// Calcula el area de un circulo

import java.util.Scanner;

public class _p02_AreaCirculo{
    public static void main(String[] args) {
        // Declarar variables
        double radio,area;

        // Definir entrada 
        Scanner entrada = new Scanner(System.in);

        // Pedir y asignar datos 
        System.out.print("Dame el radio del circulo: ");
        radio = entrada.nextFloat();

        // Calculos
        area = Math.PI * Math.pow(radio,2);

        // Imprimir en consola
        System.out.println("El crirculo de radio "+radio+" tiene un area de "+area);
    }
}