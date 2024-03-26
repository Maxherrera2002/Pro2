package Herencias;

public class Van extends Car {
    private double cargo;

    public Van() {
    }

    public Van(String color, int wheels, double speed, double engine_displacement, double cargo) {
        super(color, wheels, speed, engine_displacement);
        this.cargo = cargo;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    @Override
    public String Data() {
        return "Clase= Van, Color= "+this.getColor()+", wheels= "+getWheels()+", speed= "+this.getSpeed()+", engine_displacement= "+this.getEngine_displacement()+", cargo= "+this.cargo;
    }
}
