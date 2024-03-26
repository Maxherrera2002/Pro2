package Clases;

public class Staff_member extends Operator{

    public String toString() {
        return "soy un Oficial y mi nombre es "+this.getName();
    }

    public String task() {
        return "Veo que cada persona cumpla con su rol y me encargo de contratar o despedir";
    }
}
