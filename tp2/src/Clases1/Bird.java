package Clases1;

public class Bird extends Animal{
    private String specie;
    private boolean speaks;

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, int age, String animalType, double price, String specie, boolean speaks) {
        super(name, age, animalType, price);
        this.specie = specie;
        this.speaks = speaks;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public boolean isSpeaks() {
        return speaks;
    }

    public void setSpeaks(boolean speaks) {
        this.speaks = speaks;
    }
}
