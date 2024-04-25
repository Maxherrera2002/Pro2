package Ejercicio4;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Execute {
    public Execute() {
            boolean auxWhile = true;
            while (auxWhile){
                System.out.println("\n-----------------------------\n");
            System.out.println("Bienvenido, al gestor de alumnso, aqui podras, gestionar tu lista de alumnos");
                System.out.println("\n-----------------------------\n");
            Scanner e = new Scanner(System.in);
            System.out.println("Para crear una nueva lista de alumnos ingrese: SI \nEn caso contrario ingrese NO");
            String newlist = e.nextLine();
            if (newlist.equalsIgnoreCase("si")) {
                ArrayList<Student> studentsList = new ArrayList<>();
                boolean auxWhile2 = true;
                while (auxWhile2) {
                    try {
                        Scanner s = new Scanner(System.in);
                        System.out.println("""
                                Eliga una de las opciones introduciendo su numero:\s
                                0-Salir\s
                                1-Agregar alumno\s
                                2-Eliminar alumno\s
                                3-Mostrar lista de alumnos\s
                                4-Buscar alumno por nombre\s
                                5-Promedio de la lista de alumnos\s
                                6-Alumno con la nota mas alta""");
                        int activity = Integer.parseInt(s.nextLine());
                        switch (activity){
                            case 0 ->{
                                auxWhile = false;
                                auxWhile2 = false;
                            }
                            case 1 -> {
                                addStudent(studentsList);
                            }
                            case 2 -> {
                                deleteStudent(studentsList);
                            }
                            case 3 -> {
                                showListStudents(studentsList);
                            }
                            case 4 -> {
                                searchStudent(studentsList);
                            }
                            case 5 -> {
                                averageNoteStudents(studentsList);
                            }
                            case 6 -> {
                                highQualifierStudent(studentsList);
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
    public static void addStudent(ArrayList<Student> stL){
        String auxName;
        int auxAge = 0;
        double auxNote = 0.0;
        Scanner addST = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno nuevo: ");
        auxName = addST.nextLine();
        try {
            System.out.println("Ingrese la edad del nuevo alumno: ");
            auxAge = Integer.parseInt(addST.nextLine());
        }catch (NumberFormatException ex) {
            System.out.println("\nIntroduza un numero entero"+" / "+ex.getMessage());
            System.out.println("\n");
        }
        try {
            System.out.println("Ingrese la nota del nuevo alumno: ");
            auxNote = Double.parseDouble(addST.nextLine());
        }catch (NumberFormatException ex) {
            System.out.println("\nIntroduza un numero entero"+" / "+ex.getMessage());
            System.out.println("\n");
        }
        Student st = new Student(auxName, auxAge, auxNote);
        stL.add(st);
    }
    public static void deleteStudent(ArrayList<Student> stL){
        Scanner deleteST = new Scanner(System.in);
        System.out.println("\nIngrese el nombre del alumno a eliminar: ");
        String auxName = deleteST.nextLine();
        for (Student st : stL){
            if (st.getName().equalsIgnoreCase(auxName)){
                stL.remove(st);
                break;
            }else {
                System.out.println("\nEl estudiante con el nombre: "+auxName+" no esta en tu lista de estudiantes\n");
            }
        }
    }
    public static void showListStudents(ArrayList<Student> stL){
        for (Student st : stL){
            System.out.println("\n");
            st.showStudent();
            System.out.println("\n");
        }
    }
    public static void searchStudent(ArrayList<Student> stL){
        Scanner searchST = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a buscar en tu lista: ");
        String auxName = searchST.nextLine();
        for (Student st : stL){
            if (st.getName().equalsIgnoreCase(auxName)){
                st.showStudent();
                break;
            }else {
                System.out.println("El estudiante con el nombre: "+auxName+" no esta en tu lista de estudiantes");
            }
        }
    }
    public static void averageNoteStudents(ArrayList<Student> stL){
        double auxNote = 0.0;
        double averageNote = 0;
        for (Student st : stL){
            try {
                auxNote += st.getScore();
            }catch (ArithmeticException e){
                System.out.println("Se a producido un error de tipo aritmetico / "+e.getMessage());
            }
        }
        try {
            averageNote = auxNote / stL.size();
        }catch (ArithmeticException e){
            System.out.println("Se a producido un error de tipo aritmetico / "+e.getMessage());
        }
        if (averageNote == 0 && stL.isEmpty()){
            System.out.println("Agrega a un o mas alumnos, para poder ver la media de sus notas");
            return;
        }
        System.out.println("\nLa media de las notas de tus alumnos es de: "+averageNote+"\n");




    }
    public static void highQualifierStudent(ArrayList<Student> stL){
        double auxNote = -1;
        String auxName="";
        for (Student st : stL){
            if (auxNote < st.getScore()){
                auxName = st.getName();
                auxNote = st.getScore();
            }
        }
        if (auxName == "" || stL.isEmpty()){
            System.out.println("Primero agrege alumnos a su lista para saber la nota mas alta");
        }
        System.out.println("El alumno con la mayor nota es: "+auxName+"el cual tiene una nota de: "+auxNote);
    }
}
