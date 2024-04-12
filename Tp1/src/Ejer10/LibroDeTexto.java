package Ejer10;

public class LibroDeTexto extends Libro{
    private String curso;

    public LibroDeTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public void imprimirInformacion(){
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Autores: "+this.getAutor());
        System.out.println("Precio: "+this.getPrecio());
        System.out.println("Curso: "+this.curso);
    }
}

