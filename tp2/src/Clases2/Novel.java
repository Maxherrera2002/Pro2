package Clases2;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, int yearOfPublication, String genre) {
        super(title, author, yearOfPublication);
        this.genre = genre;
    }


    public String getGenre() {
        return genre;
    }
}
