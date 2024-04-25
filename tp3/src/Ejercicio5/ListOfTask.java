package Ejercicio5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ListOfTask implements Iterable<Task> {
    //Attributes
    private ArrayList<Task> listTask;
    //Constructors
    public ListOfTask() {
        this.listTask = new ArrayList<>();
    }

    //Getters y setters

    //Methods
    public void addTask(Task tarea){
        listTask.add(tarea);
        listTask.sort(Comparator.comparingInt(Task::getPriority).reversed());
    }
    public void removeTask(String desc){
        for (Task ts : listTask){
            if (ts.getDescription().equalsIgnoreCase(desc)) {
                listTask.remove(ts);
                break;
            }

        }
        System.out.println("La descripcion proporcionada no esta disponible");
    }
    public int sizeTask(){
        return listTask.size();
    }


    @Override
    public Iterator<Task> iterator() {
        return new Iterator<Task>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < listTask.size();
            }

            @Override
            public Task next() {
                return listTask.get(index++);
            }
        };
    }
}
