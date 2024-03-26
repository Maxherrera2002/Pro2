package Clases;

public class Technician extends Operator{
    public Technician() {
    }

    public Technician(String name) {
        super(name);
    }


    public String toString() {
        return "soy un tecnico y mi nombre es "+this.getName();
    }


    public String work() {
        return "Trabajo arreglando la maquinaria";
    }
}
