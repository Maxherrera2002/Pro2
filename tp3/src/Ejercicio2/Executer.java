package Ejercicio2;

public class Executer {
    public Executer() {

        Employer em1 = new Employer("Jere");
        Employer em2 = new Employer("Maria");
        em2.asignarSupervisor(em1);
        em1.obtenerNombreSupervisor();
        em2.obtenerNombreSupervisor();
    }
}
