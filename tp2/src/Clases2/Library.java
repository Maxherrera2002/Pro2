package Clases2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;


    public Library() {
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
        System.out.println("El libro '" + book.getTitle() + "' ha sido agregado a la biblioteca.");
    }


    public void listAvailableBooks() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
            }
        }
    }


    public void borrowBook(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle) && !book.isBorrowed()) {
                book.borrow();
                return;
            }
        }
        System.out.println("El libro '" + bookTitle + "' no está disponible para préstamo.");
    }


    public void returnBook(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle) && book.isBorrowed()) {
                book.returnBook();
                return;
            }
        }
        System.out.println("El libro '" + bookTitle + "' no se puede devolver porque no ha sido prestado.");
    }
}
