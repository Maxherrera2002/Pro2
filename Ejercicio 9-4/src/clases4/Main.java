package clases4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house = new House(3, "Madera");


        System.out.println("Materiales de las puertas de la casa:");
        List<Door> doors = house.getDoors();
        for (int i = 0; i < doors.size(); i++) {
            System.out.println("Puerta " + (i + 1) + ": " + doors.get(i).getMaterial());
        }
    }
}
