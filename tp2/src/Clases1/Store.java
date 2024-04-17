package Clases1;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Animal> animals;

    public Store() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal a1){
       animals.add(a1);
    }
    public Animal sellAnimal(String name){
        Animal aux;

        for (int i=0;i<animals.size();i++){
            if (animals.get(i).getName().equals(name)){
                aux=animals.get(i);

                animals.remove(i);

                System.out.println("Se encontro el animal y se vendio, con el nombre "+name);

                return aux;
            }
        }

            System.out.println("no se encotro el animal con el nombre "+name);
            return null;

    }
    public void feedanimals(String name){
        boolean aux=false;
        for (int i=0;i<animals.size();i++){
            if (animals.get(i).getName().equals(name)){
                animals.get(i).feed(name);
                aux=true;
            }
        }
        if (!aux){
            System.out.println("No se encontro el animal con el nombre "+name);
        }
    }

    public void listAnimals(){
        System.out.println("---  ---  ---");
        for (int i=0;i<animals.size();i++) {
            System.out.println(animals.get(i).toString());

        }
        System.out.println("---  ---  ---");
    }
}
