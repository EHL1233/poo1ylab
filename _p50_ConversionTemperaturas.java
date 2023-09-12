// Calcular la temperatura convertida de grados centígrados a grados farenheit de un rango de valores
// introducidos por el usuario, es decir el usuario introduce la temperatura inicial y la temperatura final

import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        // Declarar variables 
        int inicio,fina,i;
        double f,c;
        char op;
        char resp;
        Scanner entrada = new Scanner(System.in);

        // Ciclo pricipal
        do{
            // Borrar datos de la consola 
            System.out.print("\033[H\033[2J");System.out.flush();

            // Imprimir en consola
            System.out.println("Dime que tipo de medida quieres usar Farenheit o Celsius (F/C)"); 
            op = Character.toUpperCase(entrada.next().charAt(0));

            do{
                // Pedir y asignar valors 
                System.out.println("Dame el valor inicial: ");
                inicio = entrada.nextInt();
                System.out.println("Dame el valor final: ");
                fina = entrada.nextInt();
            }while(inicio > fina);

                switch(op){
                    case 'F':  // En caso de que el usuario escoga Fahrenheit
                        System.out.println("______________________");
                        System.out.println("Fahrenheit\tCelsius");
                        System.out.println("______________________");

                        for(i=inicio; i<=fina; i+=1){ // Ciclo iterativo para desarrollar la tabla de valores y convertir 
                            c=((i-32.0)*(5.0/9.0));
                            System.out.printf(i+"\t%.2f\n",c);
                        }
                        System.out.println("______________________");
                        break;
                    case 'C':  // En caso de que el usuario escoga Celsius 
                        System.out.println("______________________");
                        System.out.println("Celsius\tFahrenheit");
                        System.out.println("______________________");

                        for(i=inicio; i<=fina; i+=1){  // Ciclo eterativo para desarrollar la tabla de valores y convertir 
                            f=((i*(9.0/5.0))+32.0);
                            System.out.printf(i+"\t%.2f\n",f);
                        }
                        System.out.println("______________________");
                        break;
                    default:
                        System.out.println("\nDato invalido especifique que convercion quiere hacer (F ó C)");
                }
            // Imprimir en consola 
            System.out.println("\nDesea continuar con el programa? (S/N)");
            resp = Character.toUpperCase(entrada.next().charAt(0));

        }while( resp != 'N' ); // Finalizacion del ciclo 
        System.out.println("\nFinalizacion del programa....");  // Imprimir en cosola
    }
}
