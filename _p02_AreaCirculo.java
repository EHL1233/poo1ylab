// Calcula el area de un circulo

import java.util.Scanner;

public class _p02_AreaCirculo{
    public static void main(String[] args) {
        double radio,area;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame el radio del circulo: ");
        radio = entrada.nextFloat();

        area = Math.PI * Math.pow(radio,2);

        System.out.println("El crirculo de radio "+radio+" tiene un area de "+area);
    }
}