import java.util.Scanner;


public class _p80_PrimerExamenParcial {
    public static void totalasis(int prome,int ta,int td,int tt,int th,int tm,int ttp) {
        float gprome=0;
        gprome= (float)prome/ttp;
        System.out.println("----------------------------");
        System.out.printf("\nTotal de alumnos: %d",ta);
        System.out.printf("\nTotal de docentes: %d",td);
        System.out.printf("\nTotal de trabajador: %d",tt);
        System.out.printf("\nTotal de hombres en general: %d",th);
        System.out.printf("\nTotal de mujeres en general: %d",tm);
        System.out.printf("\nTotal de todos los participantes: %d",ttp);
        System.out.printf("\npromedio de edad de todos los partisipantes: %.2f",gprome);
        
    }
    public static void totaldinero(int ta,int td,int tt) {
        int total;
        total=(ta*50)+(td*80)+(tt*60);
        System.out.println("\n-------------------------------");
        System.out.printf("\nTotal dinero recaudado de alumnos: %d",ta*50);
        System.out.printf("\nTotal dinero recaudado de Docentes: %d",td*80);
        System.out.printf("\nTotal dinero recaudado de trabajodores: %d",tt*60);
        System.out.printf("\nTotal dinero recaudado: %d",total);
        if(total<100){
            System.out.println("\nEl evento concluye con ganacias BAJAS ");
        }
        else if(total>=100 && total<200){
            System.out.println("\nEl evento concluye con ganacias MODERADAS ");
        }
        else if ( total>=200 ){
            System.out.println("\nEl evento concluye con BUENAS ganancias");
        }
    }

    public static void main(String[] args) {
        int edad,ta,td,tt,th,tm,ttp,prome,tipo;
        prome=edad=ta=td=tt=th=tm=ttp=0;
        String name;
        char op,sexo;
        Scanner entrada = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();  // Borrar datos de la consola

        do{
            System.out.print("\nDame nombre:  ");
            name = entrada.nextLine();
            System.out.print("\nQue tipo de participante eres alumno[1], docente[2], trabajador[3] ");
            tipo = entrada.nextInt();
            System.out.print("\nDime que edad tienes: ");
            edad = entrada.nextInt(); 
            System.out.print("\nTipo de sexo H/M ");
            sexo = Character.toUpperCase(entrada.next().charAt(0));


            if(edad>=18){
                if(tipo==1){
                    ta=ta+1;
                }
                if(tipo==2){
                    td=td+1;
                }
                if(tipo==3){
                    tt=tt+1;
                }
                if(sexo=='H'){
                    th=th+1;
                }
                if(sexo=='M'){
                    tm=tm+1;
                }
                ttp=ttp+1;
                prome=prome+edad;
            }
            
            System.out.println("Desea seguir introduciendo personas (S/N) ");
            op = Character.toUpperCase(entrada.next().charAt(0));
            entrada.nextLine();
        }while(op != 'N');
        totalasis(prome, ta, td, tt, th, tm, ttp);
        totaldinero(ta, td, tt);
        System.out.println("\nFin del programa.........");
    }
}
