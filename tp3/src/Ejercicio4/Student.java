package Ejercicio4;

public class Student {
    //Attributes
    private String name;
    private int age;
    private double score;

    //Constructors

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    //Getters y setters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //Methods
    public void showStudent(){
        System.out.println("Nombre del estudiante: "+getName() +
                "\nEdad: " +getAge()+
                "\nNota: "+getScore());

    }
}
