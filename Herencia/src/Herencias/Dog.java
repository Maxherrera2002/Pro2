package Herencias;

public class Dog extends Animal{
    String raza;

    public Dog() {
    }

    public Dog(String name, int age, String gender, String raza) {
        super(name, age, gender);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void Produce_sound() {
        System.out.println("El perro ladra");
    }

    @Override
    public void information() {
        System.out.println("Soy un perro mi nombre es: "+this.getName()+", tengo "+this.getAge()+" años soy "+this.getGender()+" y mi raza es "+this.raza);
    }
}
