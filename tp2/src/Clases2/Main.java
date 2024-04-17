package Clases2;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        Novel novela = new Novel("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico");
        UniversityBook libroUniversitario = new UniversityBook("Introducción a la Inteligencia Artificial", "Stuart Russell, Peter Norvig", 1995, "Informática");
        ChildrenBook libroInfantil = new ChildrenBook("El Principito", "Antoine de Saint-Exupéry", 1943, 8);


        library.addBook(novela);
        library.addBook(libroUniversitario);
        library.addBook(libroInfantil);


        library.listAvailableBooks();


        library.borrowBook("Cien años de soledad");
        library.borrowBook("Introducción a la Inteligencia Artificial");


        library.listAvailableBooks();


        library.returnBook("Cien años de soledad");


        library.listAvailableBooks();

    }
}
