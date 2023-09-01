// Se desea calcular el promedio de 5 calificaciones introducidas por el usuario, luego evaluar el resultado e imprimir
// n mensaje de acuerdo con el promedio obtenido:
// • >0 y <= 6 Quedas reprobado
// • >6 a <=7 Pasas de panzazo
// • >7 y <=8 Muy bien, pues mejorar
// • >8 y <=9 Excelente sigue así
// • >9 y <=10 Perfecto tu esfuerzo valió la pena

import java.util.Scanner;

public class _p37_CalculoNotas {
    public static void main(String[] args) {
        // Borrar datos de la consola
        System.out.print("\033[H\033[2J");System.out.flush();

        // Declarar variables
        float n1=0, n2=0, n3=0, n4=0, n5=0;
        float pormedio;
        Scanner entrada = new Scanner(System.in);
        
        // Pedir y asignar valores
        System.out.println("Dame calificaciones entre 0 y 10");
        System.out.println("NOTA: Si introduces numero fuera de estos rangos el programa terminara");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Dame calificacion 1 : ");
        n1 =entrada.nextInt();
        System.out.println("Dame calificacion 2 : ");
        n2 =entrada.nextInt();
        System.out.println("Dame calificacion 3 : ");
        n3 =entrada.nextInt();
        System.out.println("Dame calificacion 4 : ");
        n4 =entrada.nextInt();
        System.out.println("Dame calificacion 5 : ");
        n5 =entrada.nextInt();

        // Calculos
        pormedio=((n1+n2+n3+n4+n5)/5);
        
        // Condiciones
        if(pormedio>0 && pormedio<=6){
            System.out.println("Quedas reporbado");
        }
        else if(pormedio>6 && pormedio<=7){
            System.out.println("Pasas de panzazo");
        }
        else if(pormedio>7 && pormedio<=8){
            System.out.println("Muy bien, puedes mejorar");
        }
        else if(pormedio>8 && pormedio<=9){
            System.out.println("Exelente sigue así");
        }
        else if(pormedio>9 && pormedio<=10){
            System.out.println("Perfecto tu esfuerzo valio la pena");
        }
        else{
            System.out.println("valores no validos ");
        }
        
        // Imprimir en consola 
        System.out.println("Finalizacion del programa.............");
    }
}
