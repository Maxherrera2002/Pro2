package Herencias;

public class Bicycle extends Vehicle {
    private String type; //urnana o deportiva

    public Bicycle() {
    }

    public Bicycle(String color, int wheels, String type) {
        super(color, wheels);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String Data() {
        return ("Clase= Bicycle, color= "+this.getColor()+", wheels= "+this.getWheels()+", type= "+this.type);
    }
}
