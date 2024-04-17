package Clases2;

public class ChildrenBook extends Book{
    private int recommendedAge;

    public ChildrenBook(String title, String author, int yearOfPublication, int recommendedAge) {
        super(title, author, yearOfPublication);
        this.recommendedAge = recommendedAge;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }
}
