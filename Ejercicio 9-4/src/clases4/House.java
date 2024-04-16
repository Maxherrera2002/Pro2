package clases4;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Door> doors;

    public House(int numberOfDoors, String doorMaterial) {
        this.doors = new ArrayList<>();

        for (int i = 0; i < numberOfDoors; i++) {
            doors.add(new Door(doorMaterial));
        }
    }


    public List<Door> getDoors() {
        return doors;
    }

}
