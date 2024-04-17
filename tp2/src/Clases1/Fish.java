package Clases1;

public class Fish extends Animal{
    public String especie;

    public Fish(String name) {
        super(name);
    }

    public Fish(String name, int age, String animalType, double price, String especie) {
        super(name, age, animalType, price);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
