import herencia_1.*;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Coche car=new Coche();
        Bicicleta bicycle=new Bicicleta();
        Camioneta c= new Camioneta();
        Motocicleta motorcycle= new Motocicleta();

        ArrayList<Vehiculo> listavehiculos= new ArrayList<Vehiculo>();
        listavehiculos.add(car);
        listavehiculos.add(bicycle);
        listavehiculos.add();
        listavehiculos.add();

        System.out.println("hola");
        System.out.println(listavehiculos);
        System.out.println("chau");
    }

}