package clases;

public class Cuadrado implements Figura, Rotable, Dibujable{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    @Override
    public float area() {
        return lado*lado;
    }

    @java.lang.Override
    public void dibujar() {
        System.out.println("lado 1: "+lado+" Lado 2: "+lado);
    }

    @java.lang.Override
    public void rotar() {
        System.out.println("rotado");
    }
}
