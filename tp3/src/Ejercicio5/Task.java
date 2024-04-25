package Ejercicio5;

import java.util.Iterator;

public class Task {
    //Attributes
    private String description;
    private int priority;
    //Constructors

    public Task() {
    }

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }
    //Getters y setters

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    //Methods

}
