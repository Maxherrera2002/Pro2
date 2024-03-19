package herencia_1;

public class Coche extends Vehiculo {
    private double speed;
    private double cylinder_capacity;

    public Coche() {
    }

    public Coche(double speed, double cylinder_capacity) {
        this.speed = speed;
        this.cylinder_capacity = cylinder_capacity;
    }

    public Coche(String color, int wheels, double speed, double cylinder_capacity) {
        super(color, wheels);
        this.speed = speed;
        this.cylinder_capacity = cylinder_capacity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCylinder_capacity() {
        return cylinder_capacity;
    }

    public void setCylinder_capacity(double cylinder_capacity) {
        this.cylinder_capacity = cylinder_capacity;
    }
}
