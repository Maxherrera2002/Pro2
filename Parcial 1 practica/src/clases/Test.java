package clases;

import java.util.ArrayList;
import java.util.List;

public class Test { // prueba
    private int code;
    private String title;//titulo
    private List<Athlete> athletes;//atletas

    public Test() {
        athletes=new ArrayList<>();
    }

    public Test(int code, String title) {
        athletes=new ArrayList<>();
        this.code = code;
        this.title = title;

    }

    public Test(int code, String title, List<Athlete> athletes) {
        this.code = code;
        this.title = title;
        this.athletes = athletes;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Athlete getAthlete(int i){
        i-=1;
        return athletes.get(i);
    }
    public void addAthlete(Athlete athlete){
        try {
            athletes.add(athlete);
        }catch (IllegalArgumentException e){
            System.out.println(
                    "Error: no se pudo agregar el atleta en el test //clas Test"
            );
        }
    }
}
