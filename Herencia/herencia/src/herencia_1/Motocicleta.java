package herencia_1;

public class Motocicleta extends Bicicleta{
    private double speed;
    private double cylinder_capacity;

    public Motocicleta() {
    }


    public Motocicleta(String color, int wheels, String type, double speed, double cylinder_capacity) {
        super(color, wheels, type);
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
