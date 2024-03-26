package Herencias;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal() {

    }

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void Produce_sound(){
        System.out.println("El animal hace un sonido genérico.");
    }

    public void information(){
        System.out.println("Soy un animal generico, con un nombre generico");
    }
}
