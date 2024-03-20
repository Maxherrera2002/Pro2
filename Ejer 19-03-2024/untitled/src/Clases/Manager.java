package Clases;

public class Manager extends Employee{
    public Manager() {
    }

    public Manager(String name) {
        super(name);
    }


    public String toString() {
        return "soy un Directivo mi nombre es "+this.getName();
    }


}
