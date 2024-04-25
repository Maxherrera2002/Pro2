package Ejercicio5;

import Ejercicio4.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        boolean auxWhile = true;
        while (auxWhile){
            System.out.println("\n-----------------------------\n");
            System.out.println("Bienvenido, al gestor de tareas, aqui podras, gestionar tu lista de tareas");
            System.out.println("\n-----------------------------\n");
            Scanner e = new Scanner(System.in);
            System.out.println("Para crear una nueva lista de tareas ingrese: SI \nEn caso contrario ingrese NO");
            String newlist = e.nextLine();
            if (newlist.equalsIgnoreCase("si")) {
                ListOfTask listTask = new ListOfTask();
                boolean auxWhile2 = true;
                while (auxWhile2) {
                    try {
                        Scanner s = new Scanner(System.in);
                        System.out.println("""
                                Eliga una de las opciones introduciendo su numero:\s
                                0-Salir\s
                                1-Agregar tarea\s
                                2-Eliminar tarea por su descripcion\s
                                3-Mostrar lista de tareas\s
                                4-Cantidad de tareas a realizar""");
                        int activity = Integer.parseInt(s.nextLine());
                        switch (activity){
                            case 0 ->{
                                auxWhile = false;
                                auxWhile2 = false;
                            }
                            case 1 -> {
                                addTask(listTask);
                            }
                            case 2 -> {
                                deleteTask(listTask);
                            }
                            case 3 -> {
                                showTask(listTask);
                            }
                            case 4 ->{
                                System.out.println("La cantidad de tareas son: "+listTask.sizeTask());
                            }
                            default -> {
                                System.out.println("Ingrese una opcion correcta");
                            }
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("\nIntroduza un numero o una opcion correcta"+" / "+ex.getMessage());
                        System.out.println("\n");
                    }
                }
            } else if (newlist.equalsIgnoreCase("no")) {
                auxWhile = false;
                break;
            }

        }
        System.out.println("\n-----------------------------\n");
        System.out.println("GRACIAS POR USAR EL GESTOR DE ALUMNOS");
        System.out.println("\n-----------------------------\n");

    }
    public static void addTask(ListOfTask list){
        String auxDescription;
        int auxPriority = 0;
        Scanner addST = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la nueva tarea: ");
        auxDescription = addST.nextLine();
        try {
            System.out.println("Ingrese la prioridad(numerica) de la nuevo tarea: ");
            auxPriority = Integer.parseInt(addST.nextLine());
        }catch (NumberFormatException ex) {
            System.out.println("\nIntroduza un numero entero"+" / "+ex.getMessage());
            System.out.println("\n");
        }
        Task ts = new Task(auxDescription, auxPriority);
        list.addTask(ts);
    }
    public static void deleteTask(ListOfTask tarea){
        Scanner deleteTS = new Scanner(System.in);
        System.out.println("\nIngrese la descripcion de la tarea a eliminar: ");
        String auxDescripcion = deleteTS.nextLine();
        tarea.removeTask(auxDescripcion);
    }
    public static void showTask(ListOfTask tasks){
        Iterator<Task> iterador = tasks.iterator();
        while (iterador.hasNext()) {
            Task ts = iterador.next();
            System.out.println("Nombre de la tarea: " +ts.getDescription()+
                    "\nPrioriridad de la tarea: "+ts.getPriority());
        }
    }
}
