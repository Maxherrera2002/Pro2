package clses2;
import java.util.List;
import java.util.ArrayList;
public class Person {
    private String name;
    private List<Book> books= new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
        this.books=new ArrayList<>();


    }

    public List<Book> getBooks() {
        return books;
    }
    public void addBook(Book book){
        books.add(book);
        book.addOwner(this);
    }
}

