// Envia un saludo a la pantalla

public class _p01_HolaMundo{
    public static void main(String[] args) {
        // Decalrar variables y definir valores
        String amigo = "Shinji";
        String hermano = "Gendo";
        String mensaje = String.format("Tanto %s como %s desean aprender a programar en Java", amigo, hermano);
        
        // Imprimir en consola 
        System.out.println("Hola Mundo en el lenguaje Java");
        System.out.println("\nHola amigo "+amigo+" bienvenido a Java");
        System.out.println("\nMi amigo es "+amigo+" y mi hermano es "+hermano+"\n");
        System.out.println(mensaje);
    }
}