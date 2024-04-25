package Ejercicio2;

public class Employer {
    //Attributes
    private String name;
    private Employer supervisor;
    //Constructors

    public Employer() {
    }

    public Employer(String name) {
        this.name = name;
    }
    //Getters y setters

    public String getName() {
        return name;
    }

    public Employer getSupervisor() {
        return supervisor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupervisor(Employer supervisor) {
        this.supervisor = supervisor;
    }
    //Methods
    public void asignarSupervisor(Employer superv){
        setSupervisor(superv);
    }
    public void obtenerNombreSupervisor(){
        if (!(supervisor == null)){
            System.out.println("Nombre del supervisor: "+getSupervisor().getName()+", del empleado: "+getName());
        }else {
            System.out.println("El empleado: "+getName() +", No tiene supervisor");
        }
    }
}
