// Programa con una función que reciba como parámetro un ángulo entre 0 y 360 grados, y regrese una
// palabra con el tipo de ángulo, en base a lo siguiente:

import java.util.Scanner;

public class _p79_Angulo {
    public static void angulo(float a){    // Funcion para verificar que tipo de angulo es
        if ((a>=0 && a<90) || a==360 ){    // Condicion if para comparar los angulos con paso de parametro 
            System.out.printf("\nEl angulo %.1f es Agudo",a);
        }
        else if(a==90){
            System.out.printf("\nEl angulo %.1f es Recto",a);
        }
        else if(a>90 && a<180){
            System.out.printf("\nEl angulo %.1f es Obtuso",a);
        }
        else if(a==180){
            System.out.printf("\nEl angulo %.1f es LLano",a);
        }
        else{
            System.out.printf("\nEl angulo %.1f es Concavo",a);
        }
    }
    public static void main(String[] args) {   // Funcion principal
        float a;   // VAriable local
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola

        do{  // Ciclo do while para optener y validar que los valores sean correctos 
            System.out.println("Introduce el angulo ");
            a = obj.nextFloat();
            if(a<0 || a>360){
                System.out.println("El valor introducido no esta dentro de el rango 0 a 360");
            }
            else{
                angulo(a);  // LLamar a la funcion pasando un parametro
            }
        }while(a<0 || a>360);
        System.out.println("\nFin del programa.............");
    }
}
