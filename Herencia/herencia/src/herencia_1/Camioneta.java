package herencia_1;

public class Camioneta extends Coche {
    private double load;

    public Camioneta() {
    }

    public Camioneta(double speed, double cylinder_capacity, double load) {
        super(speed, cylinder_capacity);
        this.load = load;
    }

    public Camioneta(String color, int wheels, double speed, double cylinder_capacity, double load) {
        super(color, wheels, speed, cylinder_capacity);
        this.load = load;

    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }
}
