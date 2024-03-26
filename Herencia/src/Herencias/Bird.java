package Herencias;

public class Bird extends Animal{
    String species;

    public Bird() {
    }

    public Bird(String name, int age, String gender, String species) {
        super(name, age, gender);
        this.species = species;
    }

    @Override
    public void Produce_sound() {
        System.out.println("El pájaro canta");
    }
    @Override
    public void information() {
        System.out.println("Soy un perro mi nombre es: "+this.getName()+", tengo "+this.getAge()+" años soy "+this.getGender()+" y mi especie es "+this.species);
    }
}
