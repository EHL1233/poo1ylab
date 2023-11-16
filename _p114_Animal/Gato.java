package _p114_Animal;

public class Gato implements Animal {
    @Override
    public void dormir() {
        System.out.println("El gato duerme en la azotea");
    }
    @Override
    public void sonido() {
        System.out.println("El gato hace muuuu");
    }
}
