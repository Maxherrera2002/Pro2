package clases;

import java.util.ArrayList;
import java.util.List;

public class NationalTeam {
    private String colour;//color
    private String Country;//pais

    List<Athlete> athletes; //atletas

    public NationalTeam() {
        athletes=new ArrayList<>();
    }

    public NationalTeam(String colour, String country) {
        this.colour = colour;
        Country = country;
        this.athletes = new ArrayList<>();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
    public Athlete getAthlete(int i){
        return athletes.get(i-1);
    }
    public void addAthlete(Athlete athlete){
        athletes.add(athlete);
    }
}
