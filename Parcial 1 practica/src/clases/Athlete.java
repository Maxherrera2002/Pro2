package clases;



public class Athlete extends Person implements Contract{
    private double height;//altura
    private int age;//edad
    private double weight;//peso

    public Athlete() {
    }

    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;//altura
        this.age = age;//edad
        this.weight = weight;//peso
    }
    public Athlete(Person person, double height,int age, double weight){
        super(person.getDni(), person.getName());
        this.height = height;
        this.age = age;
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateBMI() {//calcula IMC
        return weight / Math.pow(height,2);
    }

    @Override
    public boolean thereisExtraWeight() { //Hay peso extra
        double bmi= this.calculateBMI();
        if(bmi>=25) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public double takePulses(int pulsations, double minutes) {//Tomar pulsaciones: recibe la cantidad de pulsaciones tomadas y los minutos en los que fueron tomadas, devuelve las pulsaciones por minuto.
        return pulsations/minutes;
    }

    @Override
    public double Overweight() {
        double bmi=calculateBMI();
        double idealweight=bmi*Math.pow(height,2);
        double aux=this.weight-idealweight;
        System.out.println(aux);
        return aux;

    }
}
