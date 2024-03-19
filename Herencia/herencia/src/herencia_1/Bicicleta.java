package herencia_1;

public class Bicicleta extends Vehiculo {
    private String Type;

    public Bicicleta() {
    }

    public Bicicleta(String color, int wheels, String type) {
        super(color, wheels);
        Type = type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
