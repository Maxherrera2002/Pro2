package clases1;

public class Student {
    private String name;
    private University university;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void  displayUniversity(){
        if(university!=null){
            System.out.println(name+"va a la universidad "+ university.getName());
        }else {
            System.out.println(name+" no va a la ninguna universidad");
        }
    }
}
