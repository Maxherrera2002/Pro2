package Clases2;

public class UniversityBook extends Book {
    private String major;

    public UniversityBook(String title, String author, int yearOfPublication, String major) {
        super(title, author, yearOfPublication);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}
