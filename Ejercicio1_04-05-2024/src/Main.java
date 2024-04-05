import clases.Circulo;
import clases.Cuadrado;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);
        Circulo circulo1 = new Circulo(1);

        System.out.println("El area del cuadrado es = "+cuadrado1.area());

        cuadrado1.dibujar();
        cuadrado1.rotar();

        System.out.println("El area del circulo es = "+circulo1.area());

        circulo1.dibujar();

    }
}