package Ejer10;

public class LibroDeTextoUNC extends LibroDeTexto{
    private String falcutad;

    public LibroDeTextoUNC(String titulo, String autor, double precio, String curso, String falcutad) {
        super(titulo, autor, precio, curso);
        this.falcutad = falcutad;
    }

    public String getFalcutad() {
        return falcutad;
    }

    public void setFalcutad(String falcutad) {
        this.falcutad = falcutad;
    }
    @Override
    public void imprimirInformacion(){
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Autores: "+this.getAutor());
        System.out.println("Precio: "+this.getPrecio());
        System.out.println("Curso: "+this.getCurso());
        System.out.println("Facultad: "+this.falcutad);
    }
}

