package Clases;

public class Operator extends Employee{
    public Operator() {
    }

    public Operator(String name) {
        super(name);
    }

    public String toString() {
        return "soy un Operario y mi nombre es "+this.getName();
    }
    public String work(){
        return "Trabajo operando maquinaria";
    }
}
