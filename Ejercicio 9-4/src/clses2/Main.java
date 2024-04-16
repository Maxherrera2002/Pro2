package clses2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Persona 1");
        Person person2 = new Person("Persona 2");

        Book book1=new Book("libro 1");
        Book book2=new Book("libro 2");

        person1.addBook(book1);
        person2.addBook(book2);
        person2.addBook(book1);

        System.out.println(person1.getName()+" es dueño de:");
        for (Book book : person1.getBooks()){
            System.out.println("-  "+book.getTitle());
        }

        System.out.println(person2.getName() + " es dueño de:");
        for (Book book : person2.getBooks()) {
            System.out.println("- " + book.getTitle());
        }

        System.out.println("El libro " + book1.getTitle() + " es poseído por las siguientes personas:");
        for (Person person : book1.getOwners()) {
            System.out.println("- " + person.getName());
        }

    }



}
