package clases1;

public class Main {
    public static void main(String[] args) {
        University uniutn=new University("UTN");
        University ununcu=new University("Uncuyo");

        Student student1 = new Student("Naza");
        Student student2 = new Student("Rudy");
        Student student3 =new Student("Manu");

        student1.setUniversity(ununcu);
        student2.setUniversity(uniutn);

        student1.displayUniversity();
        student2.displayUniversity();
        student3.displayUniversity();
    }
}
