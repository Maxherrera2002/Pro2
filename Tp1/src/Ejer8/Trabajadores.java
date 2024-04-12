package Ejer8;

public class Trabajadores extends Empleado{
    //Attributes
    private String areaTrabajo;
    //Constructors

    public Trabajadores() {
    }

    public Trabajadores(String nombre, int edad, String salario, String capacidadDeTrabajo, String areaTrabajo) {
        super(nombre, edad, salario, capacidadDeTrabajo);
        this.areaTrabajo = areaTrabajo;
    }
    //Getters y Setters

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
//Methods
    public void produciendoArea() {
        System.out.println("Me encuentro produciendo en el area de trabajo: "+getAreaTrabajo());
    }
}
