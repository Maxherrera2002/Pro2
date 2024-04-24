package clases;

public class Player {
    private String name;
    private String position;
    private int numbertshirt;

    public Player(String name, String position, int numbertshirt) {
        this.name = name;
        this.position = position;
        this.numbertshirt = numbertshirt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumbertshirt() {
        return numbertshirt;
    }

    public void setNumbertshirt(int numbertshirt) {
        this.numbertshirt = numbertshirt;
    }
}
