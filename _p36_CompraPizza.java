// Un usuario puede elegir un tamaño de pizza (chica - $5, mediana $10, grande $20), luego elige la cantidad, si la
// compra es menor a 2000 no tiene descuento, mayor a 2000 tiene un descuento de 15%. Diseñe un programa que
// permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, total de
// compra con descuento.

import java.util.Scanner;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        // Definir variables
        char op;
        Scanner entrada = new Scanner(System.in);
        int r=0, nun=0;
        double desc=0;
        double Prefinal=0;

        // Borrar datos de la consola
        System.out.print("\033[H\033[2J");System.out.flush();

        // Pedir y asignar datos 
        System.out.println("Precios de la pizza chica - $5, mediana $10, grande $20");
        System.out.println("Elige el tamaño de pizza que quieras comprar (chica = c, mediana = m, grande = g)");
        System.out.println("--------------------------------------");
        op = entrada.next().charAt(0);

        // Condicion
        switch (op) {
            case 'c':
                System.out.println("Cuantas piesas de pizza va a ordenar :");
                nun =entrada.nextInt();
                r=5*nun;
                if(r>=2000){
                    desc=(r * 0.15);
                    Prefinal=r-desc;
                    System.out.print("\nEl tamaño seleccionado es Chica");
                    System.out.print("\nTotal de pizza es:        "+nun);
                    System.out.print("\nEl total de la compra es: "+r);
                    System.out.print("\nEl total de decuento  es: "+desc);
                    System.out.print("\nEl Total con decuento es: "+Prefinal);
                }
                else{
                    System.out.print("\nEl tamaño seleccionado es Chica");
                    System.out.print("\nTotal de pizza es:        "+nun);
                    System.out.print("\nEl total de la compra es: "+r);
                    System.out.print("\nEl decuento NO APLICA :(  ");
                    System.out.print("\nEl Total con decuento es: "+r);
                }
                break;
            case 'm':
                System.out.println("Cuantas piesas de pizza va a ordenar :");
                nun =entrada.nextInt();
                r=10*nun;
                if(r>=2000){
                    desc=(r * 0.15);
                    Prefinal=r-desc;
                    System.out.print("\nEl tamaño seleccionado es Mediana");
                    System.out.print("\nTotal de pizza es:        "+nun);
                    System.out.print("\nEl total de la compra es: "+r);
                    System.out.print("\nEl total de decuento  es: "+desc);
                    System.out.print("\nEl Total con decuento es: "+Prefinal);
                }
                else{
                    System.out.print("\nEl tamaño seleccionado es Mediana");
                    System.out.print("\nTotal de pizza es:        "+nun);
                    System.out.print("\nEl total de la compra es: "+r);
                    System.out.print("\nEl decuento NO APLICA :(  ");
                    System.out.print("\nEl Total con decuento es: "+r);
                }
                break;
            case 'g':
                System.out.println("Cuantas piesas de pizza va a ordenar :");
                nun =entrada.nextInt();
                r=20*nun;
                if(r>=2000){
                    desc=(r * 0.15);
                    Prefinal=r-desc;
                    System.out.print("\nEl tamaño seleccionado es Grande");
                    System.out.print("\nTotal de pizza es:        "+nun);
                    System.out.print("\nEl total de la compra es: "+r);
                    System.out.print("\nEl total de decuento  es: "+desc);
                    System.out.print("\nEl Total con decuento es: "+Prefinal);
                }
                else{
                    System.out.print("\nEl tamaño seleccionado es Grande");
                    System.out.print("\nTotal de pizza es:        "+nun);
                    System.out.print("\nEl total de la compra es: "+r);
                    System.out.print("\nEl decuento NO APLICA :(  ");
                    System.out.print("\nEl Total con decuento es: "+r);
                }
                break;
            default:
                System.out.println("\nCaracter no es valido ...");
                break;
            }

            // Imprimir en pantalla
            System.out.println("\nFinalizacin del programa.......");
    }
}
