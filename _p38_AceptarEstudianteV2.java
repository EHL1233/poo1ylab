// Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado. La
// Universidad Kitty Kat SA es solo para mujeres mayores de 21 años con un promedio de entre 8 y 9.5.

import java.util.Scanner;

public class _p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        // Borrar datos de la consola
        System.out.print("\033[H\033[2J");System.out.flush();

        // Declarar variables 
        int edad;
        char op;
        String name;
        float n1=0,n2=0,n3=0,promedio=0;
        Scanner entrada = new Scanner(System.in);
        
        // Pedir y asignar valores
        System.out.println("Dame calificaciones entre 0 y 10");
        System.out.println("NOTA: Si introduces numero fuera de estos rangos el programa terminara");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Dame tú nombre : ");
        name =entrada.nextLine();
        System.out.println("Dame tú edad : ");
        edad =entrada.nextInt();
        System.out.println("Dime tú sexo (H/M) : ");
        op = entrada.next().charAt(0);
        
        switch (op) {
            case 'M':
                System.out.println("Dame calificacion 1: ");
                n1=entrada.nextFloat();
                System.out.println("Dame calificacion 2: ");
                n2=entrada.nextFloat();
                System.out.println("Dame calificacion 3: ");
                n3=entrada.nextFloat();
                promedio=((n1+n2+n3)/3);

                if(promedio>8 && promedio<9.5 && edad>=21){
                    System.out.printf("Felicidades %s fuiste aceptada en Universidad Kitty Kat SA",name);
                }
                else{
                    System.out.printf("%s tu solicitud fue rechasada lo sentimos",name);
                }
                break;
            case 'H':
                System.out.println("Eres hombre y no puedes ingresar a la Universidad Kitty Kat SA");
                break;
            default:
                System.out.println("\nCaracteres introducido no es valido ...");
                break;
            }
        
            //Imprimir en cosola 
            System.out.println("\nFinalizacion del programa.......");
    }
}
