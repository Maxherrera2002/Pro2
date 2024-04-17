package Clases2;

public class Book implements Prestable{
    private String title;
    private String author;
    private int yearOfPublication;
    private boolean borrowed;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.borrowed = false;
    }


    @Override
    public void borrow() {
        this.borrowed = true;
        System.out.println("El libro '" + title + "' es ha prestado.");
    }

    @Override
    public void returnBook() {
        this.borrowed = false;
        System.out.println("El libro '" + title + "' se ha devuelto.");
    }


    public boolean isBorrowed() {
        return borrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

}
