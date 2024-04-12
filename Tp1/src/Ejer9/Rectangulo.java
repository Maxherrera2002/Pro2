package Ejer9;

public class Rectangulo extends Figurageo {
    private double longitud;
    private double ancho;
    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }
    @Override
    public double calcularArea() {
        return longitud * ancho;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }
}

