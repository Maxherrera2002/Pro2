package Ejer8;

public class Gerente extends Empleado{
    //Attributes
    private String departamentoT;
    //Constructors

    public Gerente() {
    }

    public Gerente(String nombre, int edad, String salario, String capacidadDeTrabajo, String departamentoT) {
        super(nombre, edad, salario, capacidadDeTrabajo);
        this.departamentoT = departamentoT;
    }
    //Getters y Setters

    public String getDepartamentoT() {
        return departamentoT;
    }

    public void setDepartamentoT(String departamentoT) {
        this.departamentoT = departamentoT;
    }
    //Methods
    public void organizadorDept(){
        System.out.println("Organizando el area de trabajo dentro del departamento: "+ getDepartamentoT());
    }
}
