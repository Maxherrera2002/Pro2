package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Headquarters {//sede
    private int phase;
    private String date;
    private String hour;
    private Installation installation;
    private List<Test> testss;
    public Headquarters(Installation installation) {
        this.installation = installation;
        testss=new ArrayList<>();
    }

    public Headquarters(int phase, String date, String hour, Installation installation) {
        this.phase = phase;
        this.date = date;
        this.hour = hour;
        this.installation = installation;
        testss=new ArrayList<>();
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setInstallation(Installation installation) {
        this.installation = installation;
    }

    public int getPhase() {
        return phase;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public Installation getInstallation() {
        return installation;
    }
    public Test getTest(int i){
        return testss.get(i-1);
    }
    public void addTest(Test test){
        try {
            testss.add(test);
        }catch (IllegalArgumentException e){
            setDate("ERROR: no se pudo agregar una prueba //clas Headquarters");
        }
    }

}
