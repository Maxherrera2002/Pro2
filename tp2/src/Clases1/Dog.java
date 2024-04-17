package Clases1;

public class Dog extends Animal{
    private String race;
    private boolean vaccinated;

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age, String animalType, double price, String race, boolean vaccinated) {
        super(name, age, animalType, price);
        this.race = race;
        this.vaccinated = vaccinated;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
