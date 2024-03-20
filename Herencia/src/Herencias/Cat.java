package Herencias;

public class Cat extends Animal{
    String fur;

    public Cat() {
    }

    public Cat(String name, int age, String gender, String fur) {
        super(name, age, gender);
        this.fur = fur;
    }

    @Override
    public void Produce_sound() {
        System.out.println("El gato maúlla");
    }
    @Override
    public void information() {
        System.out.println("Soy un perro mi nombre es: "+this.getName()+", tengo "+this.getAge()+" años soy "+this.getGender()+" y mi pelaje es "+this.fur);
    }
}
