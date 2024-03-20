package Herencias;

public class Motorcycle extends Bicycle {
    private double speed;  //km-h
    private double engine_displacement;  //cc

    public Motorcycle() {
    }

    public Motorcycle(String color, int wheels, String type, double speed, double engine_displacement) {
        super(color, wheels, type);
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
        return ("Clase= Motorcycle, color= "+this.getColor()+", wheels= "+this.getWheels()+", type= "+this.getType()+", speed="+this.speed+", engine_displacement= "+this.engine_displacement);
    }
}
