package Herencias;

public class Car extends Vehicle{
    private double speed;  //km-h
    private double engine_displacement;  //cc

    public Car() {
    }

    public Car(String color, int wheels, double speed, double engine_displacement) {
        super(color, wheels);
        this.speed = speed;
        this.engine_displacement = engine_displacement;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getEngine_displacement() {
        return engine_displacement;
    }

    public void setEngine_displacement(double engine_displacement) {
        this.engine_displacement = engine_displacement;
    }

    @Override
    public String Data() {
        return "Clase= Car, Color= "+this.getColor()+", wheels= "+getWheels()+", speed= "+this.speed+", engine_displacement= "+this.engine_displacement;
    }
}
