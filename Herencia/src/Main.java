import Herencias.*;

import java.util.ArrayList;
import java.util.Objects;

public class Main {


    public static void main(String[] args) {
        Car car1 = new Car("rojo", 4, 80.5, 30.3);
        Van van1 = new Van("verde", 6, 140.5, 60, 1000);
        Bicycle bicycle1 = new Bicycle("rojo", 2, "deportiva");
        Motorcycle motorcycle1 = new Motorcycle("azul", 2, "deportiva", 140.5, 25.6);

        ArrayList<Vehicle> listvehicle = new ArrayList<>(); //creo la lista de objetos y los agrego
        listvehicle.add(car1);
        listvehicle.add(van1);
        listvehicle.add(bicycle1);
        listvehicle.add(motorcycle1);

        to_catalog(listvehicle);
        System.out.println("--------------");
        catalog(0, listvehicle);
        System.out.println("--------------");
        catalog(2, listvehicle);
        System.out.println("--------------");
        catalog(4, listvehicle);
        System.out.println("--------------");

        Dog dog = new Dog("Negrita", 3, "hembra", "salchicha");
        Cat cat = new Cat("Raul", 4, "Macho", "naranja");
        Bird bird = new Bird("Pedrito", 70, "Sin especificar", "Cata");

        dog.information();
        dog.Produce_sound();
        System.out.println("*----*");
        cat.information();
        cat.Produce_sound();
        System.out.println("*----*");
        bird.information();
        bird.Produce_sound();
    }


    public static void to_catalog(ArrayList<Vehicle> listvehiculos){ //creo una funcion que recorre el array de objetos y me da sus datos
        for (Vehicle aux : listvehiculos){
            System.out.println(aux.Data());
        }

    }

    public static void catalog(int wheels, ArrayList<Vehicle> listvehiculos){
        int amount=0;
        for (Vehicle aux : listvehiculos){
            if (aux.getWheels()==wheels) {
                System.out.println(aux.Data());
                amount+=1;
            }

        }
        if (amount >= 1){
            System.out.println("Se han encontrado "+amount+" vehículos con "+wheels+" ruedas");
        }else{
            System.out.println("No se encontro ningun vehiculo con "+wheels+" ruedas");
        }

    }


}