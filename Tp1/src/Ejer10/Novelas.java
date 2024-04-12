package Ejer10;

public class Novelas extends Libro{
    private String tipo;

    public Novelas(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public void imprimirInformacion(){
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Autores: "+this.getAutor());
        System.out.println("Precio: "+this.getPrecio());
        System.out.println("Tipo: "+this.tipo);
    }
}

