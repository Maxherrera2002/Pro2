package Ejer8;

public class Empleado {
    //Attributes
    private String nombre;
    private int edad;
    private String salario;
    private String capacidadDeTrabajo;
    //Constructors

    public Empleado() {
    }

    public Empleado(String nombre, int edad, String salario, String capacidadDeTrabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.capacidadDeTrabajo = capacidadDeTrabajo;
    }
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCapacidadDeTrabajo() {
        return capacidadDeTrabajo;
    }

    public String getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidadDeTrabajo(String capacidadDeTrabajo) {
        this.capacidadDeTrabajo = capacidadDeTrabajo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    //Methods

}
